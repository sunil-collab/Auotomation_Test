package seleniumclass1;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoggerTest {
	
	public static Logger log;

	public static void main(String[] args) {
		
		log = LogManager.getLogger(LoggerTest.class);
		
		WebDriver driver = new ChromeDriver();
		log.info("launch the chrome");
		
		driver.manage().window().maximize();
		log.info("maximize the window");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		log.info("wait");
		
		driver.get("https://www.facebook.com");
		log.info("navigate to broweser");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc123");
		log.info("enter the email");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));//predefine method for explicit class
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("passContainer")));//foe explicit class
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abc");
		log.info("click on password");
				
	}

}
//28-05-24
