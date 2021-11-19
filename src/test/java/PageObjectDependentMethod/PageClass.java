package PageObjectDependentMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageClass {
	WebDriver driver;
	
	@FindBy(id = "twotabsearchtextbox") WebElement Searchbox;
	@FindBy(id = "nav-search-submit-button")WebElement Searchbutton;
	@FindBy(linkText  = "Registry")WebElement registry;
	

	public PageClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Searchbox() {
		Searchbox.sendKeys("computer");
		
	}
	
	public void Searchbutton() {
		Searchbutton.click();
		
	}
	
	public void registry() {
		registry.click();
		
	}
}
