package org.testngcommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Commands extends BrowserLaunch {
	
@Test
public void homePageTitle()
{
	driver.get("https://demowebshop.tricentis.com/");
	String actualtitle=driver.getTitle();
	System.out.println("Actual Title: " +actualtitle);
	String expectedtitle="Demo Web Shop";
	Assert.assertEquals(actualtitle, expectedtitle,"Invalid Title");
}
@Test
public void verifyDemowebShopUserLogin()
{
	driver.get("https://demowebshop.tricentis.com/");
	WebElement login_field = driver.findElement(By.className("ico-login"));
	login_field.click();
	WebElement email_field = driver.findElement(By.id("Email"));
	email_field.sendKeys("jsdfjshfk32@gmail.com");
	WebElement password_field = driver.findElement(By.id("Password"));
	password_field.sendKeys("Veena@123");
	WebElement login_button=driver.findElement(By.className("login-button"));
	login_button.click();
	WebElement user_id=driver.findElement(By.xpath("//a[text()='jsdfjshfk32@gmail.com']"));
	String actual_userid=user_id.getText();
	System.out.println("Actual User Id is: " +actual_userid);
	String expected_userid="jsdfjshfk32@gmail.com";
	Assert.assertEquals(actual_userid, expected_userid,"Invalid User Id");
}
@Test
public void VerifyIsSelected()
{
	boolean ismaleselected;
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/register");
	driver.manage().window().maximize();
	WebElement gender_male=driver.findElement(By.xpath("//input[@id='gender-male']"));
	ismaleselected=gender_male.isSelected();
	Assert.assertFalse(ismaleselected,"Male button selected" );
	gender_male.click();
	ismaleselected=gender_male.isSelected();
	Assert.assertTrue(ismaleselected,"Male button not Selected");
}


@Test
public void verifyIsenabled()
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	WebElement subscribe_button=driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']"));
	boolean issubscribebuttonisenabled=subscribe_button.isEnabled();
	Assert.assertTrue(issubscribebuttonisenabled, "Subscribe Button Not Enabled");
}

@Test
public void verifyIsdisplayed()
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	WebElement vote_button=driver.findElement(By.xpath("//input[@id='vote-poll-1']"));
	boolean isvotebuttondisplayed=vote_button.isDisplayed();
	Assert.assertTrue(isvotebuttondisplayed,"Vote Button Not Displayed");
}

}
