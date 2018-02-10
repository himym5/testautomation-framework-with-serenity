package features.navigation;

import com.cgm.life.testWithSerenitybdd.model.Category;
import com.cgm.life.testWithSerenitybdd.steps.NavigatingUser;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.junit.Test;


@RunWith(SerenityRunner.class)
public class TestProductCategories {

    @Steps
    NavigatingUser mark;

    @Managed
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
}
