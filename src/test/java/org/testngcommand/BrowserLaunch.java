package org.testngcommand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BrowserLaunch {
	WebDriver driver;
	
	public void initializeBrowser(String browser)
	{
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
	else if(browser.equals("edge"))
	{
		driver=new EdgeDriver();
	}
	else if(browser.equals("firefox"))
	{
		driver=new FirefoxDriver();
	}
	else
	{
		throw new RuntimeException("Invalid Browser");
	}
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	
	public void setUp()
	{
		initializeBrowser("chrome");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
