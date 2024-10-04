package pageSetup;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {
	WebDriver driver;
	
	// By emailField = By.xpath("xyz")--earlier we used without page factory this method 
	
	@FindBy(id="email")
	WebElement emailField;
	
	@FindBy(id="pass")
	WebElement passwordField;
	
	@FindBy(name="login")
	WebElement loginbutton;
	
	@FindBy(xpath="//a[@id='u_0_0_Fr']")
	WebElement createNewButton;		
	
	public FacebookLoginPage(WebDriver driver) { //important line 
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterPassword(String pass) {
		passwordField.sendKeys(pass);
	}
	
	public void clicklogin() {
		loginbutton.click();
		}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
		
	public boolean isPasswordFieldDisplayed() {
		return emailField.isDisplayed();
		}

	public boolean isLoginButtonDisplayed() {
		return passwordField.isDisplayed();
		}
	
	public boolean isEmailFieldDisplayed() {
		return loginbutton.isDisplayed();
		}
	
	public boolean isCreateNewButtonDisplayed() {
		return createNewButton.isDisplayed();
	}

}
//05-06-24
