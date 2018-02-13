package com.cgm.life.testWithSerenitybdd.ui;

import com.cgm.life.testWithSerenitybdd.model.Category;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationBar {

    public static Target category(Category category) {
        return Target.the(category.name() + "category")
                .locatedBy("#s0-container > li:nth-child(3)")
                .of(category.name());
    }
}
