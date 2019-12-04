package stepDefs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pages.ShopNew;
import pages.TrueCarHomePage;
import utils.SingletonBrowser;


public class ShopNewCarBrands {
	
	
	SingletonBrowser sb = SingletonBrowser.getSingletonBrowser();
	WebDriver driver = sb.getDriver();
	TrueCarHomePage hp = new TrueCarHomePage();
	ShopNew sn = new ShopNew(driver);
	
	@Given("User is on true car home page")
	public void user_is_on_true_car_home_page() {
		
		hp.goToHomePage(driver);
	}

	@Given("User clicks on Shop New")
	public void user_clicks_on_Shop_New() {
	   sn.buttonShopNew.click();
	}
	

	@Then("User clicks on brand {string}")
	public void user_clicks_on_brand(String string) {
	    ShopNew.selectModel(driver, string);
	}

	@Then("User selects model {string}")
	public void user_selects_model(String string) {
	    ShopNew.selectBodyType(driver, string);
	}

	@Then("User inputs zip code {string}")
	public void user_inputs_zip_code(String string) {
	    sn.zipCode.sendKeys(string);
	}

	@Then("Next")
	public void next() {
	   sn.next.click();
	}

	@Then("Skip for now")
	public void skip_for_now() {
	    sn.skip(driver);
		//sn.skip.click();
	}

	@Then("Verify header is {string}")
	public void verify_header_is(String expectedHeader) {
	   String actualHeader = sn.header.getText();
	   assertEquals(expectedHeader, actualHeader);
	}

	@Then("Verify Style is {string}")
	public void verify_Style_is(String expectedStyleName) {
	   String actualStyleName = sn.styleName.getText();
	   assertEquals(expectedStyleName, actualStyleName, actualStyleName);
	}

	@Then("Verify Standard Features & Specs contains {string}")
	public void verify_Standard_Features_Specs_contains(String expectedSpecs) {
	    String actualSpecs = sn.specs.getText();
	    assertTrue(actualSpecs,actualSpecs.contains(expectedSpecs));
	}
}
