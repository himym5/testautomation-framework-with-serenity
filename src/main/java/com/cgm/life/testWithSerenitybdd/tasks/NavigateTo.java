package com.cgm.life.testWithSerenitybdd.tasks;

import com.cgm.life.testWithSerenitybdd.model.Category;
import com.cgm.life.testWithSerenitybdd.ui.EbayHomePage;
import com.cgm.life.testWithSerenitybdd.ui.NavigationBar;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class NavigateTo implements Task {
    private final Category category;

    private EbayHomePage theEbayHomePage;

    public NavigateTo(Category category) {
        this.category = category;
    }

    @Override
    @Step("{0} navigates to the #category category")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(theEbayHomePage),
                Click.on(NavigationBar.category(category))
        );
    }

    public static Performable theCategory(Category category) {
        return Instrumented.instanceOf(NavigateTo.class).withProperties(category);
    }
}
