package Final.Assessment.Pages;

import org.openqa.selenium.WebDriver;

import Final.Assessment.locators.VIPLocators;

public class VIPage extends VIPLocators{
	WebDriver driver;
	public VIPage(WebDriver driver){
		this.driver=driver;
	}
	
	public VIPage PlaceBid(){
		
		driver.findElement(BidText).sendKeys("2");
		driver.findElement(PlaceBid).click();
		
		return this;
		
	}
	

}
