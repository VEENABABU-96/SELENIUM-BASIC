package org.selenium.basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserLaunch {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.seleniumeasy.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		String handleid = driver.getWindowHandle();
		System.out.println(handleid);
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		driver.close();
	}

}
