package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "login_Layer")
	WebElement login_btn;
	
	@FindBy(xpath = "//input[@placeholder='Enter your active Email ID / Username']")
	WebElement username_email_field;
	
	@FindBy(xpath = "//input[@placeholder='Enter your password']")
	WebElement password_field;
	
	@FindBy(xpath = "//button[@class='btn-primary loginButton']")
	WebElement login_button;
	
	public void loginNaukri(String username, String pass) {
		
		waitForElementToBeVisible(login_btn).click();
		waitForElementToBeVisible(username_email_field).sendKeys(username);
		waitForElementToBeVisible(password_field).sendKeys(pass);
		waitForElementToBeClickable(login_button).click();
	}
}
