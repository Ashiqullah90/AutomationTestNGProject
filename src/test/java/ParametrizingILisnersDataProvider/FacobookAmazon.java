package ParametrizingILisnersDataProvider;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.security.PublicKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class FacobookAmazon {
	WebDriver driver;
  @Test
  public void f() {
	  amazonSearchbox amazon = new amazonSearchbox(driver);
	  amazon.search();
	  amazon.clickonSearch();
	  amazon.navigate();
	 /* facebookLogin face = new facebookLogin(driver);
	  face.search();
	  face.password1();
	  face.login();*/
  }
 
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	  driver.navigate().to("https:www.amazon.com");
      driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
  }

}
