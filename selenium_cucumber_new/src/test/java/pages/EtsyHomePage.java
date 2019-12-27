package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.Utility;

public class EtsyHomePage {
	@FindBy(css = "[src *= 'https://i.etsystatic.com/16291648']")
	public WebElement firstSearchResult;
	
	public EtsyHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public void goToHomePage(WebDriver driver) {
		String url = System.getProperty("url");
		if(url==null) {
			url = "https://www.etsy.com/";
		}
		driver.get(url);
		
		
		
		
		
		
		
		
	}
	@FindBy (css = "[role='menubar'] li")
	public List<WebElement> menubar;
	 public static void hoverOver(WebDriver driver) {
		 Actions action = new Actions(driver);
			WebElement we = driver.findElement(By.cssSelector("[id='catnav-primary-link-10855']"));
			action.moveToElement(we).build().perform();
	 }
	
	@FindBy (css = "[data-node-id='10855'] [data-ui='side-nav-category-link']")
	public List<WebElement> jewelryOptionsList;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
public static void selectEnglish(WebDriver driver,String language)  {
	
	driver.findElement(By.cssSelector("[aria-label *='Update your settings ']")).click();
	
	Select select=new Select(driver.findElement(By.cssSelector("[id='locale-overlay-select-language_code']")));
select.selectByVisibleText(language);
driver.findElement(By.cssSelector("[id='locale-overlay-save']")).click();
}

	}

















