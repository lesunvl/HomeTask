package tests;

import org.junit.Assert;
import org.testng.annotations.Test;
import pages.MenuPage;

import java.io.File;

public class MenuTestClass extends BaseTest{

    MenuPage menus;
     @Test
    public void test(){
         menus = new MenuPage(driver);

         menus.menuMain.click();
         menus.menuEnable.click();
         menus.menuDownloads.click();
         menus.menuExcel.click();


         File files = new File(System.getProperty("user.dir"));
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
         Assert.assertTrue(found, "Downloaded file is not found");
         f.deleteOnExit();

     }
}
