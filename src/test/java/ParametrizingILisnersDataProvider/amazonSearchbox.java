package ParametrizingILisnersDataProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonSearchbox {
     WebDriver driver;
	
	@FindBy(name = "field-keywords")WebElement searchfeild;
	@FindBy(linkText = "Customer Service")WebElement Customer;
	@FindBy(id = "nav-search-submit-button")WebElement searchbutonclick;
	
	
	
	public amazonSearchbox (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void search() {
		searchfeild.sendKeys("computers");
		
	}
	public void clickonSearch() {
		searchbutonclick.click();
		
	}
	public void navigate() {
		Customer.click();
		
		
	}
}
