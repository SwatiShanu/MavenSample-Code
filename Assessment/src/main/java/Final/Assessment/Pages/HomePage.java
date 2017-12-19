package Final.Assessment.Pages;

import org.openqa.selenium.WebDriver;

import Final.Assessment.Commons.Commons;
import Final.Assessment.locators.HomePageLocators;


public class HomePage extends HomePageLocators {
	WebDriver driver;
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	
	public HomePage clickSignin(){
		driver.findElement(Sign_In).click();
		return this;
		
	}
	
	public HomePage searchItem(){
		driver.get(Commons.URL.Ebay + "itm/-/162340354049");
		return this;
		
	}
	
	
}
