package com.SelenuimpPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class WindowHandle2 {
  static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
		
	       WebDriver driver = new ChromeDriver();
	       driver.navigate().to("https://www.amazon.com");
	       driver.navigate().back();
	       driver.navigate().forward();
	       driver.manage().window().maximize();
	       
	       Actions act = new Actions(driver);
	       
	       WebElement newrelese = driver.findElement(By.linkText("New Releases"));
	       
	       act.keyDown(Keys.SHIFT).perform();
	       newrelese.click();
	       act.keyUp(Keys.SHIFT).perform();
	       
	    Set<String> windowh = driver.getWindowHandles();
	    
	  Iterator<String> wind = windowh.iterator();
	  
	  String fWind = wind.next();
	  String secWind = wind.next();
	  
	  driver.switchTo().window(secWind);
	  driver.switchTo().window(fWind);
	  
	  
	  
	  
	  
	     
	     
		
		
		
		
		
		
		
		
		
		
	}
}
