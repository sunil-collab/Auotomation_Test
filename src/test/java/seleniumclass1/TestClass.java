package seleniumclass1;

import org.testng.annotations.*;


public class TestClass {
	
	@Test // depend on annotation of test  
	public void test() {
		System.out.println("Hey Therer");
	}
	@BeforeTest
	public void testbefore() {
		System.out.println("Hey before");
	}
	@AfterTest
	public void testafter() {
		System.out.println("Hey after");
	}
}
