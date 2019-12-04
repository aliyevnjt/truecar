package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopUsed {
	
	public ShopUsed(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "[data-test = 'homepageHeroPanelShopUsedButton']")
	public WebElement buttonShopUsed;
	
	public static void selectBrand(WebDriver driver, String model) {
		List<WebElement> list = driver.findElements(By.cssSelector("[data-qa $= 'used'] [class ^= 'd-inline-block']"));
		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
			if(webElement.getText().equals(model)) {
				WebDriverWait wait=new WebDriverWait(driver, 20);
				wait.until(ExpectedConditions.elementToBeClickable(webElement)).click();
			}
		}
	}
	
	@FindBy(css = "[data-qa='UsedModelDropdown']")
	public WebElement buttonAllModels;
	
	public static void selectModel(WebDriver driver, String model) {
		driver.findElement(By.cssSelector("[value='" + model + "']")).click();
	}
	
	@FindBy(css = "[data-test='usedSearchHeading']")
	public WebElement usedHeader;
	
	
}
