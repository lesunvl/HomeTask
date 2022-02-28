package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class BasicAuthPage extends BasePage {
    protected WebDriver driver;

    public BasicAuthPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public String usernameField;
    public String passwordField;


    public void logIn(String username, String password) {

        String str = "https://" + usernameField + ":" + passwordField + "@" +
                "the-internet.herokuapp.com/basic_auth";
    }
}