package seleniumclass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver Driver = new ChromeDriver();//launch
		Driver.manage().window().maximize();//maximize
		Driver.navigate().to("https://www.facebook.com");//navigate
		String s=Driver.getTitle();//store the title
		if(s.equals("Facebook – log in or sign up")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail ");
		}
		Driver.close();
				
	}

}
//09-05-24
