package ParametrizingILisnersDataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebookLogin {
	WebDriver driver;
	
	@FindBy(xpath = "//*[@aria-label=\"Email or phone number\"]")WebElement searchbox;
	@FindBy(id = "pass")WebElement password;
	@FindBy(name = "login")WebElement log;

	public facebookLogin (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void search() {
		searchbox.sendKeys("ashiqullaht@yahoo.com");
		
	}
	public void password1() {
		password.sendKeys("Ashiqullah");
		
	}
	public void login() {
		log.click();
		
	}
}
