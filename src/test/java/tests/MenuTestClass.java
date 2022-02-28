package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.Test;
import pages.MenuPage;

import java.io.File;

public class MenuTestClass extends BaseTest{
    public static Logger log = LogManager.getLogger(BaseTest.class.getName());

    MenuPage menus;
     @Test
    public void test() throws InterruptedException {
         menus = new MenuPage(driver);

         menus.menuMain.click();
         Thread.sleep(3000);
         menus.menuEnable.click();
         menus.menuDownloads.click();
         menus.menuExcel.click();
String filePath1 = "/Users/vladlesun/Downloads";

         File files = new File(filePath1);
         File[] listFiles = files.listFiles();
         boolean found  = false;
         File f = null;
         for (File all:listFiles) {
             if (all.isFile()) {
                 String target_file = all.getName();
                 System.out.println(all.getName());
                 if (target_file.matches("menu.xls")) {
                     f = new File(target_file);
                     found = true;
                 }
             }
         }
         Assert.assertTrue("Downloaded file is not found", found);
         f.deleteOnExit();

     }
}
