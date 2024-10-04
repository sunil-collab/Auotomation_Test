package seleniumclass1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropIframe {

	public static  void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/droppable/");
		
		//I Frame handling using index
		driver.switchTo().frame(0); // control goes to child frame
		System.out.println("Moved to i frame");
		
		//Control goes to parents frame
		//driver.switchTo().parentFrame();
		
		//sotre the element in list 
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		//action class need to create for mouse simulation
		
		Actions act =  new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();//drag and drop 
		
		

	}

}
//22-05-24