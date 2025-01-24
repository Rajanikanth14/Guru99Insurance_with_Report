package tests;

import org.testng.annotations.Test;

import pageClasses.HomePage;
import pageClasses.LoginPage;
import pageClasses.RegisterPage;
import utilities.BaseDriver;
import utilities.GenericMethods;

public class testHomePage extends BaseDriver 
{
    GenericMethods g;
	
	LoginPage l;
	
	HomePage h;
	
	@Test
	public void ValidateHomePage() throws Exception
	{
		g = new GenericMethods(driver);
		
        l= new LoginPage(driver);
    		
		l.ValidateLoginPage();
		
		h= new HomePage(driver);
		
		h.ValidateHomePage();
		
		Thread.sleep(3000);
	}

}
