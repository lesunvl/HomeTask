package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicControlsPage extends BasePage {
    protected WebDriver driver;

    public DynamicControlsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

        @FindBy(xpath = "(//a[normalize-space()='iFrame'])[1]")
        public WebElement checkbox;

        @FindBy(xpath = "//button[normalize-space()='Remove']")
        public WebElement removeBtn;

}
