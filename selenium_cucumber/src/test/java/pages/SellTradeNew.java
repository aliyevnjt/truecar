package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SellTradeNew {
	public SellTradeNew(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "[data-test='navTrade']")
	public WebElement clicksell;

	public static void veridyhed(WebDriver driver, String string) {
		List<WebElement> list = driver.findElements(By.cssSelector("[aria-label='Vehicle Entry Type']"));
		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
			
		
}
}

}