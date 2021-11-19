package IListnersDataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.swing.text.Utilities;

import org.testng.annotations.Test;

public class properties extends Utilities{
  @Test
  public void f() throws InterruptedException, IOException {
	  Properties property = new Properties();
	  FileInputStream filob = new FileInputStream ("C:\\Users\\User\\eclipse-workspace\\PracticeOfProtrainingtech\\src\\Production.properties");
	  property.load(filob);
	  String id = property.getProperty("ids");
	  String pass = property.getProperty("pass");
	  
	  FacebookLogin2 FLogin = new FacebookLogin2();
	  FLogin.Emailfield(id);
	  FLogin.passwordfield(pass);
	  FLogin.loginfield();
	  Thread.sleep(6000);
  }
}
