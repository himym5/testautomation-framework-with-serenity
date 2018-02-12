package com.cgm.life.testWithSerenitybdd.ui;

import com.cgm.life.testWithSerenitybdd.model.Category;
import net.serenitybdd.screenplay.targets.Target;

public class NavigationBar {
    public static Target category(Category category) {
        return Target.the(category.name() + "category")
                .locatedBy("//td[@class='cat']/a[contains(text(),'{0}')]")
                .of(category.name());
    }
}
