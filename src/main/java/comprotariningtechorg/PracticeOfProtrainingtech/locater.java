package comprotariningtechorg.PracticeOfProtrainingtech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locater {

	
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\User\\\\eclipse-workspace\\\\PracticeOfProtrainingtech\\\\Drivers\\\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement emailfiled = driver.findElement(By.name("email"));
		emailfiled.sendKeys("ashiqullaht@yahoo.com");
		Thread.sleep(6000);
		WebElement linktx = driver.findElement(By.linkText("Forgot Password"));
	    //WebElement linktx = driver.findElement(By.partialLinkText("Forgot"));
		
		linktx.click();
		
		
		
		
		
		
	}

}
