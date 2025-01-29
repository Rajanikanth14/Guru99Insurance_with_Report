package utilities;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

import Config.Configuration;

public class WebControls extends Configuration 
{
	public static Logger log = LogManager.getLogger(WebControls.class);

	public static boolean verifyPageTitle(String title) 
	{
		boolean status = true;

		try 
		{
			String appTitle = driver.getTitle();

			if (!appTitle.trim().equals(title.trim()))
				status = false;
		} 
		catch (Exception e) 
		{

			status = false;
		}
		return status;
	}
	// ============================

	public static boolean clickElement(WebElement element) 
	{
		boolean status = true;

		try 
		{
			status = scrollToElement(element);
			element.click();
			log.info("Clicked On Element");
			status = true;
		} 
		catch (Exception e) 
		{

			status = false;
		}
		return status;
	}

	// ====================================

	public static boolean scrollToElement(WebElement element) 
	{
		boolean status = true;

		try 
		{
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Thread.sleep(MIN_WAIT_TIME);

		} 
		catch (Exception e) 
		{

			status = false;
		}
		return status;
	}

	// ======================================

	public static boolean setEditValue(WebElement element, String value) 
	{
		boolean status = true;

		try 
		{
			status = scrollToElement(element);
			element.clear();
			element.sendKeys(value);
			String editValue = element.getAttribute("value");
			if (!value.equals(editValue))

				status = false;
		} 
		catch (Exception e) 
		{

			status = false;
		}
		return status;
	}
	// ======================================================
	    

	public static boolean selectItemWithText(WebElement element, String visibleText) 
	{
		boolean status = false;

		try 
		{
			if(scrollToElement(element)) {
			
			Select selItem=new Select(element);
			selItem.selectByVisibleText(visibleText);
			status = true;
		} 
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return status;
	}

	// ======================================

	public static boolean mouseHover(WebElement element) 
	{
		boolean status = true;

		try 
		{
			Actions action = new Actions(driver);
			action.moveToElement(element).build().perform();

		} 
		catch (Exception e) 
		{

			status = false;
		}
		return status;
	}

	// =================================

	public static String getElementText(WebElement element) 
	{
		String elementText = null;

		try 
		{

			scrollToElement(element);

			elementText = element.getText();
		} 
		catch (Exception e) 
		{

			e.printStackTrace();
		}
		return elementText;
	}
	// ===========================

	public static boolean verifyText(WebElement element, String text) 
	{
		boolean status = true;

		try 
		{
			status = scrollToElement(element);
			String appText = element.getText().trim();

			if (!appText.equals(text))
				status = false;
		} 
		catch (Exception e) 
		{

			status = false;
		}
		return status;
	}
	
	
//	 public static void radioBoxSelect(List<WebElement> element, String Text)
//	    {
//		    boolean status = true;
//		    try 
//		    {
//		    	for(int i=0;i<element.size();i++)
//		    	{
//		    		if(element.get(i).getAttribute("value").equalsIgnoreCase(Text))
//		            {
//		    			element.get(i).click();
//			
//		            }
//		    		
//		    	}
//		    	
//		    }
//	    	
//	    	    	
//	    }

}
