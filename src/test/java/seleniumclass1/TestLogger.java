package seleniumclass1;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class TestLogger {
	
	public static Logger log;

	public static void main(String[] args) {
		
		log = LogManager.getLogger(TestLogger.class);
		
		WebDriver driver = new ChromeDriver();
		log.info("launch the chrome");
		
		driver.manage().window().maximize();
		log.info("maximize the browser");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		log.info("wait");
		
		driver.get("https://www.myntra.com/");
		log.info("URL");
		
		try {
			boolean text = driver.findElement(By.xpath("//a[contains(text(),'Women')]")).isDisplayed();
		}
		catch(Exception e){
			
			System.out.println(e.getLocalizedMessage());
			log.error("Exception Occured", new Exception("Element not found")); // in catch block we write log.error
		}
		finally {
			driver.quit();
			log.info("closed the driver");
		}

	}

}
//28-05-24

