package org.selenium.basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserLaunch {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.seleniumeasy.com/");
		driver.manage().window().maximize();
	}

}
