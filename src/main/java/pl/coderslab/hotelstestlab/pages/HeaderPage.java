package pl.coderslab.hotelstestlab.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage {

    private WebDriver driver;

    @FindBy(css = ".user_login")
    private WebElement signInButton;

    public HeaderPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToSignInPage() {
       signInButton.click();
    }
}
