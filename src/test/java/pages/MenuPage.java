package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MenuPage extends BasePage {
    protected WebDriver driver;

    public MenuPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "Password")
    public WebElement menuMain;

    @FindBy(id = "Password")
    public WebElement menuEnable;

    @FindBy(id = "login")
    public WebElement menuDownloads;

    @FindBy(xpath = "//*")
    public WebElement menuExcel;


}