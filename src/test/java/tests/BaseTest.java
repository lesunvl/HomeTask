package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utils.ConfigReader;
import utils.Screenshot;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;
    private String filePath = "src/main/resources/configuration.properties";

    // build a new report using the html template
    private ExtentHtmlReporter htmlReporter;
    private ExtentReports extentReports;

    //helps to generate the logs in rest report
    protected ExtentTest logger;

    protected Test test;
    protected Screenshot screenshot;

    @BeforeTest
    public void startReport() throws IOException {

        //initializa the HtmlReporter and give location where to create the Report
        // build a new report using the html template
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/target/testReport.html");

        //configuration items to change look and feel of the report (design)
        //add content, manage tests etc...
        htmlReporter.config().setChartVisibilityOnOpen(true);
        htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
        htmlReporter.config().setDocumentTitle("Capitolis Reports");
        htmlReporter.config().setReportName(ConfigReader.readProperty(filePath, "Automation Test Results"));
        htmlReporter.config().setTheme(Theme.STANDARD);

        //initializa ExtentReports and attach to HtmlReporter
        extentReports = new ExtentReports();
        extentReports.attachReporter(htmlReporter);

        //To add system and enviroment info by using setSysteminfo method, also could use configuration.properties file
        extentReports.setSystemInfo("OS", System.getProperty("os.name") + " " + System.getProperty("os.version"));
        extentReports.setSystemInfo("Author", ConfigReader.readProperty(filePath, "author"));
        extentReports.setSystemInfo("Browser", ConfigReader.readProperty(filePath, "browser"));
    }

    @BeforeMethod
    public void setUp(Method method) throws IOException {
        test = method.getAnnotation(Test.class);

        logger = extentReports.createTest(method.getName());
        logger.info(test.description());

        initializeDriver();
        screenshot = new Screenshot(driver, logger);
    }



    @AfterMethod
    public void tearDown(ITestResult result){
        //logger.fail(result.getThrowable(), screenshot.takeScreenshot());
        if(result.getStatus() == ITestResult.SUCCESS) {
            logger.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " PASSED ", ExtentColor.GREEN));
        } else if(result.getStatus()==ITestResult.FAILURE) {
            logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() +" FAILED ", ExtentColor.RED));
        } else if(result.getStatus()==ITestResult.SKIP) {
            logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName() +" SKIPPED ", ExtentColor.YELLOW));
        }
        driver.quit();
    }


    @AfterTest
    public void ensReport(){
        extentReports.flush();
    }


    private void initializeDriver() {

        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("/Users/vladlesun/Downloads"));

        switch (ConfigReader.readProperty(filePath, "browser").toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Invalid browser type/name");
        }

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(ConfigReader.readProperty(filePath, "url"));

    }
  }


