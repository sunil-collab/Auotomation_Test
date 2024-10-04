package seleniumclass1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG5 { //Testng parameterized
	
	WebDriver driver;
	
	@BeforeClass
	public void setBrowserEnvironment() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.facebook.com/");
}
	@DataProvider
	public Object[][] dataSet() throws IOException{
		
		Object arr[][] = new Object[3][2];
		
		//data fill by excel sheet 
		File src3=new File("C:\\Users\\Murti\\eclipse-workspace\\seleniumclass1\\Repository\\testdata.properties");		
		FileInputStream testdata1 = new FileInputStream(src3);
		Properties testdata2 = new Properties();
		testdata2.load(testdata1);
		
		
		arr[0][0]=testdata2.getProperty("TestDataEmail");
		arr[0][1]=testdata2.getProperty("TestDataPass");	
		
		// data is fill by array method
		arr[1][0]="Username2";
		arr[1][1]="Password2";
		
		arr[2][0]="Username3";
		arr[2][1]="Password3";
		
		return arr;
	}
	
	@Test(dataProvider="dataSet")
	public void logincheck(String Username, String Password) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		Thread.sleep(10);
		driver.findElement(By.xpath("//input[@id='pass']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Username);
		Thread.sleep(10);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Password);
	}
	@AfterClass
	
	public void closebrowser() {
		
		driver.close();
	}
}

//30-05-24