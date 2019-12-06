package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sell_Trade_Page_m {
	
	public Sell_Trade_Page_m(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(css = "a[data-test='navTrade']")
	public WebElement sell_trade;
	
	public static List listMenuItems(WebDriver driver) {
		List<WebElement> listMenuItems = new ArrayList<WebElement>();
		listMenuItems = driver.findElements(By.cssSelector("div[data-qa='TradeFormSelector'] h4"));
		List<String> actualList = new ArrayList<String>();
		for (WebElement webElement : listMenuItems) {
			actualList.add(webElement.getText());
			
		}
		return actualList;
	}
	
	
}
