package pl.coderslab.hotelstestlab;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.coderslab.hotelstestlab.pages.AccountCreationFormPage;
import pl.coderslab.hotelstestlab.pages.HeaderPage;
import pl.coderslab.hotelstestlab.pages.LoginPage;
import pl.coderslab.hotelstestlab.pages.MyAccountPage;

import java.time.Duration;

public class AccountCreationTest {

    private static WebDriver driver;

    @Before
    public void setUp() {

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    public void shouldCreateAnAcoount() {

        driver.get("https://hotel-testlab.coderslab.pl/en/");

        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.goToSignInPage();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.goToCreateAccountForm("email1233445@email.com");

        AccountCreationFormPage accountCreationFormPage = new AccountCreationFormPage(driver);

        accountCreationFormPage.fulfillFormAndSubmit("Jola", "Lojalna", "jolanielojalna");

        MyAccountPage accountPage = new MyAccountPage(driver);

        Assert.assertTrue(accountPage.getSuccessText().contains("Your account has been created."));
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
