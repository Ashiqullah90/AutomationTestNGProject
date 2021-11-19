package PageObjectDependentMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page1 {

	WebDriver driver;
	
	@FindBy(linkText = "New Releases") WebElement newreleas;
	@FindBy(className = "nav-input nav-progressive-attribute")WebElement Search;
	@FindBy(linkText = "Fashion") WebElement fashion;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
