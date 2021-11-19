package IListnersDataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookLogin2 {
   WebDriver driver;
   
   @FindBy(id = "email")WebElement Email;
   @FindBy(id = "pass")WebElement Password;
   @FindBy(name = "login")WebElement Login;
	
	


public void Emailfield(String name) {
	Email.sendKeys("Ashiqullaht@yahoo.com");
}
public void passwordfield(String name) {
	Password.sendKeys("Ashiq1");
}
public void loginfield() {
	Login.click();
}



}

