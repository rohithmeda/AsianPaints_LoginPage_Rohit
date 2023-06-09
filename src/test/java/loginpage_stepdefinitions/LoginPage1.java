package loginpage_stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LandingPage;
import pages.LoginPage;
import utility.Utility;

public class LoginPage1 extends Utility {
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
		logger = report.createTest("test01");
        logger.log(Status.INFO, "Asiapaints page is opened");
		Thread.sleep(10000);
		ldp.noThanksButton();
		ldp.laterButton();
		//ldp.Dontallow();
		ldp.acceptCookiesButton();
		System.out.println("******Chrome is running and landing page is visible******");
		logger.log(Status.INFO, "Step1 is executed");

	}
	
	
	
	@Given("Users navigate on landing page")
	public void Users_navigate_on_landing_page() throws Exception {
		objectMethod();
		captureScreenshot();
		//Utility.implicitWait();
		Thread.sleep(5000);
		String actualtitle = ldp.validateLandinPageTitle(); 
		System.out.println(actualtitle); 
		Thread.sleep(2000);
		logger.log(Status.INFO, "Step2 is executed");

	}
	
	
	@Then("Fields on navigation page are visible to the user")
	public void Fields_on_navigation_page_are_visible_to_the_user() throws Exception {
		objectMethod();
		ldp.getText();
		Thread.sleep(10000);
		logger.log(Status.INFO, "Step3 is executed");

	}
	
	
	@When("User clicks on login button")
	public void user_clicks_on_login_button() throws IOException, InterruptedException {
		objectMethod();
		ldp.loginButtonOfLandingpage();
		Thread.sleep(4000);
		logger.log(Status.INFO, "Step2 is executed");
	   
	}
	
	@When("User enters correct mobile number")
	public void user_enters_correct_mobile_number() throws InterruptedException, IOException{
	  objectMethod();
	  lp.phoneNumberInput("8498059398");
	  lp.submitButton();
//	  Thread.sleep(10000);
	  logger.log(Status.INFO, "Step3 is executed");
	  
	  
	}
	
	@When("User clicks on submit button")
	public void user_clicks_on_submit_button() throws IOException, InterruptedException {
		objectMethod();
		Thread.sleep(16000);
		lp.submitButtonforotp();
		Thread.sleep(10000);
		logger.log(Status.INFO, "Step4 is executed");
		
	  }
	
	@Then("It shows home page")
	public void it_shows_home_page() throws IOException, InterruptedException {
		objectMethod();
		String actualtitle = ldp.validateLandinPageTitle(); 
		String expectedTitle = "Trusted Wall Painting, Home Painting & Waterproofing in India - Asian Paints";
		System.out.println(actualtitle); 
		Thread.sleep(20000);
		System.out.println("go to home");
		logger.log(Status.INFO, "Step5 is executed");
	
		try {

            assertEquals(actualtitle, expectedTitle);

            logger.log(Status.PASS, "Step1 is passed");

            System.out.println(actualtitle);

            assert true;

        } catch (AssertionError e) {

            e.printStackTrace();

            logger.log(Status.FAIL, "Step1 is failed");

            captureScreenshotOnFailure();

            assert false;
		
	}
	
	}
}
		
	




