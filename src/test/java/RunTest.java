import com.cgm.life.test.stepDefinitions.LoadPageSteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RunTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void test1() {
        LoadPageSteps loadPageSteps = new LoadPageSteps(driver);
        loadPageSteps.openLoadPage();
    }
}
