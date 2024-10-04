package seleniumclass1;

import org.testng.annotations.*;

public class TestNG {
	@Test
	
	public void test1() {
		
		System.out.println("hey there 1");
				
	}
	
	@Test
	
	public void test2() {
		
		System.out.println("hey there 2");
	}
	
	@Test
	public void a() {
		
		System.out.println("hey a");
	}
	
	
	@BeforeMethod
	
	public void beforMethod() {
		
		System.out.println("hey beforemethod");
	}
	
	@AfterMethod
	
	public void afterMathod() {
		
		System.out.println("hey afterMethod");
	}
	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("hey Befor class");
	}

	@AfterClass
	public void afterClass() {
	
	System.out.println("hey after class");
}
	@BeforeSuite
	public void beforeSuit() {
		
		System.out.println("hey before suit");
	}
	
	@AfterSuite
	public void afterSuite() {
		
		System.out.println("hey after suit");
	}
	
	@BeforeTest
	public void beforeTest() {
		
		System.out.println("hey before test");
	}

	@AfterTest
	public void afterTest() {
	
	System.out.println("hey after test");
}
}
//first compare and check with alphabet in method than execute 

	//this step only follow in before method and After method
// follow the sequence---1)before method ---test---after method
//						2)before method---test--after method	

//29-05-24
