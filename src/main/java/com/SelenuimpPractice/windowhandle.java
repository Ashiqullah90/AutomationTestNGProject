package com.SelenuimpPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle {
 
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
		
	       WebDriver driver = new ChromeDriver();
	       driver.navigate().to("https://www.salesforce.com/ua/");
	       driver.manage().window().maximize();
	     
	      driver.findElement(By.linkText("Try for free"));
	       
	       
	     Set<String> Windowhandl = driver.getWindowHandles();
	           System.out.println(Windowhandl);
	           
	    Iterator<String> iterator1 = Windowhandl.iterator();   
	    String Parentwindow = iterator1.next();      
	    String childwindow =iterator1.next();  
	    
	    driver.switchTo().window(childwindow);
	    
	       
	       
	       
	       
	       
	}

}
