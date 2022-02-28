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

    @FindBy(css = "a[href='/jqueryui/menu']")
    public WebElement menuMain;

    @FindBy(xpath = "#ui-id-2")
    public WebElement menuEnable;

    @FindBy(id = "ui-id-4")
    public WebElement menuDownloads;

    @FindBy(xpath = "//div[@class='example']//div//li//a[contains(text(),'Excel')]")
    public WebElement menuExcel;


}