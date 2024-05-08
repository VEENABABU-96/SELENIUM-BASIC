package org.selenium.basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/");
		driver.manage().window().maximize();
	}

}
