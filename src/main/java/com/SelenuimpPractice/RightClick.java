package com.SelenuimpPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class RightClick {
   static WebElement driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
		
	       WebDriver driver = new ChromeDriver();
	       driver.navigate().to("http://deluxe-menu.com/popup-mode-sample.html");
	       driver.navigate().back();
	       driver.navigate().forward();
	       driver.manage().window().maximize();
	       
	       WebElement Rightclick = driver.findElement(By.xpath("//*[@onclick=\"return dm_popup(1, 2000, event);\"]"));
	      
	     Actions obaction = new Actions(driver);
	     obaction.contextClick(Rightclick).build().perform();
	      
	      

	}

}
