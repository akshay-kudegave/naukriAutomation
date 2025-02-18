package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='user-details br-10 border left-section']//a[contains(text(),'View')]")
	WebElement view_profile;
	
	@FindBy(xpath = "//em[@class='icon edit ']")
	WebElement edit_icon;
	
	@FindBy(xpath = "//input[@placeholder='Enter Your Name']")
	WebElement enter_name;
	
	@FindBy(xpath = "//span[@class='active lbl required-field']")
	WebElement notice_period_view;
	
	@FindBy(xpath = "//button[@id='saveBasicDetailsBtn']")
	WebElement save_button;
	
	@FindBy(xpath = "//div[@class='nI-gNb-drawer__bars']")
	WebElement logout_option;
	
	@FindBy(xpath = "//a[@title='Logout']")
	WebElement logout_button;

	public void changeName(String latestName, String previousName) throws InterruptedException {
		
		Thread.sleep(2000);
		waitForElementToBeVisible(view_profile).click();
		Thread.sleep(2000);
		waitForElementToBeVisible(edit_icon).click();
		Thread.sleep(2000);
		waitForElementToBeVisible(enter_name).clear();
		Thread.sleep(2000);
		waitForElementToBeClickable(enter_name).sendKeys(latestName);
		Thread.sleep(2000);
		jsScrollToElement(notice_period_view);
		Thread.sleep(2000);
		waitForElementToBeVisible(save_button).click();
		Thread.sleep(2000);
		
		
		waitForElementToBeVisible(edit_icon).click();
		Thread.sleep(2000);
		waitForElementToBeVisible(enter_name).clear();
		Thread.sleep(2000);
		waitForElementToBeClickable(enter_name).sendKeys(previousName);
		Thread.sleep(2000);
		jsScrollToElement(notice_period_view);
		Thread.sleep(2000);
		waitForElementToBeVisible(save_button).click();
		Thread.sleep(2000);
	}
	
	public void logout() throws InterruptedException {
		Thread.sleep(2000);
		waitForElementToBeVisible(logout_option).click();
		Thread.sleep(2000);
		waitForElementToBeVisible(logout_button).click();
		Thread.sleep(2000);
	}
}
