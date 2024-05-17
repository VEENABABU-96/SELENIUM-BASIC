package org.selenium.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demowebshopregistration {
	public void verifyDemoWebshopRegistration()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement register_field= driver.findElement(By.className("ico-register"));
		register_field.click();
		WebElement gender_field=driver.findElement(By.id("gender-female"));
		gender_field.click();
		WebElement firstname_field=driver.findElement(By.id("FirstName"));
		firstname_field.sendKeys("Veena");
		WebElement secondname_field=driver.findElement(By.id("LastName"));
		secondname_field.sendKeys("babu J");
		WebElement email_field=driver.findElement(By.id("Email"));
		email_field.sendKeys("jsdfjshfk3@gmail.com");
		WebElement password_field=driver.findElement(By.id("Password"));
		password_field.sendKeys("Veena@123");
		WebElement confirmpassword=driver.findElement(By.id("ConfirmPassword"));
		confirmpassword.sendKeys("Veena@123");
		WebElement register=driver.findElement(By.id("register-button"));
		register.click();
	}
	public void VerifyIsSelected()
	{
		boolean ismaleselected;
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		WebElement gender_male=driver.findElement(By.xpath("//input[@id='gender-male']"));
		ismaleselected=gender_male.isSelected();
		System.out.println("Male element before selected" + ismaleselected);
		gender_male.click();
		ismaleselected=gender_male.isSelected();
		System.out.println("Male element after selected "+ismaleselected);
		driver.close();

	}
	
	public void verifyIsenabled()
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement subscribe_button=driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']"));
		boolean issubscribebuttonisenabled=subscribe_button.isEnabled();
		System.out.println("Subscribe button is enabled or not "+issubscribebuttonisenabled);
		driver.close();
	}
	public void verifyIsdisplayed()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement vote_button=driver.findElement(By.xpath("//input[@id='vote-poll-1']"));
		boolean isvotebuttondisplayed=vote_button.isDisplayed();
		System.out.println("vote button displayed or not" + isvotebuttondisplayed);
		driver.close();
	}

	public static void main(String[] args) {
		Demowebshopregistration obj = new Demowebshopregistration();
		//obj.verifyDemoWebshopRegistration();
		//obj.verifyIsenabled();
		obj.verifyIsdisplayed();
		//obj.VerifyIsSelected();
	}

}
