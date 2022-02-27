package tests;

import org.testng.annotations.Test;
import pages.FramesPage;

public class FramesTestClass extends BaseTest {

    @Test
    public void test1() {
        FramesPage frame = new FramesPage(driver);
        driver.switchTo().frame(0);
        driver.switchTo().frame(frame.frameChild);

        frame.bodyTinymce.sendKeys("Vlad");

        String strExpected = "Vlad";
        String strActual = frame.bodyTinymce.getText();

        System.out.println(strExpected.equals(strActual)); // it must print true







    }
}
