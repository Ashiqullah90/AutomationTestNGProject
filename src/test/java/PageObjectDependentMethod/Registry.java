package PageObjectDependentMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registry {
     
	WebDriver driver;
	@FindBy(name = "name")WebElement Input;
	@FindBy(xpath = "(//*[@aria-label=\"Search\"])[2]")WebElement Searchclick;
	
	
	public Registry (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	public void Registrant() {
		Input.sendKeys("Ashiqullah");
	}
	public void Searchclick() {
		Searchclick.click();
	}
	
}
