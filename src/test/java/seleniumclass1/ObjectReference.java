package seleniumclass1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class ObjectReference {

	public static void main(String[] args) throws IOException {

		//specify the location of properties file  
		
		File src1=new File("C:\\Users\\Murti\\eclipse-workspace\\seleniumclass1\\Repository\\config.properties");
		File src2=new File("C:\\Users\\Murti\\eclipse-workspace\\seleniumclass1\\Repository\\locators.properties");
		File src3=new File("C:\\Users\\Murti\\eclipse-workspace\\seleniumclass1\\Repository\\testdata.properties");

		// FileInputStream class load the file 
		
		FileInputStream config1 = new FileInputStream(src1);
		FileInputStream locators1 = new FileInputStream(src2);
		FileInputStream testdata1 = new FileInputStream(src3);
		
		//properties class read the properties file 
		
		Properties config2= new Properties();
		config2.load(config1); // read the properties
		Properties locators2 = new Properties();
		locators2.load(locators1);// read file 
		Properties testdata2 = new Properties();
		testdata2.load(testdata1);
		
		WebDriver driver=new ChromeDriver(); //object creation
		
		//navigate to facebook
		driver.get(config2.getProperty("URL"));
		//time wait 
		long implicitWaitSeconds = Long.parseLong(config2.getProperty("Wait"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWaitSeconds));
		
		
		// fill the data
		
		driver.findElement(By.xpath(locators2.getProperty("Email"))).sendKeys(testdata2.getProperty("TestDataEmail"));
		driver.findElement(By.xpath(locators2.getProperty("Pass"))).sendKeys(testdata2.getProperty("TestDataPass"));
		driver.findElement(By.xpath(locators2.getProperty("Click"))).click();
		driver.close();
	}

}
//27-05-24
