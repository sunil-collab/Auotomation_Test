package seleniumclass1;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaScriptCode {

	public static  void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com");
				
		//javascriptexecturator interface
		
		JavascriptExecutor newDriver= (JavascriptExecutor)driver; // main line 
		
		Thread.sleep(1000);
		newDriver.executeScript("document.getElementById('email').value='yt'"); //id enter by value key
		Thread.sleep(1000);
		newDriver.executeScript("document.getElementById('pass').value='123'"); //pass enter by value key
		
		// scroll down
		
		Thread.sleep(1000);
		newDriver.executeScript("window.scrollBy(0,300)");
		
		//scroll up
		
		Thread.sleep(2000);
		newDriver.executeScript("window.scrollBy(0,-300)");	

	}

}
//21-05-2024
