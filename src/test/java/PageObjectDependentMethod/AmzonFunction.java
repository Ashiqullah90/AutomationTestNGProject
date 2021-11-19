package PageObjectDependentMethod;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class AmzonFunction {
	WebDriver driver;
  @Test(priority = 0)
  public void f() throws InterruptedException {
	  PageClass ob = new PageClass (driver);
	  
	  ob.Searchbox();
	  ob.Searchbutton();
	  ob.registry();
	  Registry ob3 = new Registry(driver);
	  ob3.Registrant();
	  ob3.Searchclick();  
  }
  
  @Test (priority = 1)
  public void Registry1() {
	  Registry ob3 = new Registry(driver);
	  ob3.Registrant();
	  ob3.Searchclick();
  }
  
  
  
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\User\\\\eclipse-workspace\\\\PracticeOfProtrainingtech\\\\Drivers\\\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  
	  
  }

}
