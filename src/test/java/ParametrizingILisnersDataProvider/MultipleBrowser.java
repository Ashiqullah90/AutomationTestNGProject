package ParametrizingILisnersDataProvider;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectDependentMethod.TextOfHomepage;

import org.testng.annotations.BeforeClass;

import java.io.IOException;

//import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MultipleBrowser extends Utilities {
 WebDriver driver;
  @Test
  public void f() { 
	  TextOfHomepage text1 = new TextOfHomepage(driver);
		String txHome = text1.Gettext1();
		 System.out.println(txHome);
		 SoftAssert soft = new SoftAssert() ;
		 soft.assertEquals("Connect with friends and the world around you on Facebook.", text1);
		 System.out.println("this is ofter Assert");
		 soft.assertAll();	
	  
  }
  
  @BeforeClass
  public void beforeClass() throws IOException {   
	  driver = new ChromeDriver();
	  driver.navigate().to("https://www.facebook.com");
	  driver.manage().window().maximize();
	  
	  
	  
  }

}