package org.selenium.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommandsCssselector {
	
	public void verifyDemoWebshopCssSelector()
	{
		WebDriver driver  = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		WebElement user_name=driver.findElement(By.cssSelector("#Email"));
		user_name.sendKeys("jsdfjshfk32@gmail.com");
		WebElement password_field = driver.findElement(By.cssSelector("#Password"));
		password_field.sendKeys("Veena@123");
		WebElement login_button=driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div.center-2 > div > div.page-body > div.customer-blocks > div.returning-wrapper > div.form-fields > form > div.buttons > input"));
		login_button.click();
	}

	public static void main(String[] args) {
		CommandsCssselector obj = new CommandsCssselector();
		obj.verifyDemoWebshopCssSelector();
	}

}
