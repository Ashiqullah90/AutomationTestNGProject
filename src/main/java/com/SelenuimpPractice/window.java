package com.SelenuimpPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class window {
      static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
		
	       WebDriver driver = new ChromeDriver();
	       driver.navigate().to("https://www.amazon.com");
	       driver.navigate().back();
	       driver.navigate().forward();
	       driver.manage().window().maximize();
	       
	       Actions obj = new Actions(driver);
	       
	       WebElement pharmacy = driver.findElement(By.linkText("Pharmacy"));
	       
	       obj.keyDown(Keys.SHIFT).perform();
	       pharmacy.click();
	       obj.keyUp(Keys.SHIFT).perform();
	       
	       Set<String> Window1 = driver.getWindowHandles();
	      Iterator<String> Window2 = Window1.iterator();
	      
	     String firstw = Window2.next();
	    String Secondw = Window2.next();
	    
	    driver.switchTo().window(Secondw);
	    
	    Thread.sleep(6000);
	    driver.switchTo().window(firstw);
	    
	    
	       
	       
	      
	     
	       
	       
	       
	       
	       
	}

}
