package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class MenuPage extends BasePage {
    protected WebDriver driver;

    public MenuPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }




}