package stepDefs;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.SellOrTrade;
import pages.ShopNew;
import pages.TrueCarHomePage;
import utils.SingletonBrowser;

public class SellOrTradeStep {
	SingletonBrowser sb = SingletonBrowser.getSingletonBrowser();
	WebDriver driver = sb.getDriver();
	TrueCarHomePage hp = new TrueCarHomePage();
	SellOrTrade sot = new SellOrTrade(driver);
	
	@Given("User clicks on Sell or trade")
	public void user_clicks_on_Sell_or_trade() {
	  sot.buttonSellOrTrade.click();
	}

	@Then("Verify button {string}")
	public void verify_button(String string) {
	   sot.verifyBotton(driver, string);
	}

	
	
}
