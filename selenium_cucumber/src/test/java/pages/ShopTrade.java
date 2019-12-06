package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopTrade {
	
	public ShopTrade(WebDriver driver) { 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "a[data-test='navTrade']")
	public WebElement buttonShopOrTrade;
	
	
	@FindBy(css ="[class='css-input css-checkbox css-checkbox-primary active_label']")
	public WebElement verifyPlate;
	
	
	
	
	
	
	
}