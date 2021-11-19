package IListnersDataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ParametrizingILisnersDataProvider.Utilities;
//IListnersDataProvider.provider
public class provider extends Utilities{
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	  FacebookLogin2 FLogin = new FacebookLogin2();
	  FLogin.Emailfield(n);
	  FLogin.passwordfield(s);
	  FLogin.loginfield();
	  Thread.sleep(6000);
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "ashiqullah@gamil.com", "Ash1234" },
      new Object[] { "Ashiq@yahoo.com", "ASHI1234" },
      new Object[] { "Ash@gmail.com", "as1234" },
    };
  }
}
