package seleniumclass1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
public class ReadingSheet {

	public static void main(String[] args) throws IOException {
		//path of the sheet 
		
		File src = new File("C:\\Users\\Murti\\eclipse-workspace\\seleniumclass1\\Excel\\Test sheet.xlsx");
		
		//load the file 
		
		FileInputStream workbook = new FileInputStream(src);
		
		//read the file
		//load workbook
		
		XSSFWorkbook wb = new XSSFWorkbook(workbook);
		
		//load sheet 
		
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		System.out.println(sheet.getSheetName());//to find sheet name
		
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue()); //to find sheet value
		
		System.out.println(sheet.getRow(3).getCell(0).getNumericCellValue());//to find integer
		
		//to print integer form do casting 
		double cellvalue = sheet.getRow(3).getCell(0).getNumericCellValue();
		System.out.println((int)cellvalue); // to print in integer form 
		
		//total number of rows	
		System.out.println(sheet.getPhysicalNumberOfRows());
		
		// total no of column
		System.out.println(sheet.getRow(0).getPhysicalNumberOfCells());
		
		//fill the data in Facebook by using excel sheet 
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		String email = sheet.getRow(1).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		
		String Pass =sheet.getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Pass);
		
		
	}

}
//28-05-24 or 29-05-24