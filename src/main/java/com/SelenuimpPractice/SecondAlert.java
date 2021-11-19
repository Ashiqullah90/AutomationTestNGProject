package com.SelenuimpPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SecondAlert {
       static WebElement driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
		
	       WebDriver driver = new ChromeDriver();
	       driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	       driver.navigate().back();
	       driver.navigate().forward();
	       driver.manage().window().maximize();
	       
	       WebElement alert5 = driver.findElement(By.name("alert"));
	       alert5.click();
	       Thread.sleep(3000);
	       driver.switchTo().alert().accept();
	       Thread.sleep(6000);
	       
	       WebElement confirmation1 = driver.findElement(By.name("confirmation"));
	       confirmation1.click();
	       Thread.sleep(4000);
	       driver.switchTo().alert().dismiss();
	       Thread.sleep(2000);
	       
	       WebElement Promot1 = driver.findElement(By.name("prompt"));
	       Promot1.click();
	       Thread.sleep(2000);
	       driver.switchTo().alert().sendKeys("Don't accept it please");
	       
	       
	       

	}

}
