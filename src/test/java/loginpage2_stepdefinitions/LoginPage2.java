package loginpage2_stepdefinitions;

import java.io.IOException;

import com.aventstack.extentreports.Status;

//import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LandingPage;
import pages.LoginPage;
import utility.Utility;

public class LoginPage2 extends Utility{
		public LandingPage ldp;
		public LoginPage lp;
		public HomePage hp;
		
		public void objectMethod() throws IOException {

			ldp = new LandingPage();
			lp = new LoginPage();
		}
	@Given("Chrome is opened and Asianpaints app is opened")
	public void chrome_is_opened_and_asianpaints_app_is_opened() throws Exception {
		objectMethod();
		logger = report.createTest("test02");
        logger.log(Status.INFO, "Asiapaints page is opened");
		Thread.sleep(10000);
		ldp.noThanksButton();
		ldp.laterButton();
		System.out.print("******Chrome is running and landing page is visible******");
		logger.log(Status.INFO, "Step1 is executed");
	}
	@When("User clicks on login button")
	public void user_clicks_on_login_button() throws IOException, InterruptedException {
		objectMethod();
		ldp.loginButtonOfLandingpage();
		Thread.sleep(6000);
		logger.log(Status.INFO, "Step2 is executed");
	   
	}
	@When("User enters correct mobile number {string}")
	public void user_enters_correct_mobile_number(String phonenum) throws IOException, InterruptedException {
		  objectMethod();
		  Thread.sleep(10000);
		  lp.phoneNumberInput(phonenum);
		  lp.submitButton();
		  logger.log(Status.INFO, "Step3 is executed");
	}
	@When("User clicks on submit button")
	public void user_clicks_on_submit_button() throws IOException, InterruptedException {
		objectMethod();
		Thread.sleep(16000);
		lp.submitButtonforotp();
		Thread.sleep(20000);
		logger.log(Status.INFO, "Step4 is executed");
	}
	@Then("It shows home page")
	public void it_shows_home_page() throws IOException, InterruptedException {
		objectMethod();
		String actualTitle = ldp.validateLandinPageTitle(); 
	System.out.println(actualTitle); 
	Thread.sleep(30000);
	logger.log(Status.INFO, "Step5 is executed");
	
	}
	

	@When("User enters wrong number {string}  and presses sumbit button")
	public void user_enters_wrong_number_and_presses_sumbit_button(String phonenum1) throws IOException, InterruptedException {
		objectMethod();
		  Thread.sleep(10000);
		  lp.phoneNumberInput(phonenum1);
		  lp.submitButton();
		  logger.log(Status.INFO, "Step3 is executed");
	}
	

	@Then("It shows invalid number")
	public void it_shows_invalid_number() throws Exception {
	    System.out.println("Phone Number is Invalid");
	    Thread.sleep(4000);
	    lp.captureScreenshot();
	    logger.log(Status.INFO, "Step4 is executed");
	}








//	

	
//	@And("User clicks on submit button")
//	public void user_clicks_on_submit_button() throws IOException, InterruptedException {
//		objectMethod();
//		Thread.sleep(16000);
//		lp.submitButtonforotp();
//		Thread.sleep(10000000);
//
//
//	}
}
