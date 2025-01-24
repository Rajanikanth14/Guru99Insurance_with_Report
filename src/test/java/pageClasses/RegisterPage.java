package pageClasses;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utilities.GenericMethods;



public class RegisterPage 
{
	
	
    WebDriver driver;
    GenericMethods g;
	
	@FindBy(xpath = "//a[@class='btn btn-default']")
	WebElement btnacceptReg;
	
	@FindBy(id = "user_title")
	WebElement Title;
	
	@FindBy(id = "user_firstname")
	WebElement txtfirstname;
	
	@FindBy(id = "user_surname")
	WebElement txtsurname;
	
	@FindBy(id = "user_phone")
	WebElement txtphone;
	
	@FindBy(id = "user_dateofbirth_1i")
	WebElement selyear;
	
	@FindBy(id = "user_dateofbirth_2i")
	WebElement selmonth;
	
	@FindBy(id = "user_dateofbirth_3i")
	WebElement seldate;
	
	@FindBy(xpath = "//input[@type='radio']")
	List<WebElement> selradio;
	
	@FindBy(id = "user_licenceperiod")
	WebElement sellicenceperiod;
		
	@FindBy(id = "user_occupation_id")
	WebElement seloccupation;
	
	@FindBy(id = "user_address_attributes_street")
	WebElement txtaddress;
	
	@FindBy(id = "user_address_attributes_city")
	WebElement txtCity;
	
	@FindBy(id = "user_address_attributes_county")
	WebElement txtcountry;
	
	@FindBy(id = "user_address_attributes_postcode")
	WebElement txtpostcode;
	
	@FindBy(id = "user_user_detail_attributes_email")
	WebElement txtemail;
	
	@FindBy(id = "user_user_detail_attributes_password")
	WebElement txtPassword;
	
	@FindBy(id = "user_user_detail_attributes_password_confirmation")
	WebElement txtConfirmPassword;
		
	@FindBy(xpath = "//input[@name='submit']")
	WebElement btncreate;
	
	
		
	public RegisterPage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);			
	}
	
	
	public void ValidateRegisterPage() throws Exception
	{
		
		g=new GenericMethods(driver);
		
		g.clikOnElement(btnacceptReg);
		
		g.selectItemWithText(Title,"Father");
		
		g.setEditValue(txtfirstname, "Rajanikanth");
		
		g.setEditValue(txtsurname, "Sirimalla");
		
		g.setEditValue(txtphone, "8106291992");
		
		g.selectItemWithText(selyear,"1993");
		
		g.selectItemWithText(selmonth,"February");
		
		g.selectItemWithText(seldate,"9");
		
		g.radioBoxSelect(selradio, "Provisional");
		
		g.selectItemWithText(sellicenceperiod, "2");
		
		g.selectItemWithText(seloccupation, "Student");
		
		g.setEditValue(txtaddress, "Hanamkonda");
		
		g.setEditValue(txtCity, "Hanamkonda");
		
		g.setEditValue(txtcountry, "India"); 
		
		g.setEditValue(txtpostcode, "506002");
		
		g.setEditValue(txtemail, "rajnikanths7@gmail.com");
		
		g.setEditValue(txtPassword, "Tester123");
		
		g.setEditValue(txtConfirmPassword, "Tester123");
		
	//	g.clikOnElement(btncreate);
		
		Thread.sleep(3000);
		
	}
	
	
	
	
	
	

}