package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SellOrTrade {
	public SellOrTrade(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = "a[data-test='navTrade']")
	public WebElement buttonSellOrTrade;
	
	//*[@id="prScrollContent"]/main/div/div/pr-home-gp-estimate/div/pr-vehicle-entry-selector/div/div/div
	public static void verifyBotton(WebDriver driver, String bottonName) {
		List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"prScrollContent\"]/main/div/div/pr-home-gp-estimate/div/pr-vehicle-entry-selector/div/div/div"));
		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
			if(webElement.getText().equals(bottonName)) {
				System.out.println("Good");
				WebDriverWait wait=new WebDriverWait(driver, 20);
				//wait.until(ExpectedConditions.elementToBeClickable(webElement)).click();
				//webElement.click();
			}
		}
	}
}
