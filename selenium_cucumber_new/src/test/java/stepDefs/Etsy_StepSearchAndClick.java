package stepDefs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.TrueCarHomePage;
import pages.EtsyHomePage;
import pages.Etsy_PageToShoping;
import utils.SingletonBrowser;
import utils.Utility;


public class Etsy_StepSearchAndClick {

	SingletonBrowser sb = SingletonBrowser.getSingletonBrowser();
	WebDriver driver = sb.getDriver();
	EtsyHomePage eh= new EtsyHomePage(driver);
	TrueCarHomePage hp = new TrueCarHomePage();
	Etsy_PageToShoping ep= new Etsy_PageToShoping(driver);
	
	
	@Given("User search item {string}")
	public void user_search_item(String item) throws InterruptedException {
		Thread.sleep(4000);
	    ep.searchItem.sendKeys(item + Keys.ENTER);
	    
	}

	@Then("User click to special offers {string}")
	public void user_click_to_special_offers(String spechOffers) throws InterruptedException {
		Thread.sleep(4000);
	    ep.clickSpechOffers(driver, spechOffers);
	}

	@Then("User click to price {string}")
	public void user_click_to_price(String price) throws InterruptedException {
		Thread.sleep(4000);
	    ep.clickSpechOffers(driver, price); 
	}

	@Then("User click to country {string}")
	public void user_click_to_country(String country) throws InterruptedException {
	    Thread.sleep(4000);
	    ep.clickToCountry(driver, country);
	}

	


}
