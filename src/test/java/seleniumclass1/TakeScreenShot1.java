package seleniumclass1;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.ITestResult;

public class TakeScreenShot1 {
	
	WebDriver driver;   //global variable 
	
	public void takeSnapShot(ITestResult Result) throws IOException {
		if(ITestResult.FAILURE == Result.getStatus()) {  //imp method
			//Convert web driver object to Takescreenshot
			TakesScreenshot scrShot = (TakesScreenshot)driver;
			
		//call getscreenshot method to create image file
			File srcFile =scrShot.getScreenshotAs(OutputType.FILE); 
			
		//Move Image File to new destination
			File DestFile = new File("./screenshots/"+Result.getName()+".png");
			
		//Copy file at destination 
			FileUtils.copyFile(srcFile, DestFile);
			System.out.println(Result.getName()+ "Screenshot captured");
			
		}
	}


}
