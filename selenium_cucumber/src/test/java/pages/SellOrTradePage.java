package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SellOrTradePage {
	
	public SellOrTradePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "[data-test = 'navTrade']")
	public WebElement sellortradebutton;
	
	
}
