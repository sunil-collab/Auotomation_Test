package seleniumclass1;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;
import org.testng.annotations.*;

public class Assertion1{
	WebDriver driver;

	@BeforeTest
	public  void navigateToUrl() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
	}
	
	@Test
		public void validateTextOnLandingPage() {
			
			String expectedText = "Facebook helps you connect and share with the people in your life.";
			
			//2nd way
	//		Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'connect')]")).isDisplayed());
			
			//3rd way on use in checkbooks selected
			Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'connect')]")).isSelected());
			
			//1st way to print assertion 
//			String actualText = driver.findElement(By.xpath("//h2[contains(text(),'connect')]")).getText();
//			Assert.assertEquals(actualText,expectedText );
			System.out.println("the test case pass");
		}
	
	@AfterTest
	public void cloaseBrowser() {
		driver.close();
	}
	}
	//04-06-2024


