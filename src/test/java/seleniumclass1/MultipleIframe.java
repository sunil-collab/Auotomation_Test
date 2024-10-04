package seleniumclass1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleIframe {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://paytm.com/");
		
		// click on sign up page
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		
		//handle multiple frame 
		int allFrames = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total no of i frame");
		
		for(int i=0;i<allFrames;i++) {
		driver.switchTo().frame(i);
		driver.findElement(By.xpath("//a[contains(@href,'privacy.html')]")).click();
		}	

	}

}
//22-05-24