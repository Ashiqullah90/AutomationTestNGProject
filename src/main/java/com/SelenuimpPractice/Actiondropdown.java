package com.SelenuimpPractice;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actiondropdown {
     static WebElement driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
		
	       WebDriver driver = new ChromeDriver();
	       driver.navigate().to("https:www.amazon.com");
	       driver.navigate().back();
	       driver.navigate().forward();
	       driver.manage().window().maximize();
	       Actions ac = new Actions(driver);
	       
	       WebElement WebAction = driver.findElement(By.id("nav-link-accountList"));
	       Thread.sleep(3000);
	     //  WebAction.click();
	      ac.moveToElement(WebAction).build().perform();
	      Thread.sleep(3000);;
	      
	      WebElement Acc = driver.findElement(By.linkText("Your Account"));
	      ac.moveToElement(Acc).perform();
	      
	       
	     
	       
 
	       
	       
	       
	       

	}

}
