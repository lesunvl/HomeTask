package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasicAuthPage;

public class BasicAuthTestClass extends BaseTest {
    BasicAuthPage basic;

    @BeforeMethod
    public void setUp() {
        basic = new BasicAuthPage(driver);
    }

    @Test(testName = "Succesfull login")
    public void test1() {
        basic.logIn("Username", "Pass");
        logger.pass("This is pass message detail");
        screenshot.takeScreenshotAndLog();
    }


    @Test(testName = "Wrong Pass")
    public void test2() {
        basic.logIn("Username", "Pass");
        logger.pass("This is pass message detail");
        screenshot.takeScreenshotAndLog();
    }

    @Test(testName = "Wrong Username")
    public void test3() {
        basic.logIn("Username", "Pass");
        logger.pass("This is pass message detail");
        screenshot.takeScreenshotAndLog();
    }

    @Test(testName = "Empty values")
    public void test4() {
        basic.logIn("Username", "Pass");
        logger.pass("This is pass message detail");
        screenshot.takeScreenshotAndLog();
    }

    @Test(testName = "Capital letters")
    public void test5() {
        basic.logIn("Username", "Pass");
        logger.pass("This is pass message detail");
        screenshot.takeScreenshotAndLog();
    }
}

//    @AfterMethod
//    public void BasicAuthTest() {
//        String actualURL = "";
//        String expectedURL = driver.getCurrentUrl();
//
//        if(actualURL.equalsIgnoreCase(expectedURL)) {
//            System.out.println("Test Passed")
//        } else {
//            System.out.println("Test Failed");
//        }
//    }

//}
