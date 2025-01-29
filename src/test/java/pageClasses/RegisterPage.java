package pageClasses;


import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Framework.Reporter;
import utilities.WebControls;


public class RegisterPage extends WebControls
{
	
	@FindBy(xpath = "//a[@class='btn btn-default']")
	private static WebElement btnacceptReg;
	
	@FindBy(id = "user_title")
	private static WebElement btnTitle;
	
	@FindBy(id = "user_firstname")
	private static WebElement txtfirstname;
	
	@FindBy(id = "user_surname")
	private static WebElement txtsurname;
	
	@FindBy(id = "user_phone")
	private static WebElement txtphone;
	
	@FindBy(id = "user_dateofbirth_1i")
	private static WebElement selyear;
	
	@FindBy(id = "user_dateofbirth_2i")
	private static WebElement selmonth;
	
	@FindBy(id = "user_dateofbirth_3i")
	private static WebElement seldate;
	
	@FindBy(xpath = "//input[@type='radio']")
	private static List<WebElement> selradio;
	
	@FindBy(id = "user_licenceperiod")
	private static WebElement sellicenceperiod;
		
	@FindBy(id = "user_occupation_id")
	private static WebElement seloccupation;
	
	@FindBy(id = "user_address_attributes_street")
	private static WebElement txtaddress;
	
	@FindBy(id = "user_address_attributes_city")
	private static WebElement txtCity;
	
	@FindBy(id = "user_address_attributes_county")
	private static WebElement txtcountry;
	
	@FindBy(id = "user_address_attributes_postcode")
	private static WebElement txtpostcode;
	
	@FindBy(id = "user_user_detail_attributes_email")
	private static WebElement txtemail;
	
	@FindBy(id = "user_user_detail_attributes_password")
	private static WebElement txtPassword;
	
	@FindBy(id = "user_user_detail_attributes_password_confirmation")
	private static WebElement txtConfirmPassword;
		
	@FindBy(xpath = "//input[@name='submit']")
	private static WebElement btncreate;
	
	
	public void addRegisterPage(String Title,String Firstname,String Surname, String Phone,String Dob_Y,String Dob_M, String Dob_D,String Licence_Period, String Occupation,String Add_Street, String City, String County, String Postcode,String Email,String Password, String Confirmpassword) throws InterruptedException {
		
		boolean retVal;
		
		retVal = clickElement(btnacceptReg);
		Reporter.log(retVal,"Clicked on Register Tab Succefully in Guru99 Insurance page",
				"Failed to Clicked on Register Tab in Guru99 Insurance page");
		
		retVal = selectItemWithText(btnTitle, Title);
		Reporter.log(retVal,"Selected the Title from dropdrown list Succefully in Guru99 Insurance Register page",
				"Failed to Select the Title from dropdrown list in Guru99 Insurance Register page");
		 
		retVal= setEditValue(txtfirstname, Firstname);
		Reporter.log(retVal,"Customer First name entered Succefully in Guru99 Insurance Register page",
				"Failed to Enter Customer First name in Guru99 Insurance Register page");
		
        retVal= setEditValue(txtsurname, Surname);
		Reporter.log(retVal,"Customer Surname entered Succefully in Guru99 Insurance Register page",
				"Failed to Enter Customer Surname in Guru99 Insurance Register page");
		
        retVal= setEditValue(txtphone, Phone);
		Reporter.log(retVal,"Customer Phone number entered Succefully in Guru99 Insurance Register page",
				"Failed to Enter Phone Number in Guru99 Insurance Register page");
		
        retVal = selectItemWithText(selyear, Dob_Y);
		Reporter.log(retVal,"Selected the Year of birth from dropdrown list Succefully in Guru99 Insurance Register page",
				"Failed to Select the Year of birth from dropdrown list in Guru99 Insurance Register page");
		
		retVal = selectItemWithText(selmonth, Dob_M);
		Reporter.log(retVal,"Selected the Month of birth from dropdrown list Succefully in Guru99 Insurance Register page",
					"Failed to Select the Month of birth month from dropdrown list in Guru99 Insurance Register page");
			
		retVal = selectItemWithText(seldate, Dob_D);
		Reporter.log(retVal,"Selected the Date of birth  from dropdrown list Succefully in Guru99 Insurance Register page",
						"Failed to Select the Date of birth from dropdrown list in Guru99 Insurance Register page");
		
		retVal = selectItemWithText(sellicenceperiod, Licence_Period);
		Reporter.log(retVal,"Selected the Licence Period Succefully in Guru99 Insurance Register page",
						"Failed to Select Licence Period in Guru99 Insurance Register page");
		
		retVal = selectItemWithText(seloccupation, Occupation);
		Reporter.log(retVal,"Selected the Occupation Succefully in Guru99 Insurance Register page",
						"Failed to Select Occupation in Guru99 Insurance Register page");
		
        retVal= setEditValue(txtaddress, Add_Street);
		Reporter.log(retVal,"Customer Address Street entered Succefully in Guru99 Insurance Register page",
				"Failed to Enter Customer Address Street in Guru99 Insurance Register page");
		
		retVal = setEditValue(txtCity, City);
		Reporter.log(retVal,"City entered Succefully in Guru99 Insurance Register page",
				"Failed to Enter City in in Guru99 Insurance Register page");
		
		retVal = setEditValue(txtcountry, County);
		
		Reporter.log(retVal,"Country name entered Succefully in Guru99 Insurance Register page",
				"Failed to Enter Country name in Guru99 Insurance Register page");
		
		retVal = setEditValue(txtpostcode, Postcode);
		
		Reporter.log(retVal,"Postcode entered Succefully in Guru99 Insurance Register page",
				"Failed to Enter Postcode in Guru99 Insurance Register page");
		
		retVal = setEditValue(txtemail, Email);
		Reporter.log(retVal,"Email Id entered Succefully in Guru99 Insurance Register page",
				"Failed to Enter Email Id in Guru99 Insurance Register page");
		
		retVal = setEditValue(txtPassword, Password);
		Reporter.log(retVal,"Password entered Succefully in Guru99 Insurance Register page",
				"Failed to Enter Password in Guru99 Insurance Register page");
		
		retVal = setEditValue(txtConfirmPassword, Confirmpassword);
		Reporter.log(retVal,"Confirm Password entered Succefully in Guru99 Insurance Register page",
				"Failed to Enter Confirm Password in Guru99 Insurance Register page");
		
		retVal = clickElement(btncreate);

		Reporter.log(retVal, "Clicked on create Button Succefully in Guru99 Insurance Register page",
				"Failed to Click on create Button in Guru99 Insurance Register page");
					
	}

}
