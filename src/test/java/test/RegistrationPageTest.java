package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;
import utilities.Excel_Utility;
import utilities.RandomDataUtility;

public class RegistrationPageTest extends Base {
	@Test
	public void verifyRegistrationPageTitle()
	{
		driver.get("https://demowebshop.tricentis.com/register");
		String actualtitle=driver.getTitle();
		System.out.println("Actual Title: " +actualtitle);
		String expectedtitle=Excel_Utility.readStringData(0, 0, "Registration_Page");
		Assert.assertEquals(actualtitle, expectedtitle,"Invalid Title");
		
	}
	@Test
	public void verifyUserRegistration()
	{
		driver.get("https://demowebshop.tricentis.com/");
		String firstname=RandomDataUtility.getFirstName();
		String lastname=RandomDataUtility.getLastName();
		String emailid=firstname+"."+lastname+"@gmail.com";
		String pass_word=firstname+"@"+lastname;
		WebElement register_field=driver.findElement(By.xpath("//a[@class='ico-register']")) ;
		register_field.click();
		WebElement genderfemale=driver.findElement(By.xpath("//input[@id='gender-female']"));
		genderfemale.click();
		WebElement first_name=driver.findElement(By.xpath("//input[@id='FirstName']"));
		first_name.sendKeys(firstname);
		WebElement last_name=driver.findElement(By.xpath("//input[@id='LastName']"));
		last_name.sendKeys(lastname);
		WebElement email_field=driver.findElement(By.xpath("//input[@id='Email']"));
		email_field.sendKeys(emailid);
		WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
		password.sendKeys(pass_word);
		WebElement confirmpassword=driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
		confirmpassword.sendKeys(pass_word);
		WebElement register_button=driver.findElement(By.xpath("//input[@id='register-button']"));
		register_button.click();
		WebElement message=driver.findElement(By.cssSelector("div.result"));
		String actualmessage=message.getText();
		//System.out.println("Actual Message: " +actualmessage);
		String expectedmessage=Excel_Utility.readStringData(0, 1, "Registration_Page");
		Assert.assertEquals(actualmessage, expectedmessage, "Registration is not completed");
	}

}
