package tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestClass1 extends Base {
	
	@Test
	public void testOne() throws InterruptedException, IOException
	{
		
		System.out.println("Myntra app launched successfully!");
		
		WebElement A1 = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]"));
		A1.click();
		Thread.sleep(10000);
		
		By SelectPhoto= By.xpath("//android.view.ViewGroup[@content-desc=\"PHOTO_SEARCH_1_2\"]/android.view.ViewGroup");
		WebElement SelectPhotoId = driver.findElement(SelectPhoto);
		SelectPhotoId.click();
		System.out.println("Clicked on Select Photo Icon");
		Thread.sleep(10000);
		
			
		By ClickSearch= By.xpath("//android.widget.Button[@resource-id=\"com.myntra.android:id/Search\"]");
		WebElement ClickSearchId = driver.findElement(ClickSearch);
		ClickSearchId.click();
		System.out.println("Clicked on Searched Item");
		
		
		
		
	}
}
