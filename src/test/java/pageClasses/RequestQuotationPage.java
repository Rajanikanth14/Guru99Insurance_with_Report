package pageClasses;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Framework.Reporter;
import utilities.WebControls;

public class RequestQuotationPage extends WebControls
{
	@FindBy(id= "ui-id-2")
	WebElement linkaccept;
	
	@FindBy(xpath= "//h2[text()='Request a quotation']")
	WebElement txtverify;
	
	@FindBy(id= "quotation_breakdowncover")
	WebElement selBreakdowncover;
	
	@FindBy(xpath= "//input[@name='windscreenrepair']")
	List<WebElement> selradio;
	
	@FindBy(id= "quotation_incidents")
	WebElement txtincidents;
	
	@FindBy(id= "quotation_vehicle_attributes_registration")
	WebElement txtRegistration;
	
	@FindBy(id= "quotation_vehicle_attributes_mileage")
	WebElement txtAnnualmileage;
	
	@FindBy(id= "quotation_vehicle_attributes_value")
	WebElement txtstimatedvalue;
	
	@FindBy(id= "quotation_vehicle_attributes_parkinglocation")
	WebElement selParking;
	
	@FindBy(id= "quotation_vehicle_attributes_policystart_1i")
	WebElement selyear;
	
	@FindBy(id= "quotation_vehicle_attributes_policystart_2i")
	WebElement selmonth;
	
	@FindBy(id= "quotation_vehicle_attributes_policystart_3i")
	WebElement seldate;
	
	@FindBy(xpath= "//input[@name='submit']")
	WebElement btnsmt;
	
	public void ValidateRequestQuotationPage(String Breakdowncover, String incidents,String Registration, String Annualmileage,String Estimatedvalue, String ParkingLocation,String DOY, String DOM,String DOD) throws InterruptedException 
	{
		boolean retVal;
		
		retVal = clickElement(linkaccept);
		Reporter.log(retVal, "Clicked on Request Quotation Button Succefully",
				             "Failed to Click on Request Quotation Button");
		
		retVal = selectItemWithText(selBreakdowncover, Breakdowncover);
		Reporter.log(retVal,"Selected the Breakdown cover from dropdrown list Succefully",
					         "Failed to Select the Breakdown cover from dropdrown list");
		
		
		retVal = setEditValue(txtincidents, incidents);
		Reporter.log(retVal, "incidents entered Successfully",
				             "Failed to Enter incidents value");
		
		retVal = setEditValue(txtRegistration, Registration);
		Reporter.log(retVal, "Registration entered Successfully",
				             "Failed to Enter Registration value");
		
		retVal = setEditValue(txtAnnualmileage, Annualmileage);
		Reporter.log(retVal, "Annual mileage entered Successfully",
				             "Failed to Enter Annual mileage value");
		
		retVal = setEditValue(txtstimatedvalue, Estimatedvalue);
		Reporter.log(retVal, "Estimated value entered Successfully",
				             "Failed to Enter Estimated value value");
		
		retVal = selectItemWithText(selParking, ParkingLocation);
		Reporter.log(retVal, "Selected the Parking Location from dropdrown list Successfully",
				             "Failed to Select the Parking Location from dropdrown list");
		
		retVal = selectItemWithText(selyear, DOY);
		Reporter.log(retVal,"Selected the Year of birth from dropdrown list Successfully",
					"Failed to Select the Year of birth from dropdrown list");
			
		retVal = selectItemWithText(selmonth, DOM);
		Reporter.log(retVal,"Selected the Month of birth from dropdrown list Successfully",
						"Failed to Select the Month of birth month from dropdrown list");
				
		retVal = selectItemWithText(seldate, DOD);
		Reporter.log(retVal,"Selected the Date of birth  from dropdrown list Successfully",
							"Failed to Select the Date of birth from dropdrown list");
		
		retVal = clickElement(btnsmt);
		Reporter.log(retVal, "Clicked on Save Quotation Button Successfully",
				             "Failed to Click on Save Quotation Button");
		
	}
	

}