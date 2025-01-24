package utilities;



import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class GenericMethods 
{
	
    WebDriver driver;
    
    
	public GenericMethods(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String getTitleOfPage()
	{
		String title = driver.getTitle();
		
		return title;
		
	}
	
    public void clikOnElement(WebElement element) 
    {
		
    	element.click();
	}
    
    public void scrollToElement(WebElement element) throws InterruptedException 
    {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Thread.sleep(2000);
	}
	
    public void selectItemWithText(WebElement element,String visibleText) throws InterruptedException 
    {
    	scrollToElement(element);
		Select selItem=new Select(element);
		selItem.selectByVisibleText(visibleText);
			
	}
    
    	
    public void setEditValue(WebElement element,String value) throws InterruptedException 
    {
    	scrollToElement(element);
		element.clear();
		element.sendKeys(value);
		
	}
    
    public void verifyText(WebElement element,String text) throws InterruptedException 
    {
			
		scrollToElement(element);
		String appText=element.getText();
		
		Assert.assertEquals(appText, text);
		
		System.out.println(appText+" equals to "+text);
			
	}
	
    public void radioBoxSelect(List<WebElement> element, String Text)
    {
    	for(int i=0;i<element.size();i++)
    	{
    		if(element.get(i).getAttribute("value").equalsIgnoreCase(Text))
            {
    			element.get(i).click();
	
            }
    		
    	}
    	    	
    }
        
        
 
    
}