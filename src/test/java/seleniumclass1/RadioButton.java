package seleniumclass1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();//launch chrome //object creation 
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");// navigate 
		
		//1st type to handle radio button 
		
		//click on the registration form button 
		driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//input[@value='1']")).click();//click on the radio button
//		//verify radio button is enable
//		System.out.println(driver.findElement(By.xpath("//input[@value='1']")).isEnabled());
//		driver.close();
		
		//2nd type to handle radio button array list 
//		Thread.sleep(1000);
//		List<WebElement> radioButoon =driver.findElements(By.xpath("//input[@type='radio']"));//
//		System.out.println("number of radio button " + radioButoon.size());
//		Thread.sleep(4000);
//		radioButoon.get(0).click(); //female click not to be prefered
//		System.out.println(radioButoon.get(0).isSelected());
//		driver.close();
		
		//3rd type to handle radio button //most used method 
		
		Thread.sleep(2000);
		List<WebElement> radiobutton= driver.findElements(By.xpath("//label[@class='_58mt']"));//radio button size
		System.out.println("nummber of radiobutton" +radiobutton.size());//size count
		String expRadioButton="Female";
		for(int i=0;i<radiobutton.size();i++) {
			if(radiobutton.get(i).getText().equalsIgnoreCase(expRadioButton))
				radiobutton.get(i).click();
			Thread.sleep(5000);
			System.out.println("radio butoon clicked ");
		}
		
		driver.close();

	}
	//14-05-24

}
