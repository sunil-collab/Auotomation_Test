package seleniumclass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass1 {

	public static void main(String[] args) throws Exception {
		//Import the file
		
		//for selenium 3 we need to set driver by using this method 
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Murti\\Downloads\\chrome-win64\\chromedriver.exe");

		
		//launching the browser 
		WebDriver Driver = new ChromeDriver(); //dynamic method dispatch //launch the browser
		
		//Open the URL 
		Driver.get("https://www.google.com");
		
		Thread.sleep(1000);//stop the operation for given time  
		Driver.manage().window().maximize();//maximize the window
		
		Thread.sleep(1000);
		Driver.manage().deleteAllCookies();//delete all the cookies 
		
		Thread.sleep(1000);
		Driver.navigate().to("https://www.facebook.com");//navigate to the URL
		
		Thread.sleep(1000);
		Driver.navigate().refresh();//refresh the page
		
		Thread.sleep(1000);
		Driver.navigate().back();//back button click
		
		Thread.sleep(1000);
		Driver.navigate().forward();// forward button click
		
		Thread.sleep(1000);
		System.out.println( Driver.getCurrentUrl());// current URL in mid of page like download path
		
		Thread.sleep(1000);
		System.out.println(Driver.getTitle());// get title name 
		
		Thread.sleep(1000);
		Driver.close();//close the open window	
		
		Thread.sleep(1000);
		Driver.quit();//close all open window 
		

	}

}
//08-05-2024