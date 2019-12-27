package stepDefs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.SellTrade;
import pages.ShopNew;
import pages.TrueCarHomePage;
import utils.SingletonBrowser;

public class SellTradeCars {
	
	SingletonBrowser sb = SingletonBrowser.getSingletonBrowser();
	WebDriver driver = sb.getDriver();
	TrueCarHomePage hp = new TrueCarHomePage();
	ShopNew sn = new ShopNew(driver);
	SellTrade st= new SellTrade(driver);
	
	@Given("User clicks on Sale and Trade")
	public void user_clicks_on_Sale_and_Trade() {
	   st.buttonSellTrade.click();
	}

	@Then("Verify first header contains {string}")
	public void verify_first_header_contains(String string) throws InterruptedException {
		Thread.sleep(4000);
		st.verfyELP(driver, string);
	}

	@Then("Verify second header contains {string}")
	public void verify_second_header_contains(String string) throws InterruptedException {
		Thread.sleep(4000);
		st.verfyenterVIN(driver, string);
	}

	@Then("Verify third header contains {string}")
	public void verify_third_header_contains(String string) throws InterruptedException {
st.enterMakeModel(driver, string);
}

	
}