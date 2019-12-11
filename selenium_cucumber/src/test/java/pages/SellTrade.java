package pages;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SellTrade {
	public SellTrade(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "[data-test='navTrade']")
	public WebElement buttonSellTrade;
	
		
		

public static void verfyELP(WebDriver driver,String expected) {
	List<WebElement> list = driver.findElements(By.cssSelector("[data-identifier=licensePlate]"));
	boolean searchResult = false;
	for (WebElement webElement : list) {
		if (webElement.getText().equals(expected)) {
			searchResult=webElement.getText().contains(expected);
	       
		}	
	}
	 Assert.assertTrue(searchResult);
}
	public static void verfyenterVIN(WebDriver driver,String expected) {
			
		List<WebElement> list = driver.findElements(By.cssSelector("[value='vin']"));
		for (WebElement webElement : list) {
			if (webElement.getText().equals(expected)) {
				boolean searchResult=webElement.getText().contains(expected);
		        Assert.assertTrue(searchResult);
			}	
		}        
	}
		
	
		public static void enterMakeModel(WebDriver driver,String expected) {
			List<WebElement> list = driver.findElements(By.cssSelector("[value='ymmt']"));
			for (WebElement webElement : list) {
				if (webElement.getText().equals(expected)) {
					boolean searchResult=webElement.getText().contains(expected);
			        Assert.assertTrue(searchResult);
				}	
			}
}
}