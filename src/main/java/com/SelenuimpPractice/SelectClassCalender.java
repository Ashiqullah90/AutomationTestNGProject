package com.SelenuimpPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectClassCalender {
 static WebElement driver; 
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
		
	       WebDriver driver = new ChromeDriver();
	       driver.navigate().to("https://www.qatarairways.com/");
	       driver.navigate().back();
	       driver.navigate().forward();
	       driver.manage().window().maximize();
	       
	      /* WebElement close =driver.findElement(By.xpath("class=\"close\""));
	       close.click();*/
	       Thread.sleep(6000);
	       
	       WebElement calender = driver.findElement(By.xpath("//*[@class=\"qr-datepicker active d-flex\"]"));
	       calender.click();
	       Thread.sleep(4000);
	       
	       WebElement Selectdate = driver.findElement(By.xpath("//*[@data-t-fulldate=\"2021-11-2\"]"));
	       Selectdate.click();
	       Thread.sleep(4000);
	       
	       WebElement Returndate = driver.findElement(By.xpath("//*[@data-t-fulldate=\"2021-11-18\"]"));
	       Returndate.click();
	       Thread.sleep(2000);
	       
	       WebElement Conti = driver.findElement(By.xpath("//*[@class=\"btn btn-dark confirmBtn\"]"));
	       Conti.click();
	       Thread.sleep(3000);
	       
	     //  WebElement Close = driver.findElement(By.xpath(null))
	       
	       

	}

}
