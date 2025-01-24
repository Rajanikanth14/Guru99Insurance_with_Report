package tests;

import org.testng.annotations.Test;

import pageClasses.LoginPage;
import pageClasses.RegisterPage;
import pageClasses.RequestQuotationPage;
import utilities.BaseDriver;
import utilities.GenericMethods;

public class testRequestQoute extends BaseDriver 
{
    GenericMethods g;
	
	LoginPage l;
	
	@Test (priority = 3)
	public void ValidateRequestQuotationPage() throws Exception
	{
		g = new GenericMethods(driver);

		l= new LoginPage(driver);
		
		l.ValidateLoginPage();
		
		RequestQuotationPage r = new RequestQuotationPage(driver);
		
		r.ValidateRequestQuotationPage();
		
		Thread.sleep(3000);
	}

}
