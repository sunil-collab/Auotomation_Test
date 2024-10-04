package seleniumclass1;

import org.testng.annotations.Test;

public class TestNG2 {

		@Test(priority=-10)
		public void Test1() {
			
			System.out.println("hey there 1");
			
		}
		
		@Test(priority=1)
		
		public void test1() {
			
			System.out.println("hey there ");
					
		}
		
		@Test(priority=100)
		
		public void test2() {
			
			System.out.println("hey there 2");
		}
		
		@Test(priority=0)
		public void a() {
			
			System.out.println("hey a");
		}
		
		// if priority is not set it mean by default 0 
		@Test
		public void a1() {
			
			System.out.println("hey a1");
		}
		
}
