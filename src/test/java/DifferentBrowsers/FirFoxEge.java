package DifferentBrowsers;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirFoxEge {
  static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\geckodriver.exe");
	    //  driver = new WebDriver();
	       driver.navigate().to("https://www.amazon.com");
	       driver.navigate().back();
	       driver.navigate().forward();
	       driver.manage().window().maximize();
		
	       
	       /*System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       
	       System.setProperty("webdriver.firfox.driver", "C:\\Users\\User\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\geckodriver.exe");
	       driver = new FirfoxDriver();
	       
	       System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\msedgedriver.exe");
	   	  driver = new EdgeDriver();*/
	   	
		
		
		
		
		
		
		
		

	}

}
