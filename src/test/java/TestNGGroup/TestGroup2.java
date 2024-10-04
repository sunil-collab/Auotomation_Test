package TestNGGroup;

import org.testng.annotations.Test;

public class TestGroup2 {
	
	@Test(groups ={"smoke","sanity"})
	public void test6() {
		System.out.println("test6");
	}
	
	@Test(groups ={"smoke","sanity","regression"})
	public void test7() {
		System.out.println("test7");
	}
	
	@Test(groups ={"smoke","sanity","functional"})
	public void test8() {
		System.out.println("test8");
	}
	
	@Test(groups ={"sanity"})
	public void test9() {
		System.out.println("test9");
	}
	
	@Test
	public void test10() {
		System.out.println("test10");
	}
}
