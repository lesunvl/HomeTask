package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pages.CheckBoxesPage;

public class CheckBoxesTestClass extends BaseTest {
    public static Logger log = LogManager.getLogger(BaseTest.class.getName());
    CheckBoxesPage boxes;

    public CheckBoxesTestClass() {
        boxes = new CheckBoxesPage(driver);

    }
}