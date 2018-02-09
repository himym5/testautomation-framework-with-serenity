package com.cgm.life.test.stepDefinitions;

import com.cgm.life.test.pageObjects.LoadPageObject;
import org.openqa.selenium.WebDriver;

public class LoadPageSteps {
    private WebDriver driver;
    private LoadPageObject loadPageObject;

    public LoadPageSteps(WebDriver driver){
        this.driver = driver;
        loadPageObject = new LoadPageObject(driver);
    }

    public void openLoadPage() {
        loadPageObject.loadPageURL("#/start");
    }
}
