package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.BaseTest;

public class FramesPage extends BaseTest {
    protected WebDriver driver;

    public FramesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Inputs")
    public WebElement frame;

    @FindBy(linkText = "User-Mgt")
    public WebElement bodyTinymce;

}