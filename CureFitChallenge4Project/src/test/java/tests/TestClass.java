package tests;

import java.io.IOException;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.time.Duration;
import io.appium.java_client.android.AndroidDriver;

public class TestClass extends BaseClass {
	
	@Test
	public void testOne() throws InterruptedException, IOException
	{
		
		System.out.println("Cure Fit app launched successfully!");
		Thread.sleep(5000);
		
		System.out.println("Sending app to the background...");
		((AndroidDriver) driver).runAppInBackground(Duration.ofSeconds(5));
		
		System.out.println("App is brought back to foreground.");
        Thread.sleep(2000);
        
        System.out.println("Killing the app...");
        ((AndroidDriver) driver).terminateApp("fit.cure.android");
        
        boolean isAppRunning = ((AndroidDriver) driver).isAppInstalled("fit.cure.android");
        System.out.println("Is the app running? " + isAppRunning);
	}
	

}
