package testPOM;


import org.testng.Assert;

import org.testng.annotations.Test;

import Utils.BaseTest;
import pageSetup.FacebookLoginPage;

public class FacebookTest extends BaseTest {
		
	@Test
		public void validateURL() {
		
		String expectedURL = "https://www.facebook.com/";
			String actualURL = driver.getCurrentUrl();
			Assert.assertEquals(expectedURL, actualURL, "validation URL failed");
//			System.out.println("expectedURL");
//			Assert.assertEquals(expectedURL, "www.facebook.com");

}
	@Test
	public void validateTitle() {
		FacebookLoginPage loginpage= new FacebookLoginPage(driver);
		String expectedTitle = "Facebook helps you connect and share with the people in your life.";
		String actualTitle = loginpage.getPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "title print");
	//	Assert.assertEquals(expectedTitle, actualTitle.concat("title print"));
	//		System.out.println(expectedTitle);
	//		Assert.assertEquals(expectedTitle,"Facebook helps you connect and share with the people in your life.");
		
}
	
	@Test
	public void validateEmail() {
		FacebookLoginPage loginpage= new FacebookLoginPage(driver);
		Assert.assertTrue(loginpage.isEmailFieldDisplayed(),"Email input field is not displayed");	
		Assert.assertTrue(loginpage.isPasswordFieldDisplayed(), "password field is not dispalyed");
//		 String expectedText =driver.findElement(By.xpath("//input[@id='email']")).getText();
//		Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'connect')]")).isDisplayed());
}
//	@Test
//	public void validatePassword() {
//		
//		 boolean expectedText =driver.findElement(By.xpath("//input[@id='pass']")).isDisplayed();
//		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='pass']")).isDisplayed());
//}
	@Test
	public void validateLoginButton() {
		FacebookLoginPage loginpage= new FacebookLoginPage(driver);
		Assert.assertTrue(loginpage.isLoginButtonDisplayed(), "login button is displayed");
//		boolean expectedText =driver.findElement(By.id("pass"))
//		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='pass']")).isDisplayed());
}
	@Test
	public void validatecreatenewbutton() {
		FacebookLoginPage loginpage= new FacebookLoginPage(driver);
		Assert.assertTrue(loginpage.isCreateNewButtonDisplayed(), "is displayed");
//		 boolean expectedText =driver.findElement(By.xpath("//a[@id='u_0_0_Fr']")).isDisplayed();
//		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='pass']")).isDisplayed());
}
}

//05-06-24
