package pages;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Utility;

public class LoginPage extends Utility{
	
	@FindBy(xpath="//*[@id=\"loginMobile\"]")//mobile number
    public WebElement phonenum;
	
	@FindBy(xpath="//button[@class='ctaText modal__variant-login--submit']")
	WebElement submit;///submit button for login page 
	
	@FindBy(xpath="//*[@id=\'validate-otp\']/div[3]")
	WebElement otpSubmit;///submit button for otp
	
	public LoginPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	public void phoneNumberInput(String pn) {
		phonenum.sendKeys(pn);
	}
	
	
	public void submitButton() {
		submit.click();
	}
	
	public void submitButtonforotp() {
		otpSubmit.click();
	}
	
	
}
	
	
//	public String validateLoginPageTitle()
//	{
//		return driver.getTitle(); 
//	} 
//	
//	
//	public HomePage loginButton() throws IOException {
//		submit.click();
//		return new HomePage();
//	}	
//	
	
	

	
//	public void  submitButton() throws IOException {
//		submit.click();
//		//return new HomePage();
//	}
//	public HomePage submitButton2() throws IOException {
//		submit2.click();
//		return new HomePage();
//		
//	}
	

