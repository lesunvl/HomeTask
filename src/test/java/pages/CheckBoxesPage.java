package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxesPage extends BasePage {
    protected WebDriver driver;

    public CheckBoxesPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "Password")
    public WebElement checkBox1;

    @FindBy(id = "Password")
    public WebElement checkBox2;

}
