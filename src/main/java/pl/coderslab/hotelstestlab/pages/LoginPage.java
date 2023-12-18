package pl.coderslab.hotelstestlab.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    @FindBy(id= "email_create")
    private WebElement emailInput;

    @FindBy(name = "SubmitCreate")
    private WebElement submitCreateButton;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToCreateAccountForm(String email) {
        emailInput.click();
        emailInput.clear();
        emailInput.sendKeys(email);

       submitCreateButton.click();
    }
}
