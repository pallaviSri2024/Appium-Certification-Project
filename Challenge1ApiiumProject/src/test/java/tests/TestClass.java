package tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class TestClass extends Base {
	
	@Test
	public void testOne() throws InterruptedException, IOException
	{
		
		System.out.println("Myntra app launched successfully!");
		
		//WebElement SearchLens = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Search for brands and products\"]"));
		WebElement A1 = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]"));
		A1.click();
		Thread.sleep(10000);
		WebElement SearchLens = driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"search_default_search_text_input\"]"));
		SearchLens.click();
		System.out.println("Clicked on Search Lens");
		SearchLens.sendKeys("NiKe Shoes");
		Thread.sleep(10000);
		By SearchShoe = By.xpath("(//android.view.ViewGroup[@content-desc=\"search_autosuggest_product_click_0\"])[2]");
		WebElement SearchShoeId = driver.findElement(SearchShoe);
		SearchShoeId.click();
		Thread.sleep(10000);
		By TopShoe = By.xpath("(//android.view.ViewGroup[@content-desc=\"image_image_container\"])[1]/android.view.ViewGroup/android.widget.ImageView");
		WebElement TopShoeId = driver.findElement(TopShoe);
		TopShoeId.click();
		Thread.sleep(10000);
		System.out.println("Selected first Nike shoe displayed");
		
		By shoesize=By.xpath("//android.view.ViewGroup[@content-desc=\"size_select_6\"]/android.view.ViewGroup");
		WebElement shoesizeId = driver.findElement(shoesize);
		shoesizeId.click();
		System.out.println("selected the size of the shoe");
		
		
		By addtocart=By.xpath("//android.view.ViewGroup[@content-desc=\"buy_button\"]/android.view.ViewGroup");
		WebElement addtocartId = driver.findElement(addtocart);
		addtocartId.click();
		System.out.println("Added the shoe to the cart");
		Thread.sleep(10000);
		
		By gotobag=By.xpath("//android.view.ViewGroup[@content-desc=\"buy_button\"]/android.view.ViewGroup");
		WebElement gotobagId = driver.findElement(gotobag);
		gotobagId.click();
		System.out.println("Moved to cart");
		Thread.sleep(10000);
		
		By placeorder=By.xpath("//android.widget.Button[@resource-id=\"placeOrderButton\"]");
		WebElement placeorderId = driver.findElement(placeorder);
		placeorderId.click();
		System.out.println("Place Order button clicked");
		
		
		By selectdefaultaddress=By.xpath("//android.view.View[@resource-id=\"446671165\"]/android.widget.Image");
		WebElement selectdefaultaddressId = driver.findElement(selectdefaultaddress);
		selectdefaultaddressId.click();
		System.out.println("Selected default addresss");
		
		By Confirmbutton=By.xpath("//android.view.View[@text=\"CONFIRM\"]");
		WebElement ConfirmbuttonId = driver.findElement(Confirmbutton);
		ConfirmbuttonId.click();
		System.out.println("Selected default addresss");
		
		By Continuebutton=By.xpath("//android.widget.Button[@resource-id=\"placeOrderButton\"]");
		WebElement ContinuebuttonId = driver.findElement(Continuebutton);
		ContinuebuttonId.click();
		System.out.println("Navigate to Payment screen");
		
	}

}
