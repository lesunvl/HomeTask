package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FramesTest extends BaseTest {

    @Test
    public void test1() {
        final WebDriver frame = driver.switchTo().frame(0);




    }
}
