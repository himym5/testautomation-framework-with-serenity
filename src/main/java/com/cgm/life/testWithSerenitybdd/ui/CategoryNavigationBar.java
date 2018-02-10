package com.cgm.life.testWithSerenitybdd.ui;

import com.cgm.life.testWithSerenitybdd.model.Category;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CategoryNavigationBar extends PageObject {

    public void selectCategory(Category category){

        $("*[role=navigation] *[role=list]").find(By.linkText(category.name())).click();

    }

}
