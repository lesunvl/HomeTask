package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utils.ConfigReader;

public class TempTest {
    public static void main(String[] args) {
        String s = ConfigReader.readProperty("src/main/resources/configuration.properties", "browser");
        System.out.println(s);
        Logger log = LogManager.getLogger(BaseTest.class.getName());
    }
}
