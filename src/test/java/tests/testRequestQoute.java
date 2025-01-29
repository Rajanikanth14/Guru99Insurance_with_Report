package tests;

import java.util.HashMap;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Framework.Excellib;
import pageClasses.LoginPage;
import pageClasses.RequestQuotationPage;
import utilities.BaseTestCalss;


public class testRequestQoute extends BaseTestCalss 
{
   
	@Test
	public void ValidateRequestQuotationPage() throws Exception
	{
		  // login Page
		
		  String filepath= TESTDATA_PATH + TESTDATA_FILE;
			
		  HashMap<String, String> data=Excellib.getRowData2(filepath, "Login", "TC_001_Insurance_LoginPage");
					
		  LoginPage glogin=PageFactory.initElements(driver, LoginPage.class);
					
		  glogin.loginPage(data.get("Uname"), data.get("Password"));
		  
		  
		  // Request Quote page
		  
		  HashMap<String, String> data1=Excellib.getRowData2(filepath, "Request_Q", "TC_001_Insurance_RequestQuotePage");
			
		  RequestQuotationPage ReqQuote=PageFactory.initElements(driver, RequestQuotationPage.class);
					
		  ReqQuote.ValidateRequestQuotationPage(data1.get("Breakdowncover"),data1.get("incidents"),data1.get("Registration"),data1.get("Annualmileage"),data1.get("Estimatedvalue"),data1.get("ParkingLocation"),data1.get("DOY"),data1.get("DOM"),data1.get("DOD"));
			
			
			
	}

}
