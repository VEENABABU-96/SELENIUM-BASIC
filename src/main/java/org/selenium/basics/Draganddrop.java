package org.selenium.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
public class Draganddrop {
	
	public void verifyDragAndDrop()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/drag-drop.php");
		driver.manage().window().maximize();
		
		WebElement draggable1=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement droppable=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions action=new Actions(driver);
		action.dragAndDrop(draggable1, droppable).build().perform();
		
		WebElement draggable2=driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
		Actions action1=new Actions(driver);
		action1.dragAndDrop(draggable2,droppable).build().perform();
		
		WebElement draggable3=driver.findElement(By.xpath("//span[text()='Draggable n°3']"));
		Actions action2=new Actions(driver);
		action2.dragAndDrop(draggable3, droppable).build().perform();
		
		WebElement draggable4=driver.findElement(By.xpath("//span[text()='Draggable n°4']"));
		Actions action3=new Actions(driver);
		action3.dragAndDrop(draggable4, droppable).build().perform();
		
	}

	public static void main(String[] args) {
		Draganddrop obj=new Draganddrop();
		obj.verifyDragAndDrop();

	}

}
