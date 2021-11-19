package com.SelenuimpPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    
	static WebDriver driver;
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
		
       WebDriver driver = new ChromeDriver();
       driver.navigate().to("https:www.facebook.com");
       driver.navigate().back();
       driver.navigate().forward();
       driver.manage().window().maximize();
       
       WebElement xp1 = driver.findElement(By.xpath("//input[@id=\"email\"]"));
    	xp1.sendKeys("ashiqullaht@yahoo.com");	 
       xp1.click();
       
       WebElement xp = driver.findElement(By.xpath("//input[@name=\"pass\"]"));
       xp.sendKeys("123456a");
       xp.click();
       
       WebElement xp3 = driver.findElement(By.xpath("//button[@name=\"login\"]"));
       xp3.click();
       
       WebElement xp4 = driver.findElement(By.xpath(null));
    		   xp4.click();
       xp4.sendKeys("23441a");
       
    //   WebElement Rxp = driver.findElement(By.xpath(null))
       
       
	
		
		
		
	}

}
