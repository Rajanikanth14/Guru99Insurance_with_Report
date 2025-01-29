package tests;

import java.util.HashMap;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Framework.Excellib;
import pageClasses.RegisterPage;
import utilities.BaseTestCalss;



public class testRegisterPage extends BaseTestCalss 
{
    
	@Test 
	
	public  void TC_001_RegisterPage() throws Exception
	{
		//Fetching data from TestData Sheet and calling function From ScreenPages
		
		String filepath= TESTDATA_PATH + TESTDATA_FILE;
		
		HashMap<String,String> data1 = Excellib.getRowData2(filepath, "Register", "TC_001_Guru99_Insurance_RegisterPage");
		
		RegisterPage  Reg_page = PageFactory.initElements(driver, RegisterPage.class);
		
	
		
		Reg_page.addRegisterPage(data1.get("Title"),data1.get("Firstname"),data1.get("Surname"), data1.get("Phone"),data1.get("Dob_Y"),data1.get("Dob_M"), data1.get("Dob_D"),data1.get("Licence_Period"), data1.get("Occupation"),data1.get("Add_Street"), data1.get("City"), data1.get("County"),data1.get("Postcode"),data1.get("Email"),data1.get("Password"), data1.get("Confirmpassword"));
		
		
	}
	
	
	

}