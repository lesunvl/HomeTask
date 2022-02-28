package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasicAuthPage;

public class BasicAuthTestClass extends BaseTest {
    public static Logger log = LogManager.getLogger(BaseTest.class.getName());
    BasicAuthPage basic;

    @BeforeMethod
    public void setUp() {
        basic = new BasicAuthPage(driver);
        driver.findElement(By.cssSelector("a[href='/basic_auth']")).click();

    }

    @Test(testName = "Succesfull login")
    public void test1() {
        basic.logIn("admin", "admin");
        logger.pass("This is pass message detail");
        screenshot.takeScreenshotAndLog();

    }

    @Test(testName = "Wrong Pass")
    public void test2() {
        basic.logIn("admin1", "gsggh");
        logger.pass("This is pass message detail");
        screenshot.takeScreenshotAndLog();
    }

    @Test(testName = "Wrong Username")
    public void test3() {
        basic.logIn("sfljghs", "admin");
        logger.pass("This is pass message detail");
        screenshot.takeScreenshotAndLog();
    }

    @Test(testName = "Empty values")
    public void test4() {
        basic.logIn("", "");
        logger.pass("This is pass message detail");
        screenshot.takeScreenshotAndLog();
    }

    @Test(testName = "Capital letters")
    public void test5() {
        basic.logIn("ADMIN", "ADMIN");
        logger.pass("This is pass message detail");
        screenshot.takeScreenshotAndLog();
    }

    @AfterMethod
    public void Validation() {
        String actualURL = "http://the-internet.herokuapp.com/basic_auth";
        String expectedURL = driver.getCurrentUrl();

        if(actualURL.equalsIgnoreCase(expectedURL)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }

}
