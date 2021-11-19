package comprotariningtechorg.PracticeOfProtrainingtech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\User\\\\eclipse-workspace\\\\PracticeOfProtrainingtech\\\\Drivers\\\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		Actions action2 = new Actions(driver);
		
		WebElement action3 = driver.findElement(By.id("nav-link-accountList"));
		Thread.sleep(4000);
		action2.moveToElement(action3).build().perform();
		Thread.sleep(4000);
		
		WebElement Order1 = driver.findElement(By.linkText("Orders"));
		action2.moveToElement(Order1).click().build().perform();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		WebElement action4 = driver.findElement(By.id("nav-link-accountList"));
		Thread.sleep(4000);
		action2.moveToElement(action4).build().perform();
		Thread.sleep(4000);
		
		
		WebElement Brows = driver.findElement(By.linkText("Browsing History"));
		action2.moveToElement(Brows).build().perform();
		
		
	}

}
