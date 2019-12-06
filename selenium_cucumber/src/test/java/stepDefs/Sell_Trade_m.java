package stepDefs;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Sell_Trade_Page_m;
import pages.ShopNew;
import pages.TrueCarHomePage;
import utils.SingletonBrowser;

public class Sell_Trade_m {
	SingletonBrowser sb = SingletonBrowser.getSingletonBrowser();
	WebDriver driver = sb.getDriver();
	TrueCarHomePage hp = new TrueCarHomePage();
	Sell_Trade_Page_m st = new Sell_Trade_Page_m(driver);
	
	@Given("User clicks on Sell or Trade menu")
	public void user_clicks_on_Sell_or_Trade_menu() {
	    st.sell_trade.click();
	}

	@Then("Verify menu {string}")
	public void verify_menu(String string) {
	   List<String> expectedList = Arrays.asList("Enter License Plate", "Enter VIN", "Enter Make/Model"); 
	   assertEquals(expectedList, Sell_Trade_Page_m.listMenuItems(driver));
	}
}