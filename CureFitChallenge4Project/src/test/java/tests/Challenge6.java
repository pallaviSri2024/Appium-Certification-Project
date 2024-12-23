package tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy.ByAccessibilityId;
import io.appium.java_client.MobileElement;

public class Challenge6 extends BaseClass{
	
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
		Thread.sleep(10000);
		
		System.out.println("Manually click on Home section.");
		Thread.sleep(30000);
		
		//WebElement Scrolled_to_ExploreAllMembership_section = driver.findElement(By.xpath("(//android.view.View[@content-desc=\"BANNER_CAROUSEL_WIDGET\"])[2]/android.view.View/android.view.View/android.widget.ImageView"));
		System.out.println("Manually Scrolled to Deal of the day section.");
		Thread.sleep(10000);
		
		WebElement Select_Deal = driver.findElement(By.xpath("(//android.view.View[@content-desc=\"MERCHANTRY_WIDGET\"])[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.ImageView"));
		Select_Deal.click();
		System.out.println("Clicked on Deal");
		Thread.sleep(20000);
		
		WebElement Select_Deal_to_buy = driver.findElement(By.xpath("(//android.view.View[@content-desc=\"BANNER_CAROUSEL_WIDGET\"])[3]/android.view.View/android.view.View/android.widget.ImageView"));
		Select_Deal_to_buy.click();
		System.out.println("Clicked on Deal to buy");
		Thread.sleep(20000);
		
		WebElement Select_final_Deal = driver.findElement(By.xpath("(//android.view.View[@content-desc=\"BANNER_CAROUSEL_WIDGET\"])[1]/android.view.View/android.view.View/android.widget.ImageView"));
		Select_final_Deal.click();
		System.out.println("Clicked on Final Deal to buy");
		Thread.sleep(20000);
		
		WebElement ClickPreferedCenter = driver.findElement(By.xpath("//android.view.View[@content-desc=\"CHECKOUT_CTA SELECT PREFERRED CENTER\"]"));
		ClickPreferedCenter.click();
		System.out.println("Clicked on Prefered Center");
		Thread.sleep(10000);
		
		WebElement SelectCenter = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Cult Indiranagar Indiranagar\"]"));
		SelectCenter.click();
		System.out.println("Clicked on Select Center");
		Thread.sleep(10000);
		
		WebElement ClickSelectStartDate = driver.findElement(By.xpath("//android.view.View[@content-desc=\"CHECKOUT_CTA SELECT START DATE\"]"));
		ClickSelectStartDate.click();
		System.out.println("Clicked on Select Start Date");
		Thread.sleep(10000);
		
		WebElement SelectDate = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"24, Tuesday, December 24, 2024\"]"));
		SelectDate.click();
		System.out.println("Clicked on Select Date");
		Thread.sleep(10000);
		
		WebElement ClickOK = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"OK\"]"));
		ClickOK.click();
		System.out.println("Clicked on Ok");
		Thread.sleep(10000);
		
		WebElement PayButton = driver.findElement(By.xpath("//android.view.View[@content-desc=\"CHECKOUT_CTA PAY ₹14996\"]"));
		PayButton.click();
		System.out.println("Clicked on Pay and navigate to checkout page");
		Thread.sleep(10000);
		
		
	}
}