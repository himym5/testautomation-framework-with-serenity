package com.cgm.life.test.pageObjects;

import com.cgm.life.test.utils.properties.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoadPageObject {
    private WebDriver driver;

    public LoadPageObject(WebDriver driver){
        this.driver = driver;
    }

    public void loadPageURL(String url) {
        driver.get(Properties.getBaseUrl() + url);
    }

}
