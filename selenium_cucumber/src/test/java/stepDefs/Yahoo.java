package stepDefs;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import utils.SingletonBrowser;

public class Yahoo {
	
	WebDriver driver;
	SingletonBrowser sb = SingletonBrowser.getSingletonBrowser();

	
	@Given("I am on Yahoo Home Page {string}")
	public void i_am_on_Yahoo_Home_Page(String url) {
		 driver = sb.getDriver();
		    driver.get(url);
	}
}
