package Final.Assessment.locators;

import org.openqa.selenium.By;

public class SignInPageLocators {
	protected SignInPageLocators(){}
	
	protected By Username = By.xpath("//input[@placeholder='Email or username' and @class='fld']");
	protected By Password = By.xpath("//input[@placeholder='Password' and @class='fld']");
	protected By Submit = By.xpath("//input[@class='btn ipb btn-prim sgnBtn' and @id='sgnBt']");
	
	

}
