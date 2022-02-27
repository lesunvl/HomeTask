package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.BaseTest;

import java.util.List;

public class CheckBoxesPage extends BasePage {
    protected WebDriver driver;

    public CheckBoxesPage(WebDriver driver) {
        super(driver);
       this.driver = driver;
    }

//    public static void main(String[] args)

//    @FindBy(xpath = "//*[contains(@class,'x-grid-tree-node-leaf')]")
//    protected List<WebElement> allcheckBox;

    @FindBy(xpath = "//*[contains(@class,'x-grid-tree-node-leaf')]")
    protected WebElement allcheckBox;

}
