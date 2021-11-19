package DifferentBrowsers;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

//import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class EdgeChromeFirfox {
 WebDriver driver;
  @Test
  public void f() { 
	  
	  
  }
  
  @BeforeClass
  public void beforeClass() throws IOException {  
	  browsers("Firfox");
	  driver.navigate().to("https://www.amazon.com");
	  ScreenShot();
	  driver.manage().window().maximize();
	  ScreenShot();
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }
  
  public void browsers(String namesofbrowsers) {
		if (namesofbrowsers.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}else if (namesofbrowsers.equalsIgnoreCase("Firfox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}else if (namesofbrowsers.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\User\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			
		}
  }
		
	public void ScreenShot() throws IOException {
	  
    /* Date dt = new Date();
	 String di = dt.toString().replace("" , "_").replace(":" , "_");
	 System.out.println(di);
	 
	 File AmzonWeb =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     FileHandler.copy(AmzonWeb, new File("C:\\Users\\User\\eclipse-workspace\\PracticeOfProtrainingtech\\ScreenShot\\amazon.png"));
	*/	
		Date dat = new Date();
		String Dat1 = dat.toString().replace(" ", "_").replace(":", "_");
		System.out.println(Dat1);
	File ScreenShot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(ScreenShot1, new File ("C:\\Users\\User\\eclipse-workspace\\PracticeOfProtrainingtech\\ScreenShot\\picture_"+Dat1+".png"));
	 
		
	}
		
}


