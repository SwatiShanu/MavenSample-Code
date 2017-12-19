package Final.Assessment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Final.Assessment.Commons.Commons;
import Final.Assessment.Pages.HomePage;
import Final.Assessment.Pages.SearchItemPAge;
import Final.Assessment.Pages.SignInPage;
import Final.Assessment.Pages.VIPage;




public class testPlaceBid {
	
	WebDriver driver;
	@BeforeMethod
	public void initDriver(){
		System.setProperty("webdriver.chrome.driver", "C://Users//swakumari//Downloads//chromedriver_win32//chromedriver.exe");
		this.driver = new ChromeDriver();
		
	}
	
	@Test
	public void PlaceBIDonItem(){
		driver.get(Commons.URL.Ebay);
		new HomePage(driver).clickSignin();
		new SignInPage(driver).SignIn();
		new HomePage(driver).searchItem();
		new VIPage(driver).PlaceBid();
		
		driver.quit();
		
	}
	

}
