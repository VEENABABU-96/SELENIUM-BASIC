package org.selenium.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CommandsName {
	
	public void VerifySwaglabLogin()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement username_field=driver.findElement(By.name("user-name"));
		username_field.sendKeys("standard_user");
		WebElement password_field=driver.findElement(By.name("password"));
		password_field.sendKeys("secret_sauce");
		WebElement login_button = driver.findElement(By.name("login-button"));
		login_button.click();
		
	}

	public static void main(String[] args) {
		CommandsName obj = new CommandsName();
		obj.VerifySwaglabLogin();

	}

}
