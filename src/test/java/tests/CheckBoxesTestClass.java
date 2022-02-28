package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.CheckBoxesPage;


public class CheckBoxesTestClass extends BaseTest {
    public static Logger log = LogManager.getLogger(BaseTest.class.getName());
    CheckBoxesPage boxes;

    public CheckBoxesTestClass() {
        boxes = new CheckBoxesPage(driver);

    }



    @Test
    public void test1() {

        driver.findElement(By.cssSelector("a[href='/checkboxes']")).click();

//        List<WebElement> oldBoxes = driver.findElements(By.name("ff"));
//
//        for (WebElement cb : oldBoxes) {
//            cb.click();
//            System.out.println(cb);
//        }
//        System.out.println("All check boxes have been checked");
//
//        List<WebElement> newBoxes = driver.findElements(By.tagName("option"));
//
//        for (WebElement cb2 : newBoxes) {
//            cb2.click();
//            System.out.println(cb2);
//        }
//        //verify the lists are not equal
//        if(!oldBoxes.equals(newBoxes)) {
//            System.out.println("Test Passed");
//        }


    }
}