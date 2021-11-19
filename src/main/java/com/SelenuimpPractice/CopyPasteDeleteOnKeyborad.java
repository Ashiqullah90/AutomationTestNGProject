package com.SelenuimpPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import okio.Timeout;

public class CopyPasteDeleteOnKeyborad {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
		
	       driver = new ChromeDriver();
	       driver.navigate().to("https://www.amazon.com");
	       driver.navigate().back();
	       driver.navigate().forward();
	       driver.manage().window().maximize();
	      Actions Ob = new Actions(driver);
	      /* WebElement CPD = driver.findElement(By.id("twotabsearchtextbox"));
	       CPD.sendKeys("computers");
	       Thread.sleep(2000);
	       Actions obCPD = new Actions(driver);
	       obCPD.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
	       obCPD.keyDown(Keys.CONTROL).sendKeys("c").build().perform();
	       CPD.clear();
	       
	       CPD.click();
	       Thread.sleep(4000);
	       obCPD.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();*/
	       
	      /* WebElement filed = driver.findElement(By.name("field-keywords"));
	       filed.sendKeys("Iphones");
	       
	       Thread.sleep(2000);
	       
	      // filed.sendKeys(Keys.ENTER);
	       OBC.keyDown(Keys.CONTROL).sendKeys("a").perform();
	     
	      
	       OBC.keyDown(Keys.CONTROL).sendKeys("c").perform();
	       Thread.sleep(6000);
	       
	       OBC.sendKeys(Keys.DELETE).build().perform();
	       Thread.sleep(6000);
	       
	       OBC.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	       Thread.sleep(2000);
	       
	       filed.sendKeys(Keys.ENTER);*/
	       
	       WebElement Build = driver.findElement(By.id("twotabsearchtextbox"));
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       driver.manage().timeouts().wait(100);
	       Build.sendKeys("furnitures");
	       
	       Thread.sleep(2000);
	       
	       Ob.keyDown(Keys.CONTROL).sendKeys("a").perform();
	       Thread.sleep(2000);
	       
	       Ob.keyDown(Keys.CONTROL).sendKeys("c").perform();
	       Thread.sleep(2000);
	       
	       Ob.sendKeys(Keys.DELETE).perform();
	       Thread.sleep(3000);
	       
	       Ob.keyDown(Keys.CONTROL).sendKeys("v").perform();
	       Thread.sleep(2000);
	       
	       Build.sendKeys(Keys.ENTER);
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	}

}
