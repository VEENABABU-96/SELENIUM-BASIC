package org.selenium.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CommandsXpath {
	
	public void verifyDemoWebShopXpath()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		WebElement user_name=driver.findElement(By.xpath("//*[@id=\"Email\"]"));
		user_name.sendKeys("jsdfjshfk32@gmail.com");
		WebElement password_field=driver.findElement(By.xpath("//*[@id=\"Password\"]"));
		password_field.sendKeys("Veena@123");
		WebElement login_button=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
		login_button.click();
	}

	public static void main(String[] args) {
		CommandsXpath obj = new CommandsXpath();
		obj.verifyDemoWebShopXpath();

	}

}
