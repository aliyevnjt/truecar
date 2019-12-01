package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ShopNew {
	
	public ShopNew(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "[data-test = 'homepageHeroPanelShopNewButton']")
	public WebElement buttonShopNew;
	
	
	public static void selectModel(WebDriver driver, String model) {
		List<WebElement> list = driver.findElements(By.cssSelector("[data-qa $= 'new'] [class ^= 'd-inline-block']"));
		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
			if(webElement.getText().equals(model)) {
				WebDriverWait wait=new WebDriverWait(driver, 20);
				wait.until(ExpectedConditions.elementToBeClickable(webElement)).click();
				//webElement.click();
			}
		}
	}
	
	public static void selectBodyType(WebDriver driver, String bodyType) {
		driver.findElement(By.cssSelector("[data-test-item = '" + bodyType + "']")).click();
	}
	
	@FindBy (css = "[placeholder = 'ZIP Code']")
	public WebElement zipCode;
	
	
	@FindBy (css = "[data-test = 'nextButton']")
	public WebElement next;
	
//	@FindBy (linkText = "Skip for now")
//	public WebElement skip;
	
	
	public void skip(WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement skip;
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-qa *= 'skip-button']"))).click();;
	}
	
	@FindBy (css = "[data-qa = 'vehicleHeaderYearMakeModel']")
	public WebElement header;
	
	
	@FindBy (css = "[data-qa *= 'styleName']")
	public WebElement styleName;
	
	@FindBy (css = "[class = 'text-nowrap']:nth-of-type(1)")
	public WebElement specs;
	
	//BREAK UNTIL 9.17 AM
	
	
}
