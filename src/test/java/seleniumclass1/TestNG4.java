package seleniumclass1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG4 {
	
	//depend on another which don't have test annotation so it will not displayed result N
	public void tes1() {
		
		Assert.assertTrue(3>12);
		System.out.println("hey there");
	}
	
	@Test(dependsOnMethods="test1")
	public void test2() {
		System.out.println("hey i am");
	}

}
