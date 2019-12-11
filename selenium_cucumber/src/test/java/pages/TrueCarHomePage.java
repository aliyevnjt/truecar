package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class TrueCarHomePage {
	
	public void goToHomePage(WebDriver driver) {
		String url = System.getProperty("url");
		if(url==null) {
			url = "https://www.etsy.com/";
		}
		driver.get(url);
	}
	
	
	
}
