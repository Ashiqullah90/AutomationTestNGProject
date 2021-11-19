package com.SelenuimpPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandle {
 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
		
	       WebDriver driver = new ChromeDriver();
	       driver.navigate().to("https://www.amazon.com");
	       driver.navigate().back();
	       driver.navigate().forward();
	       driver.manage().window().maximize();
	        Actions obj = new Actions(driver);
	        
	       WebElement Window = driver.findElement(By.linkText("Customer Service"));
	       Thread.sleep(3000);
	   
	       obj.keyDown(Keys.SHIFT).build().perform();
	       Window.click();
	       obj.keyUp(Keys.SHIFT).build().perform();
	      
	       
	       Set<String> window2 = driver.getWindowHandles();
	       
	       Iterator<String> iteret = window2.iterator();
	       
	       String firstWH = iteret.next();
	       String secondWH = iteret.next();
	       
	       System.out.println(firstWH);
	       System.out.println(secondWH);
	       
	       driver.switchTo().window(secondWH);
	       driver.switchTo().window(firstWH);
	      
	       
	       
	       
	}

}
