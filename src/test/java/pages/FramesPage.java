package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramesPage extends BasePage {
    protected WebDriver driver;

    public FramesPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "(//a[normalize-space()='iFrame'])[1]")
    public WebElement frameStart;

    @FindBy(xpath = "//iframe[@id='mce_0_ifr']")
    public WebElement bodyTinymce;

}