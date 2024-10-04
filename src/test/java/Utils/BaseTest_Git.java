package Utils;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest_Git {

	protected WebDriver driver;
	
	@BeforeMethod
	public  void navigateToUrl() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
	}
	
	@AfterMethod
	public void closevrowser() {
		
		if (driver != null) {
		driver.quit();
	}
	}
}
//05-06-24l
