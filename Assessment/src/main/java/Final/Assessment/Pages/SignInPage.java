package Final.Assessment.Pages;

import org.openqa.selenium.WebDriver;

import Final.Assessment.locators.SignInPageLocators;

public class SignInPage extends SignInPageLocators{
	
	WebDriver driver;
	public SignInPage(WebDriver driver){
		this.driver = driver;
	}
	
	public SignInPage SignIn (){
		driver.findElement(Username).sendKeys("testaunone");
		driver.findElement(Password).sendKeys("Buy1tN0w#");
		driver.findElement(Submit).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return this;
		
	}

}
