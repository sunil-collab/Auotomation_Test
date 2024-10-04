package TestNGGroup;

import org.testng.annotations.Test;

public class TestGroup1 {
	
	@Test (groups= {"smoke","sanity"})
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(groups= {"smoke","sanity","regression"})
	public void test2() {
		System.out.println("test2");
	}
	
	@Test(groups= {"smoke","sanity","functional"})
	public void test3() {
		System.out.println("test3");
	}
	
	@Test(groups= {"sanity"})
	public void test4() {
		System.out.println("test4");
	}
	
	@Test
	public void test5() {
		System.out.println("test5");
	}

}
