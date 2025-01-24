package utilities;
import java.io.File;
import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import Config.Configuration;
import Framework.Reporter1;

public class BaseDriver extends Configuration {

	// =========================================================================

	@BeforeSuite

	public void setupReport() {
		System.out.println("*************** Intializing Test Suite**************");
		Reporter1.initializeReports();

		System.out.println("*************** Test Suite is initialized succefully**************");

	}
	// ====================================================================
	
	

	@BeforeMethod
	
	public void launchBrowser(Method method)
	{
		CURRENT_TESTCASE=method.getName();
		
		Reporter1.startTest(CURRENT_TESTCASE);
		
		System.out.println("<<TestStart>> TestCase Name " + CURRENT_TESTCASE + "<<TestStart>>");
		
		switch(BROWSER_NAME)
		{
		case "FF":
			
			driver=new FirefoxDriver();
		break;
		
		
		case"IE":
			
			driver=new InternetExplorerDriver();
			break;
			
		case"CHROME":
			
			driver=new ChromeDriver();
			break;
			
		case"EDGE":
			
			driver=new EdgeDriver();
			break;
			
			default:System.out.println("Incorrect browser name ");
		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get(APP_URL);
		
	}
	//=====================================================
	
	
	
	
	@AfterMethod
	public void closeBrowser() 
	{
		
		System.out.println("Close Browser is initiated");
		
		Reporter1.closeTest();
		driver.close();
		System.out.println("<<TestEnd>> TestCase Name " + CURRENT_TESTCASE + "<<TestEnd>>");
		System.out.println();
		
	}

	
	@AfterSuite

	public void flushReportsAndOpen() 
	{

		try

		{
			Reporter1.flushReport();
			Thread.sleep(2000);

		} 
		catch (Exception e) 
		{
			e.printStackTrace();

		}

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Reporter1.resultfile);
		driver.navigate().refresh();

	}
	
	


	// ===============================

}