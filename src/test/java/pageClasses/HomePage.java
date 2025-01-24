package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GenericMethods;

public class HomePage 
{
	WebDriver driver;
	GenericMethods g;
	 
	 
	@FindBy(xpath = "//div[contains(text(),\"Signed\")]//following::h4")
	WebElement txtverify;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
			
		PageFactory.initElements(driver, this);			
	 }
	 
	 public void ValidateHomePage() throws Exception
	 {
		g=new GenericMethods(driver);
		
		g.verifyText(txtverify, "rahulsirimalla79@gmail.com");
		
		
	 }


}