package seleniumclass1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImpliciteWait {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//implicit wait to find data if got then moved ahead 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Strike off
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("how stuff work");// value fill and search
		
		//handling the autosugestion
		
		List<WebElement> autosugestion = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		System.out.println("No of autosugestion "+autosugestion.size());
		 
		for(int i=0;i<autosugestion.size();i++) {
			String expsugestion = "how stuff works quiz";
			if(autosugestion.get(i).getText().equalsIgnoreCase(expsugestion)) {
			autosugestion.get(i).click();
			System.out.println("autosugetion is clicked ");
		}
		}
		((WebDriver) autosugestion).close();
	}
}
//20-05-2024


