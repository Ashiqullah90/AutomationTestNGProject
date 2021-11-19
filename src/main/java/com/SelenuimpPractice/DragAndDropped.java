package com.SelenuimpPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropped {
 
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
		
	       driver = new ChromeDriver();
	       driver.navigate().to("https://jqueryui.com/droppable/");
	       driver.navigate().back();
	       driver.navigate().forward();
	       driver.manage().window().maximize();
	       
	       Actions Object = new Actions(driver);
	       
	     
	       
	       driver.switchTo().frame(0);
	       
	       WebElement Dragg = driver.findElement(By.id("draggable"));
	      
	       WebElement Drop = driver.findElement(By.id("droppable"));
	       Thread.sleep(3000);
	       Object.dragAndDrop(Dragg, Drop).build().perform();
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	}

}