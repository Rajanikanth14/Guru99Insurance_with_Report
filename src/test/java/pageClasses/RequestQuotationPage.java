package pageClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GenericMethods;

public class RequestQuotationPage 
{
	WebDriver driver;
	GenericMethods g;
	 
	 
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
	
	public RequestQuotationPage(WebDriver driver)
	{
		this.driver = driver;
			
		PageFactory.initElements(driver, this);			
	 }
	 
	 public void ValidateRequestQuotationPage() throws Exception
	 {
		g=new GenericMethods(driver);
		
		g.clikOnElement(linkaccept);
		
		g.verifyText(txtverify, "Request a quotation");
		
		g.radioBoxSelect(selradio, "YES");
		
		g.setEditValue(txtincidents, "12345");
		
		g.setEditValue(txtRegistration, "12345");
		
		g.setEditValue(txtAnnualmileage, "12345");
		
		g.setEditValue(txtstimatedvalue, "12345");
		
		g.selectItemWithText(selParking, "Locked Garage");
		
		g.selectItemWithText(selyear, "2018");
		
		g.selectItemWithText(selmonth, "April");
		
		g.selectItemWithText(seldate, "14");
		
		g.clikOnElement(btnsmt);
		
		// This is
		
	 }

}