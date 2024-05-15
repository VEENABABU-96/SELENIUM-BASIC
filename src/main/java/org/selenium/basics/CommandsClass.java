package org.selenium.basics;

	import java.util.List;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class CommandsClass {
	
		
		public void VerifySwaglabLogin()
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			WebElement username_field=driver.findElement(By.className("form_input"));
			username_field.sendKeys("standard_user");
			WebElement password_field=driver.findElement(By.className("input_error"));
			password_field.sendKeys("secret_sauce");
			WebElement login_button = driver.findElement(By.className("submit-button btn_action"));
			login_button.click();
			
		}
		public void VerifyLinkText()
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.guru99.com/test/newtours/index.php");
			driver.manage().window().maximize();
			WebElement destination_field=driver.findElement(By.linkText("your destination"));
			destination_field.click();
			
		}
		
		public void verifyPartialLinkText()
		{
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.guru99.com/test/newtours/index.php");
			driver.manage().window().maximize();
			WebElement destination_field=driver.findElement(By.partialLinkText("destination"));
			destination_field.click();			
		}
		
		public void totalNoOfTagsInTheApplication()
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.guru99.com/test/newtours/index.php");
			driver.manage().window().maximize();
			List<WebElement> inputtype = driver.findElements(By.tagName("td"));
			int inputsize=inputtype.size();
			System.out.println("No.of input tag is "+inputsize);
		}
		public static void main(String[] args) {
			CommandsClass obj = new CommandsClass();
			//obj.VerifySwaglabLogin();
			//obj.VerifyLinkText();
			//obj.verifyPartialLinkText();
			obj.totalNoOfTagsInTheApplication();

		}

	}
	

	
