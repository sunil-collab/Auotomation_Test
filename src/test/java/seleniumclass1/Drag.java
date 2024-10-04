package seleniumclass1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/draggable/");
		
		// I frame 
		driver.switchTo().frame(0);
		System.out.println("moved to I frame");
		
		//action class
		
		Actions act = new Actions(driver);
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		act.dragAndDropBy(drag, 160, 70).build().perform(); // to perform drag and drop
		
		// by providing co-ordinate
		
	}

}
//22-05-24
