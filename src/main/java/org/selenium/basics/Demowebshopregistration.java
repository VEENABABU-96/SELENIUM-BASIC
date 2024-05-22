package org.selenium.basics;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

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
	
	public void verifyValuesFromDropdown()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		WebElement country_dropdown=driver.findElement(By.xpath("//select[@name='country']"));
		Select select=new Select(country_dropdown); //reference for SELECT class
		//select.selectByVisibleText("ANDORRA"); //handling dropdown using TEXT method
		//select.selectByIndex(4); //handling dropdown using INDEX method
		select.selectByValue("AUSTRIA"); //handling dropdown using VALUE method
		WebElement first_selection=select.getFirstSelectedOption();
		System.out.println(first_selection.getText());
		}

	public void verifyTotalNoOfValue()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		WebElement country_dropdown=driver.findElement(By.xpath("//select[@name='country']"));
		Select select=new Select(country_dropdown);
		List<WebElement> dropdownlist=select.getOptions();
		System.out.println("Total number of dropdown" + dropdownlist.size());
		
	}
	
	public void verifyMultiSelectOptionFromDropdown()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();
		WebElement dropdown_multiselect=driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		Select select=new Select(dropdown_multiselect);
		boolean selected_values=select.isMultiple();
		System.out.println("Check whether value are selected " +selected_values);
		select.selectByIndex(2);
		select.selectByIndex(0);
		List<WebElement> listofselectedoption=select.getAllSelectedOptions();
		for(WebElement e:listofselectedoption)
	{
		System.out.println(e.getText());
	}
		select.deselectByIndex(0);
	}
	
	public void verifyColorFromtheDropdown()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();
		WebElement colorselection=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select=new Select(colorselection);
		//select.selectByVisibleText("Red");
		//select.selectByIndex(1);
		//select.selectByValue("Green");
		//WebElement firstselectedvalue=select.getFirstSelectedOption();
		//System.out.println(firstselectedvalue.getText());
		List<WebElement>colordropdown=select.getOptions(); 	
		System.out.println("Total no.of dropdown " +colordropdown.size());
		;
		
	}
	
	public void verifySimpleAlert()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebElement clickme_button=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		clickme_button.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void verifyConfirmationAlert()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebElement clickme=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		clickme.click();
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println("Confirmation alert" +text);
		alert.dismiss();
		WebElement confirmationmessage=driver.findElement(By.xpath("//span[@id='confirmResult']"));
		String confirmation_message=confirmationmessage.getText();
		System.out.println("Confirmation meaasge " +confirmation_message );
	}
	
	public void verifyPromptAlert()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebElement promptalert=driver.findElement(By.xpath("//button[@id='promtButton']"));
		promptalert.click();
		Alert alert=driver.switchTo().alert();
		String prompt_alert=alert.getText();
		System.out.println("Prompt Alert: " + prompt_alert);
		alert.sendKeys("Ammu");
		alert.accept();
		WebElement promptresult=driver.findElement(By.xpath("//span[@id='promptResult']"));
		String result= promptresult.getText();
		System.out.println("Prompt Message is: " +result);
		
	}
	
	public void deleteCustomer()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		WebElement userid=driver.findElement(By.xpath("//input[@name='cusid']"));
		userid.sendKeys("1234");
		WebElement submitbutton=driver.findElement(By.xpath("//input[@name='submit']"));
		submitbutton.click();
		Alert alert=driver.switchTo().alert();
		String alert_msg=alert.getText();
		System.out.println("Delete warning Message is: " +alert_msg );
		alert.accept();
		Alert alertmsg=driver.switchTo().alert();
		String dltmsg=alert.getText();
		System.out.println("Delete Message is: " +dltmsg );
		alert.accept();
		driver.close();
		
	}
	
	public void verifyRightClick()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement right_click=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions action=new Actions(driver);
		action.contextClick(right_click).build().perform();
		;
	}
	public void verifyDoubleClick()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement double_click=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions action=new Actions(driver);
		action.doubleClick(double_click).build().perform();
		Alert alert=driver.switchTo().alert();
		String alert_msg=alert.getText();
		System.out.println("Alert meassage is "+alert_msg);
		alert.accept();
		driver.close();
	}
	
	public void verifyDragAndDrop()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		WebElement dragme=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dropme=driver.findElement(By.xpath("//div[@id='droppableExample-tabpane-simple']//div[@id='droppable']"));
		Actions action=new Actions(driver);
		action.dragAndDrop(dragme, dropme).build().perform();
	}
	
	public void verifyDragAndOffset()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/dragabble");
		driver.manage().window().maximize();
		WebElement dragme=driver.findElement(By.xpath("//div[@id='dragBox']"));
		Actions action=new Actions(driver);
		action.dragAndDropBy(dragme, 50,100).build().perform();
	}
	
	public void verifyMouseHover()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/menu/");
		driver.manage().window().maximize();
		WebElement mousehover=driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		Actions action =new Actions(driver);
		action.moveToElement(mousehover).build().perform();
		}
	public static void main(String[] args) {
		Demowebshopregistration obj = new Demowebshopregistration();
		//obj.verifyDemoWebshopRegistration();
		//obj.verifyIsenabled();
		//obj.verifyIsdisplayed();
		//obj.VerifyIsSelected();
		//obj.verifyValuesFromDropdown();
		//obj.verifyTotalNoOfValue();
		//obj.verifyMultiSelectOptionFromDropdown();
		//obj.verifyColorFromtheDropdown();
		//obj.verifySimpleAlert();
		//obj.verifyConfirmationAlert();
		//obj.verifyPromptAlert();
		//obj.deleteCustomer();
		//obj.verifyRightClick();
		//obj.verifyDoubleClick();
		//obj.verifyDragAndDrop();
		//obj.verifyDragAndOffset();
		obj.verifyMouseHover();
	}

}
