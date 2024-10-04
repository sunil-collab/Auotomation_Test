package seleniumclass1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static  void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//enter email
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("123cf");
	
	System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value"));
	
	System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getSize().getHeight());
			
	System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getSize().getWidth());
	
	//explicit for password element 
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));//predefine method for explicit class
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("passContainer")));//foe explicit class
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abc");
	System.out.println("data enterd successfully");
	driver.close();
	
	}
	
}

//20-05-2024
