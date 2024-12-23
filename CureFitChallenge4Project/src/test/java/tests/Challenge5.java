package tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.FindsByClassName;
import org.openqa.selenium.internal.FindsByXPath;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy.ByAccessibilityId;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.SupportsNetworkStateManagement;

public class Challenge5 extends BaseClass{
	
	@Test
	public void testOne() throws InterruptedException, IOException
	{
		String apiKey="482b09a384237c1256f9e56ffcd2ce326f7a";
		Thread.sleep(4000);
		WebElement btn=driver.findElement(By.id("com.android.chrome:id/signin_fre_continue_button"));
		btn.click();
		Thread.sleep(2000);
		WebElement btn2=driver.findElement(By.id("com.android.chrome:id/button_primary"));		
		btn2.click();
		
		Thread.sleep(20000);
		System.out.println("Cure Fit app launched successfully!");
		Thread.sleep(20000);
		
		
		WebElement AtHome = driver.findElement(By.xpath("(//android.view.View[@content-desc=\"BANNER_CAROUSEL_WIDGET\"])[1]/android.view.View/android.view.View/android.widget.ImageView[3]"));
		
		AtHome.click();
		System.out.println("Clicked on At Home section");
		Thread.sleep(20000);
		 
		WebElement Programs = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Programs\"]"));
		Programs.click();
		System.out.println("Navigated to downloaded videos section...");
		Thread.sleep(20000);
		 
		// Turn off internet connection (Airplane Mode or disable WiFi/Cellular programmatically if possible)
	        // This step might require adb commands or manual intervention, as Appium does not control network settings directly.
	     System.out.println("Please disable internet connection manually to proceed.");
	     Thread.sleep(5000); // Wait for manual action
		 
		 System.out.println("watching the video if it plays when internet is off");
		 
		 WebElement WatchVideo = driver.findElement(By.id("CF_IMAGE_LOADED/https://cdn-images.cure.fit/www-curefit-com/image/upload/w_796,q_auto:eco,f_auto,c_fit//image/vm/38a0a8db-974c-483e-82c3-9e7ab88de8c8.png"));
		 WatchVideo.click();
	}
	

}
