package org.selenium.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commands1 {
	
	public void verifyDemoWebsopLogin()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("\"https:demowebshop.tricentis.com/\"");
		driver.manage().window().maximize();
		WebElement login_field = driver.findElement(By.className("ico-login"));
		login_field.click();
		WebElement email_field = driver.findElement(By.id("Email"));
		email_field.sendKeys("jsdfjshfk32@gmail.com");
		WebElement password_field = driver.findElement(By.id("Password"));
		password_field.sendKeys("Veena@123");
		WebElement login_button=driver.findElement(By.className("login-button"));
		login_button.click();
		
	}

	public static void main(String[] args) {
		Commands1 obj = new Commands1();
		obj.verifyDemoWebsopLogin();

	}

}
