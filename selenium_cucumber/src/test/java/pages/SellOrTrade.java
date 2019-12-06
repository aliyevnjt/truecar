package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SellOrTrade {
	public SellOrTrade(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(css= "a[data-test ='navTrade']")
	public WebElement trade_button;
	
	public static List tabs(WebDriver driver) {
		List<String> actuallist = new ArrayList<String>();
		List<WebElement> list = driver.findElements(By.cssSelector("div[data-qa='TradeFormSelector'] h4"));
		for (WebElement webElement : list) {
			actuallist.add(webElement.getText());
}
		return actuallist;
	}
		@FindBy (css = "div[data-qa='TradeFormSelector'] h4")
		public WebElement menus;
		
	}

