package seleniumclass1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {

			
			WebDriver driver=new ChromeDriver();//launch chrome //object creation 
			driver.manage().window().maximize();
			driver.navigate().to("https://www.facebook.com");// navigate 			
			//click on the registration form button 
			driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
			Thread.sleep(2000);
			
			//1st way list using 
			
			List<WebElement> birthmonth = driver.findElements(By.xpath("//select[@id='month']//option"));
			System.out.println("Number of dropdown value " +birthmonth.size());
			Thread.sleep(2000);
			birthmonth.get(9).click();
			
			//2nd method by select method   store node and make class object
			
			WebElement birthmonth1 = driver.findElement(By.xpath("//select[@id='month']"));
			Select month = new Select(birthmonth1);
			Thread.sleep(2000);
			month.selectByVisibleText("Jun");
			Thread.sleep(2000);
			month.selectByValue("5");//value select in string form
			Thread.sleep(2000);
			month.selectByIndex(2);
			System.out.println(month.getFirstSelectedOption().getText());//return the current default value
			
			//3rd way for loop by using list 
			List<WebElement> dropDown = month.getOptions(); //in month we store all node
			String monthname = "Sep";
			for(int i=0;i<dropDown.size();i++) {
				if(dropDown.get(i).getText().equalsIgnoreCase(monthname)) {
					dropDown.get(i).click();
					System.out.println("Desired Month clicked");
				}
			}
			
			//4th way 
			
			birthmonth1.sendKeys("Nov");
			
			//5th way most preferred 
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Jan");
			
			driver.close();
			
			//deselect method use  to select multiple dropdown value 
						
			month.deselectAll();
			month.deselectByValue("Apr");										
			
	}

}

//15-05-24