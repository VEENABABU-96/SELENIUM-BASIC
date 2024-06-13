package test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;
import data_provider.Data_Providers;
import utilities.Excel_Utility;

public class LoginpageTest extends Base{
	@Test
	public void verifyLoginpageTitle()
	{
		driver.get("https://demowebshop.tricentis.com/login");
		String actualtitle=driver.getTitle();
		System.out.println("Actual Title: " +actualtitle);
		String expectedtitle =Excel_Utility.readStringData(0, 0,"Login_Page");
		Assert.assertEquals(actualtitle, expectedtitle, "Invalid Title");
				
	}
	@Test
	public void verifyUserLogin()
	{
		driver.get("https://demowebshop.tricentis.com/");
		WebElement login=driver.findElement(By.xpath("//a[@class='ico-login']"));
		login.click();
		
		WebElement email_field=driver.findElement(By.xpath("//input[@id='Email']"));
		String email_value=Excel_Utility.readStringData(0, 1, "Login_Page");
		email_field.sendKeys(email_value);
		
		WebElement password_field=driver.findElement(By.xpath("//input[@id='Password']"));
		String password_value=Excel_Utility.readStringData(1, 1, "Login_Page");
		password_field.sendKeys(password_value);
		
		WebElement login_button=driver.findElement(By.className("login-button"));
		login_button.click();
		
		WebElement actual_id=driver.findElement(By.xpath("//a[text()='veenababu@gmail.com']"));
		String actualid=actual_id.getText();
		System.out.println("Actual Id: " +actualid);
		String expectedid=email_value;
		Assert.assertEquals(actualid, expectedid, "Invalid Id");
	}
	@Test(dataProvider="InvalidUserCredentials", dataProviderClass=Data_Providers.class)
	public void verifyUserLoginwithInvalidCredential(String username,String password)
	{
		driver.get("https://demowebshop.tricentis.com/");
		WebElement login=driver.findElement(By.xpath("//a[@class='ico-login']"));
		login.click();
		WebElement email_field=driver.findElement(By.xpath("//input[@id='Email']"));
		email_field.sendKeys(username);
		WebElement password_field=driver.findElement(By.xpath("//input[@id='Password']"));
		password_field.sendKeys(password);
		WebElement login_button=driver.findElement(By.className("login-button"));
		login_button.click();
		WebElement actual_result=driver.findElement(By.xpath("//span[text()='Login was unsuccessful. Please correct the errors and try again.']"));
		String actual_msg=actual_result.getText();
		String expected_result=Excel_Utility.readStringData(0, 2, "Login_Page");
		Assert.assertEquals(actual_msg, expected_result, "Login is not successful");
	}

}
