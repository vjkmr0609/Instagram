package org.insta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Instagram {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\aruna\\eclipse-workspace\\Insta\\driver\\geckodriver.exe") ;
		WebDriver driver = new FirefoxDriver();
		WebDriver driver1 = new FirefoxDriver();
		WebDriver driver2 = new FirefoxDriver();
		WebDriver driver3 = new FirefoxDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver1.get("https://www.facebook.com/");
		driver2.get("https://www.amazon.in");
		driver3.get("http://greenstech.in/selenium-course-content.html");
	}

}
