package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import tests.BaseTest;

public class DynamicControlsPage extends BaseTest {
    protected WebDriver driver;

    public DynamicControlsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
