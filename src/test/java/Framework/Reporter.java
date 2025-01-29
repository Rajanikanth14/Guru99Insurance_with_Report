package Framework;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Config.Configuration;

public class Reporter extends Configuration 
{

    public static ExtentReports extent;
    public static ExtentTest test;
    public static String resultfile;

    // ================================================
    public static void initializeReports() 
    {

        String resultfolder = createResultFolder();

        resultfile = resultfolder + RESULTS_FILE;
        
        // Setting up Spark reporter
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(resultfile);
    //    sparkReporter.config().setDocumentTitle("Test Automation Report");
        sparkReporter.config().setReportName("Automation Test Report");

     // Set the theme to DARK
        sparkReporter.config().setTheme(Theme.DARK);
     
       
        
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        extent.setSystemInfo("Project Name", PROJECTNAME);
        extent.setSystemInfo("Environment", ENVIRONMENT);
        extent.setSystemInfo("Release Name", RELEASENAME);       

    }

    // ================================================
    public static void startTest(String testcasename) {
        test = extent.createTest(testcasename);
    }

    // ================================================
    public static void closeTest() {
  //       extent.removeTest(test);
    }

    // ================================================
    public static void flushReport() {
        extent.flush();
        System.out.println("Report flushed successfully to: " + resultfile); 
    }

    // ================================================
    public static void logEvent(String status, String stepDescription) {

        switch (status) {

            case "pass":
                test.pass(stepDescription);
                break;

            case "fail":
                test.fail(stepDescription).addScreenCaptureFromBase64String(getScreenShot());
                break;

            case "warning":
                test.warning(stepDescription).addScreenCaptureFromBase64String(getScreenShot());
                break;

            case "info":
                test.info(stepDescription);
                break;

            default:
                System.out.println("Invalid reporting status");
                break;
        }
    }

    // ================================================
    public static void log(boolean status, String passMessage, String failMessage) {
        if (status)
            logEvent("pass", passMessage);
        else
            logEvent("fail", failMessage);
    }

    // ================================================
    public static String getScreenShot() {
        TakesScreenshot sht = (TakesScreenshot) driver;
        String screenshotfile = sht.getScreenshotAs(OutputType.BASE64);
        return "data:image/png;base64,"+screenshotfile;
    }

    // ================================================
    public static String createResultFolder() {
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

        File file = new File(RESULTS_PATH + timeStamp.replace(".", "-"));
        if (!file.exists())
            file.mkdirs();
        String folderpath = RESULTS_PATH + timeStamp.replace(".", "-");
        
        return folderpath;
    }
}
