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

        @FindBy(id = "login")
        public WebElement checkbox;

        @FindBy(xpath = "//*")
        public WebElement removeBtn;

}
