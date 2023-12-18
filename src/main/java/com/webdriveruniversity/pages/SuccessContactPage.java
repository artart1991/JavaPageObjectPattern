package com.webdriveruniversity.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessContactPage {

    private WebDriver driver;

    public SuccessContactPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getSuccessText() {
        return driver.findElement(By.tagName("h1")).getText();
    }
}
