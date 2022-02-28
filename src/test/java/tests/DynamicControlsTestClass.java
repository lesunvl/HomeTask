package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DynamicControlsPage;

public class DynamicControlsTestClass extends BaseTest {
    public static Logger log = LogManager.getLogger(BaseTest.class.getName());

    DynamicControlsPage control;

    @BeforeMethod
    public void setUp() {
        control = new DynamicControlsPage(driver);
        driver.findElement(By.cssSelector("a[href='/dynamic_controls']")).click();
    }


    @Test
    public void test(){

        // The isSelected() method returns a boolean value of true if the checkbox is checked false otherwise.
//        control.checkbox.isSelected();

        control.removeBtn.click();
        control.checkbox.isDisplayed();


    }
}
