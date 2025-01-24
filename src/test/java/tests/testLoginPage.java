package tests;

import org.testng.annotations.Test;

import pageClasses.LoginPage;
import utilities.BaseDriver;
import utilities.GenericMethods;

public class testLoginPage extends BaseDriver 
{
	GenericMethods g;
	LoginPage l;
	
	@Test
	public void validateLoginPage() throws Exception
	{
		
		g = new GenericMethods(driver);
		
		l= new LoginPage(driver);
		
		l.ValidateLoginPage();
		
		Thread.sleep(3000);
	}
	

}
