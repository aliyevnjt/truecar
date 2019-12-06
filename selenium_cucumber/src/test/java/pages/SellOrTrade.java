package pages;

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

	
	
	@FindBy (css="[data-test='navTrade']")
	public WebElement buttonSellOrTrade;

	public static void verifyText(WebDriver driver, String text) {
		List<WebElement> list = driver.findElements(By.cssSelector("[class='card-content card-content-center padding-y-3 padding-y-md-4 d-flex justify-content-center']"));
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getText().equals("Enter License Plate")) {
				text.equals(list.get(i).getText());
			}
			if(list.get(i).getText().equals("Enter VIN")) {
				text.equals(list.get(i).getText());
			}
			if(list.get(i).getText().equals("Enter Make/Model")) {
				text.equals(list.get(i).getText());
			}
		}
		
	}

}
