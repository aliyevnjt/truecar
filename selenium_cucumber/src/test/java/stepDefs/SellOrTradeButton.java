package stepDefs;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.SellOrTrade;
import pages.ShopNew;
import pages.TrueCarHomePage;
import utils.SingletonBrowser;

public class SellOrTradeButton {
	
	SingletonBrowser sb = SingletonBrowser.getSingletonBrowser();
	WebDriver driver = sb.getDriver();
	TrueCarHomePage hp = new TrueCarHomePage();
	SellOrTrade st = new SellOrTrade(driver);
	
	@Given("User clicks on Sell or Trade")
	public void user_clicks_on_Sell_or_Trade() {
	    st.trade_button.click();
	}
	@Then("Verify context of {string}")
	public void verify_context_of(String string) {
	    List <String> expectedlist = new ArrayList <String>(Arrays.asList("Enter License Plate","Enter VIN","Enter Make/Model"));
	    assertEquals(expectedlist,SellOrTrade.tabs(driver));
	}
	
	}


