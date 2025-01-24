package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GenericMethods;

public class LoginPage 
{
	 WebDriver driver;
	 GenericMethods g;
	 
	 
	 @FindBy(id = "email")
	 WebElement txtemail;
	 
	 @FindBy(id = "password")
	 WebElement txtpassword;
	 
	 @FindBy(xpath = "//input[@name='submit']")
	 WebElement btnlogin;
	 
	 
	 
	 public LoginPage(WebDriver driver)
	 {
		 this.driver = driver;
			
		 PageFactory.initElements(driver, this);			
	 }
	 
	 public void ValidateLoginPage() throws Exception
	 {
		 g=new GenericMethods(driver);
		 
		 g.setEditValue(txtemail, "rahulsirimalla79@gmail.com");
		 
		 g.setEditValue(txtpassword, "kanth77");
		 
		 g.clikOnElement(btnlogin);
		 
		 
	 }

}