package com.SelenuimpPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
		
	       WebDriver driver = new ChromeDriver();
	       driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	       driver.navigate().back();
	       driver.navigate().forward();
	       driver.manage().window().maximize();
		
		WebElement Alert1 = driver.findElement(By.name("alert"));
		Alert1.click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		WebElement Alert2 = driver .findElement(By.name("confirmation"));
		Alert2.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		//Thread.sleep(6000);
		//driver.switchTo().alert().dismiss();
		
		Thread.sleep(3000);
		WebElement alert3 = driver.findElement(By.name("prompt"));
		alert3.click();
		Thread.sleep(6000);
		driver.switchTo().alert().sendKeys("Ashiqullah");
		alert3.click();
		
		
		
	}

}
