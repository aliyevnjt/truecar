package stepDefs;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pages.SellOrTradePage;
import utils.SingletonBrowser;

public class SellOrTradeStep {

	SingletonBrowser sb = SingletonBrowser.getSingletonBrowser();
	WebDriver driver = sb.getDriver();
	
	SellOrTradePage st = new SellOrTradePage (driver);
	
	
	
	@Given("User clicks on Sell or Trade button")
	public void user_clicks_on_Sell_or_Trade_button() {
	    st.sellortradebutton.click();
	}

	@Given("Verify button {string}")
	public void verify_button(String string) {
	   
	}




	
	
}
