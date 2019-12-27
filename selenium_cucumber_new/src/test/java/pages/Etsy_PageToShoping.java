package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Etsy_PageToShoping {
	
	public Etsy_PageToShoping(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "[id *='query']")
	public WebElement searchItem;
	
	public static void clickSpechOffers(WebDriver driver,String spechOffers) {
		 Actions action = new Actions(driver);
			WebElement we = driver.findElement(By.cssSelector("[aria-label='"+spechOffers+"']"));
			action.doubleClick(we).build().perform();
	}
	public static void clickToPrice(WebDriver driver,String price) {
		 Actions action = new Actions(driver);
			WebElement we = driver.findElement(By.cssSelector("[aria-label='"+price+"']"));
			action.doubleClick(we).build().perform();
	
}
	public static void clickToCountry(WebDriver driver,String country) {
		Select shipTo = new Select(driver.findElement(By.cssSelector("[id='ship_to_select']")));
		shipTo.selectByVisibleText(country);
	}

	
	
	
	
	
	
	
	
	
}