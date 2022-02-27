package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DynamicControlsPage;

public class DynamicControlsTestClass extends BaseTest {

    DynamicControlsPage control;

    @BeforeMethod
    public void setUp() {
        control = new DynamicControlsPage(driver);
    }


    @Test
    public void test(){

        // The isSelected() method returns a boolean value of true if the checkbox is checked false otherwise.
        control.checkbox.isSelected();

        control.removeBtn.click();
        control.checkbox.isDisplayed();


    }
}
