package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public static  WebDriver driver;
	
	@BeforeClass
	public void setup() throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
