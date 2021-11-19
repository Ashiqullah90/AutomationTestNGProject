package com.SelenuimpPractice;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronzation {
  static WebElement driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
		
	       WebDriver driver = new ChromeDriver();
	       driver.navigate().to("https:www.amazon.com");
	       driver.navigate().back();
	       driver.navigate().forward();
	       driver.manage().window().maximize();
	       Actions Ob = new Actions (driver);     
	       
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	       WebElement Build = driver.findElement(By.id("twotabsearchtextbox"));
	      
	       
	       Build.sendKeys("furnitures");
	       
	     
	       
	       Ob.keyDown(Keys.CONTROL).sendKeys("a").perform();
	      
	       
	       Ob.keyDown(Keys.CONTROL).sendKeys("c").perform();
	   
	       Ob.sendKeys(Keys.DELETE).perform();
	    
	       
	       Ob.keyDown(Keys.CONTROL).sendKeys("v").perform();
	   
	       Build.sendKeys(Keys.ENTER);
	       

	}                    
}
