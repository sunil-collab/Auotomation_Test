package seleniumclass1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class ChildwindowHandling {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.xpath("//a[@href=\"http://www.selenium.dev\"]")).click();//click
		
		Set<String> allwindows= driver.getWindowHandles();//extract the window id 
		System.out.println(allwindows);
		
		Iterator<String> window=allwindows.iterator();
		String win1=window.next();
		String win2=window.next();
		
		//parents window
		driver.switchTo().window(win1);
		System.out.println(driver.getCurrentUrl());
		
		//child window
		driver.switchTo().window(win2);
		System.out.println(driver.getTitle());
		driver.close();
		driver.quit();
		
	}

}
//23-05-24