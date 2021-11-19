package ParametrizingILisnersDataProvider;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Utilities {
	public WebDriver driver;
  @Test
  public void f() {
  }
  
  @Parameters({"browser,URL"})
  @BeforeClass
  public void beforeClass(String namesofbrowsers, String Website) {
	  
	if (namesofbrowsers.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(Website);
		driver.manage().window().maximize();
				
	}else if (namesofbrowsers.equalsIgnoreCase("Firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(Website);
		driver.manage().window().maximize();
		
				
	}else if (namesofbrowsers.equalsIgnoreCase("Edge")) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\User\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.navigate().to(Website);
		driver.manage().window().maximize();
				
			}
  }

  
  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }
  public void ScreenShot() throws IOException {
  Date dat = new Date();
	String Dat1 = dat.toString().replace(" ", "_").replace(":", "_");
	System.out.println(Dat1);
   File ScreenShot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   FileHandler.copy(ScreenShot1, new File ("C:\\Users\\User\\eclipse-workspace\\PracticeOfProtrainingtech\\ScreenShot\\picture_"+Dat1+".png"));

}
  }
