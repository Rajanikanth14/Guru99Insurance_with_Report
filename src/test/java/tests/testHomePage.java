package tests;

import java.util.HashMap;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Framework.Excellib;
import pageClasses.HomePage;
import pageClasses.LoginPage;
import utilities.BaseTestCalss;


public class testHomePage extends BaseTestCalss 
{
	@Test
	public static void TC_003_Insurance_HomePage() throws Exception
	{
        String filepath= TESTDATA_PATH + TESTDATA_FILE;
		
		HashMap<String, String> data=Excellib.getRowData2(filepath, "Login", "TC_001_Insurance_LoginPage");
				
		LoginPage glogin=PageFactory.initElements(driver, LoginPage.class);
				
		glogin.loginPage(data.get("Uname"), data.get("Password"));
					
		HomePage ghome=PageFactory.initElements(driver, HomePage.class);
		
		ghome.ValidateHomePage();
		
		
	}

}
