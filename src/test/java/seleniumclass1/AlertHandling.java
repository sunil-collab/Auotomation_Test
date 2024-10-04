package seleniumclass1;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Driver.get("https://demo.automationtesting.in/Alerts.html");
		
		Driver.findElement(By.xpath("//a[@href=\"#CancelTab\"]")).click();
		Driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		String alerttext = Driver.switchTo().alert().getText(); //to store text
		String exptext = "Press a Button !";
		
		if(alerttext.equals(exptext)) {
			System.out.println("Alert text verify");
		}
		else {
			System.out.println("alert text not verified");
		}
		
		// handle ok button 
		Thread.sleep(30);
		Driver.switchTo().alert().accept();
		System.out.println("Alert accepted");
		
		//handle cancel button 
		
		Thread.sleep(30);
		Driver.switchTo().alert().dismiss();
		System.out.println("Alert cancel");
		
		

	}

}
