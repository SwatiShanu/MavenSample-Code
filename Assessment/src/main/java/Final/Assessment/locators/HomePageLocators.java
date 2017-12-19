package Final.Assessment.locators;

import org.openqa.selenium.By;

public class HomePageLocators {
	protected HomePageLocators(){}
	
	protected By Sign_In = By.xpath("//*[contains(text(),'Sign in')]");
	protected By Search = By.cssSelector(".gh-tb.ui-autocomplete-input");
			

}
