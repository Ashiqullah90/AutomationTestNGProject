package com.SelenuimpPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice {
	 //we have write global Variable
	//call chrome driver class constactor
   // use webdriver innterface
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		Thread.sleep(6000);
		driver.navigate().back();
		driver.navigate().forward();
		driver.manage().window().maximize();
		//driver.close();
		//driver.quit();
	   WebElement fash = driver.findElement(By.linkText("Fashion"));
	    Thread.sleep(6000);
		fash.click();
		// link text syntex
		WebElement Boo = driver.findElement(By.linkText("Books"));
		Thread.sleep(6000);
		Boo.click();
		// porsial link text syntex
		WebElement pharmacy = driver.findElement(By.partialLinkText("Pha"));
		Thread.sleep(6000);
		pharmacy.click();
		
	   WebElement web = driver.findElement(By.name("field-keywords"));
	   Thread.sleep(6000);
	   web.sendKeys("latest Iphone");
	   web.click();
	   
	   WebElement xp = driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/span/input"));
	   xp.click();
	   
	   
	   
	   
	   
	   
;		
		
	}


} 