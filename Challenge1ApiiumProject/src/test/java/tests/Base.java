package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Base {
	
	public static AppiumDriver driver;
	
	@BeforeTest
	public void setup() throws MalformedURLException, InterruptedException {
		{
			UiAutomator2Options options = new UiAutomator2Options()
											.setPlatformVersion("9")
											.setPlatformName("Android")
											.setDeviceName("emulator-5554")
											.setAppPackage("com.myntra.android")
											.setAppActivity("com.myntra.android.activities.react.ReactActivity");
			
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
					
			Thread.sleep(5000);
		}
	}
	

	@AfterTest
	public void teardown() {
		
		driver.quit();
		
	}
}
