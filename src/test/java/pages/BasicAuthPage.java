package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BasicAuthPage extends BasePage {
    protected WebDriver driver;

    public BasicAuthPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "Password")
    public WebElement usernameField;

    @FindBy(id = "login")
    public WebElement passwordField;

    @FindBy(xpath = "//*")
    public WebElement clickBtn;

    public void logIn(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        clickBtn.click();
    }


}