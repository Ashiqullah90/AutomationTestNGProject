package comprotariningtechorg.PracticeOfProtrainingtech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\User\\\\eclipse-workspace\\\\PracticeOfProtrainingtech\\\\Drivers\\\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		
		// Xpath of amazon: /html/body/div/header/div/div/div/div/form/div/div/span/input
		/* note: we have navegate to the wesite and right click on search icon then click inespect icon them press ctrl f
		    then writh the Xpath then copy it and past it in the By.Xpath ("/html/body/div/header/div/div/div/div/form/div/div/span/input")
		*/
		WebElement SearchOfPoint = driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/span/input"));
		SearchOfPoint.click();

	}

}
