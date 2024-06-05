package org.testngcommand;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Commands extends BrowserLaunch {
	
@Test
public void homePageTitle()
{
	driver.get("https://demowebshop.tricentis.com/");
	String actualtitle=driver.getTitle();
	System.out.println("Actual Title: " +actualtitle);
	String expectedtitle="Demo Web hop";
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
@Test
public void verifyJavascriptExecutor()
{
	driver.get("https://demowebshop.tricentis.com/");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.getElementById(\"newsletter-email\").value=\"veena@gmail.com\"");
	js.executeScript("document.getElementById(\"newsletter-subscribe-button\").click()");
}

@Test
public void verifyVerticalScroll()
{
	driver.get("https://demowebshop.tricentis.com/");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,100)");
}

@Test
public void verifyDemowebshopLogin()
{
	driver.get("https://demowebshop.tricentis.com/login");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.getElementById(\"Email\").value=\"veena@gmail.com\"");
	js.executeScript("document.getElementById(\"Password\").value=\"123456\"");
	//js.executeScript()
	
	}

public void verifyKeyboardEvents() throws AWTException
{
	driver.get("https://demowebshop.tricentis.com/");
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_T);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_T);
}
@Test
public void verifyWait()
{
	driver.get("https://demoqa.com/alerts");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	//WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20)); 
	//wait.until( ExpectedConditions.visibilityOfElementLocated(By.id("timerAlertButton")));
	WebElement clickme = driver.findElement(By.id("timerAlertButton"));
	 clickme.click();
	 //wait.until(ExpectedConditions.alertIsPresent());
	 Alert alert =driver.switchTo().alert();
	 alert.accept();
}
@Test
public void verifyFluentWait()
{
	driver.get("https://demoqa.com/alerts");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	FluentWait wait =new FluentWait(driver);
	wait.withTimeout(Duration.ofSeconds(20));
	wait.pollingEvery(Duration.ofSeconds(2));
	wait.ignoring(NoSuchElementException.class);
	
	WebElement clickme = driver.findElement(By.id("timerAlertButton"));
	clickme.click();
	wait.until(ExpectedConditions.alertIsPresent());
	
	Alert alert=driver.switchTo().alert();
	alert.accept();
}

}
