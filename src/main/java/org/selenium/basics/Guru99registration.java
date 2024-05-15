package org.selenium.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99registration {
	
	public void verifyguru99registration()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/login.php");
		driver.manage().window().maximize();
		WebElement register =driver.findElement(By.linkText("REGISTER"));
		register.click();
		WebElement first_name=driver.findElement(By.name("firstName"));
		first_name.sendKeys("Veena");
		WebElement last_name=driver.findElement(By.name("lastName"));
		last_name.sendKeys("Babu");
		WebElement phone_no=driver.findElement(By.name("phone"));
		phone_no.sendKeys("1234567890");
		WebElement email_field=driver.findElement(By.id("userName"));
		email_field.sendKeys("veena@gmail.com");
		WebElement address_field=driver.findElement(By.name("address1"));
		address_field.sendKeys("Rakendu");
		WebElement city_field=driver.findElement(By.name("city"));
		city_field.sendKeys("Attingal");
		WebElement state_field=driver.findElement(By.name("state"));
		state_field.sendKeys("Kerala");
		WebElement postcode_field=driver.findElement(By.name("postalCode"));
		postcode_field.sendKeys("695304");
		WebElement username_field=driver.findElement(By.id("email"));
		username_field.sendKeys("veena@gmail.com");
		WebElement password_field=driver.findElement(By.name("password"));
		password_field.sendKeys("Veena@1234");
		WebElement confirmpassword_field=driver.findElement(By.name("confirmPassword"));
		confirmpassword_field.sendKeys("Veena@1234");
		WebElement submit_button =driver.findElement(By.name("submit"));
		submit_button.click();
	}

	public static void main(String[] args) {
		
		Guru99registration obj=new Guru99registration();
		obj.verifyguru99registration();
	}

}
