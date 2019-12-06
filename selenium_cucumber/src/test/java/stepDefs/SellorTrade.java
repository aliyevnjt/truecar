package stepDefs;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.SellTradeNew;
import utils.SingletonBrowser;

public class SellorTrade {
	SingletonBrowser sb = SingletonBrowser.getSingletonBrowser();
	WebDriver driver = sb.getDriver();
	SellTradeNew se = new  SellTradeNew(driver);
	
	

	

	@Given("User clicks on Sell or Trade")
	public void user_clicks_on_Sell_or_Trade() {
		se.clicksell.click();
	   
	}

	@Then("Verify header contains{string},{string},{string}")
	public void verify_header_contains(String string, String string2, String string3) {
	  se.veridyhed(driver, string3);
	}



}
