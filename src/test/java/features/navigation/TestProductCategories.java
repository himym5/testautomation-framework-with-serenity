package features.navigation;

import com.cgm.life.testWithSerenitybdd.model.Category;
import com.cgm.life.testWithSerenitybdd.steps.NavigatingUser;
import com.cgm.life.testWithSerenitybdd.tasks.NavigateTo;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.junit.Test;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static org.hamcrest.Matchers.containsString;


@RunWith(SerenityRunner.class)
public class TestProductCategories {

    @Steps
    NavigatingUser mark;

    @Managed(driver = "chrome")
    WebDriver browser;

    @Test
    public void navigateToTheMotorsCategory(){
        // Given
        mark.isOnTheHomePage();

        // When
        mark.navigatesToCategory(Category.Motors);

        //Then
        mark.shouldSeePageTitleContaining("Auto Parts & Accessories, Tires & Wheels | Repair Manuals | " +
                "New & Used Cars, Trucks, RVs & Motorcycles | eBay Auto Parts and Vehicles");
    }

    @Test
    public void shouldBeAbleToViewMotorProducts(){
        Actor mike = Actor.named("Mike");
        mike.can(BrowseTheWeb.with(browser));

        when(mike).attemptsTo(NavigateTo.theCategory(Category.Motors));

        then(mike).should(seeThat(TheWebPage.title(), containsString("Auto Parts & Accessories, Tires & Wheels | Repair Manuals | " +
                "New & Used Cars, Trucks, RVs & Motorcycles | eBay Auto Parts and Vehicles")));
    }
}
