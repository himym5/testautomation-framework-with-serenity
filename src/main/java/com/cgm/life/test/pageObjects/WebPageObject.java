package com.cgm.life.test.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageObject extends BasePageObject {

    private WebDriver driver;

    public WebPageObject(WebDriver driver) {
        this.driver = driver;
    }
}
