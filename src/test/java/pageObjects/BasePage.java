package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	
	public BasePage(WebDriver driver) {
		this.driver=driver;
		wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		PageFactory.initElements(driver, this);
		js=(JavascriptExecutor) driver;
	}
	
	// Method to wait for an element to be visible
    public WebElement waitForElementToBeVisible(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    // Method to wait for an element to be clickable
    public WebElement waitForElementToBeClickable(WebElement element) {
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    
    /////////////////////// JavaScript Executor Methods//////////////////////////
    
 // Method to scroll to an element
    public void jsScrollToElement(WebElement element) {
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
