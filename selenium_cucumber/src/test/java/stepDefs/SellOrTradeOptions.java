package stepDefs;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import pages.SellOrTrade;
import pages.TrueCarHomePage;
import utils.SingletonBrowser;

public class SellOrTradeOptions {
	
	SingletonBrowser sb = SingletonBrowser.getSingletonBrowser();
	WebDriver driver = sb.getDriver();
	TrueCarHomePage hp = new TrueCarHomePage();
     SellOrTrade st = new SellOrTrade(driver);
	
	@Given("User clicks on Sell or Trade")
	public void user_clicks_on_Sell_or_Trade() {
	st.buttonSellOrTrade.click();  
	}

	@Given("Verify  contains {string}")
	public void verify_contains(String string) {
   st.verifyText(driver, string);
    
	}
}
