package seleniumclass1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseSimulation {

	public static void main(String[] args) {

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.flipkart.com");
			
			
			//web element reference 
			WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
			WebElement mobiles = driver.findElement(By.xpath("//span[text()='Mobiles']")); 
			
			//action class required for mouse simulation 
			Actions ace = new Actions(driver);
			ace.moveToElement(electronics).build().perform(); //method to move mouse and  mend 
			
			//Keyboard simulation
			//beacuse action class need to add build and perform 
			ace.sendKeys(mobiles,Keys.ENTER).build().perform(); // Mandatory to add build and perform for mouse simulation 
			System.out.println("Mobile phone is clicked ");
}
}
//
