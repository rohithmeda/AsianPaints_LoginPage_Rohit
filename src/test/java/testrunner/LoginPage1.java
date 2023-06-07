package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
        features = {"src/test/resources/Features/LoginPage.feature"},
        glue={"loginpage_stepdefinitions" , "apphooks"},
                plugin= {"pretty",
                         "json:cucumber-reports/cucumber.json",
                         "junit:cucumber-reports/cucumber.xml",
                         "html:cucumber-reports/cucumber"}
        )

public class LoginPage1 extends AbstractTestNGCucumberTests{
}
