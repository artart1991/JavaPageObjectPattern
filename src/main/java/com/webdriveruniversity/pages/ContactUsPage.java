package com.webdriveruniversity.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsPage {

    private WebDriver driver;

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void sendForm(String email, String firstName, String lastName, String messageText) {
        WebElement firstNameInput = driver.findElement(By.name("first_name"));
        firstNameInput.click();
        firstNameInput.clear();
        firstNameInput.sendKeys(firstName);

        WebElement lastNameInput = driver.findElement(By.cssSelector("[name='last_name']"));
        lastNameInput.click();
        lastNameInput.clear();
        lastNameInput.sendKeys(lastName);

        WebElement emailInput = driver.findElement(By.xpath("//*[@placeholder='Email Address']"));
        emailInput.click();
        emailInput.clear();
        emailInput.sendKeys(email);

        WebElement messageInput = driver.findElement(By.name("message"));
        messageInput.click();
        messageInput.clear();
        messageInput.sendKeys(messageText);

        WebElement submitButton = driver.findElement(By.cssSelector("[type='submit']"));
        submitButton.click();
    }
}
