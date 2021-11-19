package com.SelenuimpPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronzationIpliciteWaitExpliciteWait {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
		
	       WebDriver driver = new ChromeDriver();
	       driver.navigate().to("https:www.amazon.com");
	       driver.navigate().back();
	       driver.navigate().forward();
	       driver.manage().window().maximize();
	       Actions Ob = new Actions (driver);     
	       
	      /*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	       WebElement Build = driver.findElement(By.id("twotabsearchtextbox"));
	
	       Build.sendKeys("furnitures");
	       
	       Ob.keyDown(Keys.CONTROL).sendKeys("a").perform();
	 
	       Ob.keyDown(Keys.CONTROL).sendKeys("c").perform();
	   
	       Ob.sendKeys(Keys.DELETE).perform();
	    
	       Ob.keyDown(Keys.CONTROL).sendKeys("v").perform();
	   
	       Build.sendKeys(Keys.ENTER);*/
	       
//HOW TO DECLEAR eXPLICITE Wit timeout? we have to call Webdriver wait class which is 
	       // WebDriverwait obj = new WebDriverWait(driver,10);
	       
Actions action = new Actions(driver);
	      //example: 
 //Explaniatio: Explicite wait timeout is used when we have to put some condition to our script must wait till our script is true or error.

      WebDriverWait obj = new WebDriverWait(driver, 10);
      obj.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("nav-link-accountList")));
      obj.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Content & Devices")));
      
      
     
	       WebElement WeAc = driver.findElement(By.id("nav-link-accountList"));
	    
	       action.moveToElement(WeAc).perform();
	 
	       WebElement gift = driver.findElement(By.linkText("Content & Devices"));
	      
	       action.moveToElement(gift).perform();
	       action.click();
	       
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
