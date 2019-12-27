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

import io.cucumber.java.en.Then;
import pages.EtsyHomePage;
import pages.Etsy_PageToShoping;
import pages.TrueCarHomePage;
import utils.SingletonBrowser;

public class Etsy_Shop_Details {

	SingletonBrowser sb = SingletonBrowser.getSingletonBrowser();
	WebDriver driver = sb.getDriver();
	EtsyHomePage eh= new EtsyHomePage(driver);
	Etsy_PageToShoping ep= new Etsy_PageToShoping(driver);
	
	@Then("Shop for {string}")
	public void shop_for(String string) throws InterruptedException {
		Thread.sleep(4000);
	   ep.searchItem.sendKeys(string + Keys.ENTER);
	}

	@Then("Select first item")
	public void select_first_item() {
	   eh.firstSearchResult.click();
	}

	@Then("Verify page contains {string}")
	public void verify_page_contains(String string) {
		System.out.println(driver.getTitle());
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
	   	    driver.switchTo().window(tabs2.get(0));
	    System.out.println(driver.getTitle());
	    assertEquals(shop.itemDetails.getText(), string);
	}
}
