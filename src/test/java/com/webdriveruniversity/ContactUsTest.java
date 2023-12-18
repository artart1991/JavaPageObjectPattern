package com.webdriveruniversity;

import com.webdriveruniversity.pages.ContactUsPage;
import com.webdriveruniversity.pages.SuccessContactPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ContactUsTest {

    private WebDriver driver;

    @Before
    public void setUp() {

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    public void shouldSendCorrectlyContactUsMessage() {
        driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");

        ContactUsPage contactUsPage = new ContactUsPage(driver);
        contactUsPage.sendForm("wojtek@wojtek.com", "Wojtek", "brzeczyszcyzkiewicz",
                "To jest moja wiadomosc");

        SuccessContactPage successContactPage = new SuccessContactPage(driver);
        Assert.assertEquals("Thank You for your Message!", successContactPage.getSuccessText());
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
