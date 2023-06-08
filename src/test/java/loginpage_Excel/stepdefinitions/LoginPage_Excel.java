package loginpage_Excel.stepdefinitions;

import java.io.IOException;
//import java.io.ObjectInputFilter.Config;
import java.util.List;
import java.util.Map;

import io.cucumber.core.backend.Status;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LandingPage;
import pages.LoginPage;
import utility.ExcelReader;
import utility.Utility;
import utility.Config;

public class LoginPage_Excel extends Utility {
	public LandingPage ldp;
	public LoginPage lp;
    public HomePage hp;
    ExcelReader reader;
 
    public void objectMethod() throws IOException {
       ldp=new LandingPage();
        lp = new LoginPage();
        hp = new HomePage();
 
    }
	@Given("Chrome is opened and Asianpaints app is opened")
	public void chrome_is_opened_and_asianpaints_app_is_opened() throws IOException, InterruptedException {
		 objectMethod();
		 System.out.println("******Chrome is running and landing page is visible******");
		 Thread.sleep(2000);
		 ldp.noThanksButton();
		 ldp.laterButton();
		// ldp.Dontallow();
		 ldp.acceptCookiesButton();
	}
	@When("User clicks on login button")
	public void user_clicks_on_login_button() throws IOException, InterruptedException{

//		objectMethod();
//		ldp.loginButtonOfLandingpage();
//		Thread.sleep(4000);
		try 
		{
			objectMethod();
			ldp.loginButtonOfLandingpage();
			Thread.sleep(4000);
		}
	 catch (IOException | InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

	@When("User fills the form from given sheetname {string} and rownumber {int}")
	public void user_fills_the_form_from_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException {
		Thread.sleep(10000);
        objectMethod();
        reader = new ExcelReader();
        List<Map<String,String>> testData = reader.getData(Config.excelPath, SheetName);

        String Mobile = testData.get(rowNumber).get("MobileNumber");
       

        lp.phoneNumberInput(Mobile);
        lp.submitButton();
        Thread.sleep(5000);
	}

	@When("User clicks on submit button")
	public void user_clicks_on_submit_button() throws IOException, InterruptedException {
		objectMethod();
		
		
		Thread.sleep(16000);
		
		lp.submitButtonforotp();
		Thread.sleep(15000);
	   
	}
	@Then("It shows home page")
	public void it_shows_home_page() {
		System.out.println("Navigate to Home Page");
	    
	}

}
