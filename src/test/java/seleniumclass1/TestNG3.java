package seleniumclass1;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG3 {
	
	
	// to print same test multiple time 
	@Test(priority=1, invocationCount=2)
	
	public void test1() {
		
		System.out.println("hey there ");
				
	}
	// to print method 
	//1st way to removed annotation 
	
	public void test2() {
		
		System.out.println("hey there 2");
	}
	//2nd way add enable to ahead of attribute
	@Test(priority=10 , enabled = false)
	public void a() {
		
		System.out.println("hey a");
	}
	
	//3rd way add but never use
	@Test(priority=1)
	
	public void test3() {
		
		System.out.println("hey there 3 ");
		throw new SkipException("Skiped the test");
				
	}
	@Test(priority=1)

	public void test4() {
	
	System.out.println("hey there4 ");
			
}

}
