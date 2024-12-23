package tests;

import java.net.MalformedURLException;
import java.net.URL;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseClass 
{
	public static AppiumDriver driver;

	@BeforeClass		
	
	public void OpenApp() throws MalformedURLException, InterruptedException
	{
		UiAutomator2Options options = new UiAutomator2Options()
										.setPlatformVersion("9")
										.setPlatformName("Android")
										.setDeviceName("emulator-5554")
										.setAppPackage("com.android.chrome")
										.setAppActivity("com.google.android.apps.chrome.Main");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
				
		Thread.sleep(5000);
	}

	
	@AfterClass


	public void teardown()
	{
		driver.quit();
	}
	

}
