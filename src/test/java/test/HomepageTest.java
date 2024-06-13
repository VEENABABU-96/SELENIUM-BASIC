package test;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


import automation_core.Base;
import utilities.Excel_Utility;

public class HomepageTest extends Base {
	@Test
	public void verifyHomepageTitle() 
	{
		driver.get("https://demowebshop.tricentis.com/");
		String actualtitle=driver.getTitle();
		System.out.println("Actual Title: " +actualtitle);
		String expectedtitle=Excel_Utility.readStringData(0, 0, "Home_Page");
		Assert.assertEquals(actualtitle, expectedtitle, "Invalid Title");
	}
	@Test
	public void verifyCommunitypoolSelection()
	{
		driver.get("https://demowebshop.tricentis.com/");
	    List<WebElement> communityPollOptions = driver.findElements(By.xpath("//li[@class='answer']//input[@type='radio']//following-sibling::label"));
	    
	    for(WebElement radiobutton : communityPollOptions)
	    {
	    	 String radiobuttontext = radiobutton.getText();
	         System.out.println("Option: " +radiobuttontext);
	         String data=Excel_Utility.readStringData(0, 1, "Home_Page");
	         
	         if (radiobuttontext.equalsIgnoreCase(data)) 
	         {
	        	 radiobutton.click();
	         }
		
	}
	    WebElement goodfield =driver.findElement(By.xpath("//input[@id='pollanswers-2']"));  
		   boolean status =goodfield.isSelected();
		   System.out.println(status);
		   Assert.assertTrue(status,"good checkbox is not selected");
		}
	
}


