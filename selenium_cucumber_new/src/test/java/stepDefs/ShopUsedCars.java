package stepDefs;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pages.ShopUsed;
import utils.SingletonBrowser;
public class ShopUsedCars {
	SingletonBrowser sb = SingletonBrowser.getSingletonBrowser();
	WebDriver driver = sb.getDriver();
	ShopUsed su = new ShopUsed(driver);
	@Given("User clicks on Shop Used")
	public void user_clicks_on_Shop_Used() {
	    su.buttonShopUsed.click();
	}

	@Then("User clicks on used car brand {string}")
	public void user_clicks_on_used_car_brand(String string) {
	    ShopUsed.selectBrand(driver, string);
	}
	
	@Then("User selects used car model {string}")
	public void user_selects_used_car_model(String model) {
	   su.buttonAllModels.click();
	   ShopUsed.selectModel(driver, model);
	}

	@And("Verify header contains {string}")
	public void verify_header_contains(String expectedHeader) throws InterruptedException {
		Thread.sleep(2000);
	    String actualHeader = su.usedHeader.getText();
	    assertTrue(actualHeader,actualHeader.contains(expectedHeader));
	}

	
}
