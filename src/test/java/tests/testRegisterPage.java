package tests;

import org.testng.annotations.Test;

import pageClasses.HomePage;
import pageClasses.LoginPage;
import pageClasses.RegisterPage;

import utilities.BaseDriver;
import utilities.GenericMethods;


public class testRegisterPage extends BaseDriver 
{
    GenericMethods g;
	
	RegisterPage r;
	
	LoginPage l;
	
	HomePage h;
	
		
	@Test 
	
	public  void validateRegisterPage() throws Exception
	{
		g = new GenericMethods(driver);
		
		r = new RegisterPage(driver);
		
	    r.ValidateRegisterPage();
		
		Thread.sleep(3000);
		
	}
	
	
	

}