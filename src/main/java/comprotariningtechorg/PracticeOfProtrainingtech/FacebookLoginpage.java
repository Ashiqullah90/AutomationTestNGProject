package comprotariningtechorg.PracticeOfProtrainingtech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLoginpage {
  static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
		
	       WebDriver driver = new ChromeDriver();
	       driver.navigate().to("https:www.facebook.com");
	       driver.navigate().back();
	       driver.navigate().forward();
	       driver.manage().window().maximize();
	       
	       WebElement creat = driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']"));
	       creat.click();
	      Thread.sleep(6000);
	      
	     /* WebElement input = driver.findElement(By.xpath("//*[@name=\"firstname\"]"));
	      input.click();
	      Thread.sleep(6000);
	      input.sendKeys("Ashiqullah");
	      Thread.sleep(4000);
	      
	     WebElement lastnam = driver.findElement(By.xpath("//*[@name=\"lastname\"]"));
	     lastnam.click();
	     lastnam.sendKeys("Raiyan");
	     Thread.sleep(6000);
	     
	     WebElement phoneN = driver.findElement(By.xpath("//*[@aria-label=\"Mobile number or email\"]"));
	     phoneN.sendKeys("2404958561");
	     Thread.sleep(6000);
	     
	     WebElement password1 = driver.findElement(By.xpath("//*[@data-type=\"password\"]"));
	     password1.sendKeys("Ash12345");
	     Thread.sleep(4000);*/
	     
	     WebElement birth = driver.findElement(By.xpath("//*[@title=\"Month\"]"));
	     Select Birthob = new Select(birth);
	     Birthob.selectByIndex(4);
	     Thread.sleep(2000);
	     
	     WebElement Month1 =driver.findElement(By.xpath("//*[@title=\"Day\"]"));
	     Select month = new Select(Month1);
	     month.selectByValue("6");
	     Thread.sleep(6000);
	     
	     WebElement Year2 = driver.findElement(By.xpath("//*[@aria-label=\"Year\"]"));
	     Select year = new Select(Year2);
	     year.selectByIndex(2);
	     Thread.sleep(6000);
	     
	     WebElement Gender = driver.findElement(By.xpath("(//*[@value=\"2\"])[3]"));
	    Gender.click();
	     Thread.sleep(2000);
	    
	     
	     
	    WebElement Signin = driver .findElement(By.xpath("(//*[@type=\"submit\"])[3]"));
	  Signin.click();
	     
	     
 

	}

}
