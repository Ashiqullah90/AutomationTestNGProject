package com.SelenuimpPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
 
	static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
		
	       WebDriver driver = new ChromeDriver();
	       driver.navigate().to("https:www.facebook.com");
	       driver.navigate().back();
	       driver.navigate().forward();
	       driver.manage().window().maximize();
		
		
		
		
	}

}
