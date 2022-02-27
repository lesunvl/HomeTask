package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.CheckBoxesPage;


public class CheckBoxesTestClass extends CheckBoxesPage {

    public CheckBoxesTestClass(WebDriver driver) {
        super(driver);
    }

    @Test
    public void test1(){
        CheckBoxesTestClass check = new CheckBoxesTestClass(driver);
        if(check.allcheckBox.isSelected()){
            System.out.println("Checkbox is ON");
        } else {
            System.out.println("Checkbox is OFF");
        }

        check.allcheckBox.click();

    }
}