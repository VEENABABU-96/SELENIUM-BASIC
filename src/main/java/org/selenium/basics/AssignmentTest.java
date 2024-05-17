package org.selenium.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AssignmentTest {
	
	public void singleInputfield()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement entermessage_field=driver.findElement(By.id("single-input-field"));
		entermessage_field.sendKeys("Hello");
		WebElement showmessage_button=driver.findElement(By.id("button-one"));
		showmessage_button.click();
		WebElement yourmessage=driver.findElement(By.xpath("//div[@id='message-one']"));
		System.out.println(yourmessage.getText());
	}

	public void verifyTwoInputFields()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement entervalueA_field=driver.findElement(By.id("value-a"));
		entervalueA_field.sendKeys("10");
		WebElement entervalueB_field=driver.findElement(By.id("value-b"));
		entervalueB_field.sendKeys("5");
		WebElement getvalue_button=driver.findElement(By.id("button-two"));
		getvalue_button.click();
		WebElement get_total=driver.findElement(By.xpath("//div[@id='message-two']"));
		System.out.println(get_total.getText());
	}
	
	public void verifyCheckboxDemo()
	{
		boolean ischeckboxselected;
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.manage().window().maximize();
		WebElement click_checkbox=driver.findElement(By.cssSelector(".form-check-input"));
		ischeckboxselected=click_checkbox.isSelected();
		System.out.println("Before check box is selected: " +ischeckboxselected);
		click_checkbox.click();
		ischeckboxselected=click_checkbox.isSelected();
		System.out.println("After checkbox is selected: " +ischeckboxselected);
		
			
	}
	
	public void verifyradioButtonDemo()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
		driver.manage().window().maximize();
		WebElement radiobuttoncheck=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		boolean isradiobuttonselected=radiobuttoncheck.isSelected();
		System.out.println("Before Radio button selected "+isradiobuttonselected);
		radiobuttoncheck.click();
		isradiobuttonselected=radiobuttoncheck.isSelected();
		System.out.println("After Radio button selected: " +isradiobuttonselected);
		WebElement showselectedvalue=driver.findElement(By.cssSelector("button#button-one"));
		showselectedvalue.click();
		WebElement showvalue=driver.findElement(By.cssSelector("div#message-one"));
		System.out.println(showvalue.getText());
	}
	
	public void verifyFormSubmit()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/form-submit.php");
		driver.manage().window().maximize();
		WebElement first_name=driver.findElement(By.id("validationCustom01"));
		first_name.sendKeys("Veena");
		WebElement last_name=driver.findElement(By.id("validationCustom02"));
		last_name.sendKeys("Babu");
		WebElement user_name=driver.findElement(By.id("validationCustomUsername"));
		user_name.sendKeys("veena@gamil.com");
		WebElement city_field=driver.findElement(By.id("validationCustom03"));
		city_field.sendKeys("Trivandrum");
		WebElement state_field=driver.findElement(By.id("validationCustom04"));
		state_field.sendKeys("Kerala");
		WebElement zip_field=driver.findElement(By.id("validationCustom05"));
		zip_field.sendKeys("123456");
		WebElement agreetermsandcondition=driver.findElement(By.xpath("//input[@id='invalidCheck']"));
		agreetermsandcondition.click();
		WebElement submit_button=driver.findElement(By.cssSelector("button[class='btn btn-primary']"));
		submit_button.click();
		WebElement submitmessage=driver.findElement(By.xpath("//div[@id='message-one']"));
		System.out.println(submitmessage.getText());
		
	}
	public static void main(String[] args) {
		AssignmentTest obj = new AssignmentTest();
		//obj.singleInputfield();
		//obj.verifyTwoInputFields();
		obj.verifyCheckboxDemo();
		//obj.verifyradioButtonDemo();
		//obj.verifyFormSubmit();
	}

}
