package testCases;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class LoginTest extends BaseClass{

	
	@Test
	public void naukriFieldChange() throws InterruptedException {
		
		LoginPage loginPage= new LoginPage(driver);
		HomePage homePage = new HomePage(driver);
		
		loginPage.loginNaukri("akshaykudegave111@gmail.com", "Akshay@21");
		homePage.changeName("Akshay Kudegave.", "Akshay Kudegave");
		homePage.logout();
		
		
	}
}
