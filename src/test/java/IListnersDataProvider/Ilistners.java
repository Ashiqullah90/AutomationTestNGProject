package IListnersDataProvider;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import ParametrizingILisnersDataProvider.Utilities;

public class Ilistners extends Utilities implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	System.out.println("this test started successfuly");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		// we have to write or copy pasdt our screen shot code
		String path = System.getProperty("user dir");
		this.driver = ((Utilities)result.getInstance()).driver;
		Date dat = new Date();
		String Dat1 = dat.toString().replace(" ", "_").replace(":", "_");
		System.out.println(Dat1);
	   File ScreenShot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   try {
		FileHandler.copy(ScreenShot1, new File ("C:\\Users\\User\\eclipse-workspace\\PracticeOfProtrainingtech\\ScreenShot\\passed\\picture_"+Dat1+".png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver = ((Utilities)result.getInstance()).driver;
	Date dat = new Date();
	String Dat1 = dat.toString().replace(" ", "_").replace(":", "_");
	System.out.println(Dat1);
	File ScreenShot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 try {
		FileHandler.copy(ScreenShot1, new File ("C:\\Users\\User\\eclipse-workspace\\PracticeOfProtrainingtech\\ScreenShot\\faild\\picture_"+Dat1+".png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		

			
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver = ((Utilities)result.getInstance()).driver;
		Date dat = new Date();
		String Dat1 = dat.toString().replace(" ", "_").replace(":", "_");
		System.out.println(Dat1);
	   File ScreenShot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   try {
		FileHandler.copy(ScreenShot1, new File ("C:\\Users\\User\\eclipse-workspace\\PracticeOfProtrainingtech\\ScreenShot\\skiped\\picture_"+Dat1+".png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

	
	

	
	

}
