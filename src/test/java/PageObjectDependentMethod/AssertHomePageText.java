package PageObjectDependentMethod;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class AssertHomePageText {
	WebDriver driver;
  @Test
  public void f() {
	 TextOfHomepage text1 = new TextOfHomepage(driver);
	 text1.Gettext1();
	 System.out.println(text1);
	// Assert.assertEquals("Connect with friends and the world around you on Facebook.", text1);
	 
	 // WE HAVE TO CREAT ASSERT OBJECT
	 SoftAssert soft = new SoftAssert() ;
	 soft.assertEquals("Connect with friends and the world around you on Facebook.", text1);
	 System.out.println("this is ofter Assert");
	 soft.assertAll();				
	}
   
  @Test	
  @BeforeClass 
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
		
      WebDriver driver = new ChromeDriver();
      driver.navigate().to("https:www.facebook.com");
      driver.navigate().back();
      driver.navigate().forward();
      driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  
  }

}
