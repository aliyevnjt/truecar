package stepDefs;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
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
import utils.SingletonBrowser;
import utils.Utility;
public class EtsyTopMenuStepDefs {
	
	SingletonBrowser sb = SingletonBrowser.getSingletonBrowser();
	WebDriver driver = sb.getDriver();
	EtsyHomePage eh= new EtsyHomePage(driver);
	TrueCarHomePage hp = new TrueCarHomePage();
	
	@Given("User is on etsy home page")
	public void user_is_on_etsy_home_page() {
	    hp.goToHomePage(driver);
	}
	@Given("User selects {string}")
	public void user_selects(String language) {
	   eh.selectEnglish(driver, language);
	}
	
	@Given("Verify number of top menus is {int}")
	public void verify_number_of_top_menus_is(int expectedNumberOfTopMenus) {
	   int actualNumberOfTopMenus= eh.menubar.size();
	   assertEquals(expectedNumberOfTopMenus, actualNumberOfTopMenus);
	   
		
	}

	@Then("Verify top menu items are")
	public void verify_top_menu_items_are(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		Thread.sleep(4000);
	   List<String> actualTopMenus=Utility.webElementToStringList(eh.menubar) ;
	    
	    
	    List<String> expectedTopMenus1=dataTable.asList();
	    List<String> expectedTopMenus=new ArrayList<String>();
	    
	    for (String string : expectedTopMenus1) {
	    	expectedTopMenus.add(string);
		
	    }
	    Collections.sort(actualTopMenus);
	    Collections.sort(expectedTopMenus);
	    System.out.println(actualTopMenus);
	    System.out.println(expectedTopMenus);
	    assertTrue(actualTopMenus.equals(expectedTopMenus));
	}
	@Then("Verify top menu  items are from Jewelry & Accessories")
	public void verify_top_menu_items_are_from_Jewelry_Accessories(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		Thread.sleep(4000);
		eh.hoverOver(driver);
		Thread.sleep(4000);
		   List<String> actualJewelryOptions=Utility.webElementToStringList(eh.jewelryOptionsList) ;
		    
		    
		    List<String> expectedTopMenus1=dataTable.asList();
		    List<String> expectedJewelryOptions=new ArrayList<String>();
		    
		    for (String string : expectedTopMenus1) {
		    	expectedJewelryOptions.add(string);
			
		    }
		    Collections.sort(actualJewelryOptions);
		    Collections.sort(expectedJewelryOptions);
		    System.out.println(actualJewelryOptions);
		    System.out.println(expectedJewelryOptions);
		    assertTrue(actualJewelryOptions.equals(expectedJewelryOptions)); 
	    
	}
}

