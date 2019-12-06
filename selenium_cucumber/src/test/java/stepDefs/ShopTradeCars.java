package stepDefs;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import pages.ShopTrade;
import pages.ShopUsed;
import utils.SingletonBrowser;

public class ShopTradeCars {
	SingletonBrowser sb = SingletonBrowser.getSingletonBrowser();
	WebDriver driver = sb.getDriver();
	ShopTrade su = new ShopTrade(driver);

	
	@Given("User clicks on Sell or Trade")
	public void user_clicks_on_Sell_or_Trade() {
	   su.buttonShopOrTrade.click();
	}

	@Given("Verify text contain first  {string}")
	public void verify_text_contain_first(String string) {
	   su.verifyPlate.getText();
	}

	@Given("Verify text contain second{string}")
	public void verify_text_contain_second(String string) {
	    
	}

	@Given("Verify text contain third{string}")
	public void verify_text_contain_third(String string) {
	  
	}	
	
	
	
	
	
}
