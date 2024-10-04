package seleniumclass1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TakeScreenShot2 {

	TakeScreenShot1 t1 = new TakeScreenShot1();   // create object of class 1 to access all method 
	@BeforeMethod
	public void launchbrowser() {
		t1.driver = new ChromeDriver();
		t1.driver.manage().window().maximize();
		t1.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
		@Test
	
		public void dologin() {
			
		t1.driver.get("https://www.facebook.com/");
		//enter email
		t1.driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sy876@gmail.com");
		t1.driver.findElement(By.xpath("//input[@id='estrdu']")).sendKeys("1234");
		
		
	}
	
	@AfterMethod
	public void takescreenshot(ITestResult Result) throws IOException {
		t1.takeSnapShot(Result);
		t1.driver.quit();
	}
}
