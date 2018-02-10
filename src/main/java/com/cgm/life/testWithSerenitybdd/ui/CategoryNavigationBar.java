package com.cgm.life.testWithSerenitybdd.ui;

import com.cgm.life.testWithSerenitybdd.model.Category;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryNavigationBar extends PageObject {

    @FindBy(className = "hl-cat-nav__js-tab")
    WebElement navigationItemName;

    public void selectCategory(Category category){

        navigationItemName.click();

        //$("*[role=navigation] *[role=list]").find(By.linkText(category.name())).click();

    }

}
