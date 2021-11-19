package com.SelenuimpPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class newactionclass {
 static WebElement driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
		
	       WebDriver driver = new ChromeDriver();
	       driver.navigate().to("https:www.amazon.com");
	       driver.navigate().back();
	       driver.navigate().forward();
	       driver.manage().window().maximize();
	       Actions action = new Actions(driver);
	       
	       WebElement WeAc = driver.findElement(By.id("nav-link-accountList"));
	       Thread.sleep(3000);
	       action.moveToElement(WeAc).perform();
	       Thread.sleep(2000);
	       
	       WebElement gift = driver.findElement(By.linkText("Content & Devices"));
	       Thread.sleep(2000);
	       action.moveToElement(gift).perform();
	       action.click();
	       
	       

	}

}
