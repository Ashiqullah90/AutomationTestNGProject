package comprotariningtechorg.PracticeOfProtrainingtech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsOfBrowser {

	
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		                // webdriver interface
                        // set chrom driver path
		             // now how to open it
//		driver.get(" https://www.ebay.com");
		//	driver.navigate().refresh();
		//	driver.manage().window().maximize();
			
			// how to thread sleep the browser
			//Thread.sleep(600);
			// how to refresh the browser
			// 2 syntix how to open the website
				
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		/*driver.navigate().to("https://www.ebay.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().forward();
		driver.manage().window().maximize();
		driver.navigate().refresh();*/
		driver.navigate().to("https://www.bbc.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.close();
		
		
		
		
	}

}
