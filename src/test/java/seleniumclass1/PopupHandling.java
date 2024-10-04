package seleniumclass1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class PopupHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.w3schools.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='w3-button ga-fp tryit-button'])[1]")).click(); //click
		
		
		//Get the total no of tab/window
		Set<String> allwindowsID= driver.getWindowHandles();//Extraction of window id
		System.out.println(allwindowsID);//ID
		
		 //ITERATIR METHOD USE TO HANDLE TAB/WINDOW FOR 		
		Iterator<String> windowID=allwindowsID.iterator();//store the extract ID
		String win1=windowID.next();//1st id
		String win2=windowID.next();//2nd id store 
		
		//print the title of parents tab		
		driver.switchTo().window(win1);
		System.out.println("parents window" +win1);
		System.out.println(driver.getTitle());
		
		//Print child tab
		driver.switchTo().window(win2);
		System.out.println("child window" +win2);
		System.out.println(driver.getTitle());
		driver.close(); // close current window
		driver.quit(); // close all the tab window 
			
		
	}

}
//223-05-24
