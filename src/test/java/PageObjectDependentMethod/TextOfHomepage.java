package PageObjectDependentMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextOfHomepage {

	WebDriver driver;
	//@FindBy(id = "globalContainer")WebElement hometext;
	@FindBy(xpath = "//*[contains(text(),'Connect with friends')])]")WebElement hometext;
    
	public TextOfHomepage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public String Gettext1() {
	String textget= hometext.getText();
	return textget;
	}
	

}
