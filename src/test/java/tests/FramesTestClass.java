package tests;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pages.FramesPage;

public class FramesTestClass extends BaseTest {
    public static Logger log = LogManager.getLogger(BaseTest.class.getName());

    @Test
    public void test1() {
        FramesPage frame = new FramesPage(driver);
        frame.frameStart.click();

        driver.switchTo().frame(0);
        driver.switchTo().frame(frame.bodyTinymce);

        frame.bodyTinymce.click();
        frame.bodyTinymce.clear();
        frame.bodyTinymce.sendKeys("Vlad");

        String strExpected = "Vlad";
        String strActual = frame.bodyTinymce.getText();

        System.out.println(strExpected.equals(strActual)); // it must print true







    }
}
