package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.CheckBoxesPage;

import java.util.List;

public class CheckBoxesTestClass extends BaseTest {
    CheckBoxesPage boxes;

    public CheckBoxesTestClass() {
        boxes = new CheckBoxesPage(driver);

    }

    @Test
    public void test1() {

        // Traverse the web elements to extrat the text. Text gets added to the 'currentOptions' List
        List<WebElement> boxes = driver.findElements(By.tagName("option"));

        for (WebElement cb : boxes) {
            cb.click();
        }
        System.out.println("All check boxes have been checked");
    }

}