package tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Tests extends BaseClass {
	
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
		driver.get("https://www.myntra.com/");
		Thread.sleep(12000);
		
		System.out.println("Opening website");
			
		Thread.sleep(20000);
		
		By homeSearchBox = By.xpath("//android.view.View[@resource-id=\"reactPageContent\"]/android.view.View[1]/android.view.View");
		WebElement homeTypeSearch= driver.findElement(homeSearchBox);
		homeTypeSearch.click();
		System.out.println("Waiting to log in");
		Thread.sleep(12000);

		By loginId=By.xpath("//android.view.View[@resource-id=\"mainReactContent\"]");
		WebElement loginTypeSearch= driver.findElement(loginId);
		loginTypeSearch.click();
		
		By loginIdTxt=By.xpath("//android.widget.EditText");
		WebElement loginTypeSearchTxt= driver.findElement(loginIdTxt);
		loginTypeSearchTxt.sendKeys("9560862333");
		System.out.println("Phone number entered");
		Thread.sleep(12000);
		By loginBtn=By.xpath("//android.widget.TextView[@text=\"CONTINUE\"]");
		
		System.out.println("fetching OTP");
		//Thread.sleep(10000);
		WebElement webLoginBtn= driver.findElement(loginBtn);
		webLoginBtn.click();
		
		homeTypeSearch.sendKeys("Nike Shoes");
		By searchbutton=By.xpath("//body/div[@id='mountPoint']/div/div[@class='layout']/div[@id='mainContent']/div[@id='MyntraReactContent']/div/div[@id='mainReactContent']/div[@id='reactPageContent']/div[@class='search-box-page-ctn']/div[@class='search-box-cont']/div[@class='search-box']/div[@class='search-wrap']/div[@class='ripple-container query-search-button query-action']/span[1]//*[name()='svg']");
		WebElement searchbuttonId = driver.findElement(searchbutton);
		searchbuttonId.click();
		System.out.println("Searching for Nike shoes");
		
		By topshoe=By.xpath("(//h3[@class='prod-title text-md'][normalize-space()='Nike'])[1]");
		WebElement topshoeId = driver.findElement(topshoe);
		topshoeId.click();
		System.out.println("Selected first Nike shoe displayed");
		
		By shoesize=By.xpath("(//div[@class='css-901oao r-1qze398'][normalize-space()='5'])[1]");
		WebElement shoesizeId = driver.findElement(shoesize);
		shoesizeId.click();
		System.out.println("selected the size of the shoe");
		
		By addtocart=By.xpath("//div[@class='css-901oao r-jwli3a r-1qze398 r-ubezar']");
		WebElement addtocartId = driver.findElement(addtocart);
		addtocartId.click();
		System.out.println("Added the shoe to the cart");
		
		By paymentscreen=By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-eu3ka r-1777fci']");
		WebElement paymentscreenId = driver.findElement(paymentscreen);
		paymentscreenId.click();
		System.out.println("Navigated to the payment screen");
		
	}
}
