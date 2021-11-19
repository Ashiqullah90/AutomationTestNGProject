package com.SelenuimpPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement {

	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.quit();
		//driver.navigate().back();
		//driver.navigate().forward();
		//WebElement n = driver.findElement(By.linkText("Fashion"));
		//Thread.sleep(3000);
		//n.click();
		WebElement name = driver.findElement(By.name("email"));
	
		name.sendKeys("ashiqullaht@yahoo.com");	 
		WebElement pas = driver.findElement(By.name("password"));
	
		pas.sendKeys("ash12345");
		
	
	
        
        
        
        
	}

}
