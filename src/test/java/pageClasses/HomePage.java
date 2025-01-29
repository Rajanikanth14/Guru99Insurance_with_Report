package pageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Framework.Reporter;
import utilities.WebControls;

 
public class HomePage extends WebControls
{
	
	@FindBy(xpath = "//div[contains(text(),\"Signed\")]//following::h4")
	WebElement txtverify;
	
	public void ValidateHomePage(){

		boolean retVal;

		retVal = verifyText(txtverify, "rahulsirimalla79@gmail.com");
		Reporter.log(retVal, "Verified Text Succefully in Guru99 Insurance Home page",
				"Failed to verify Text in Guru99 Insurance Home page");
		
	

	}
	
	


}