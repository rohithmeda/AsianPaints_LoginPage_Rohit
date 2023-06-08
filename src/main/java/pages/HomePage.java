package pages;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import utility.Utility;

public class HomePage extends Utility {
	public HomePage() throws IOException
	{
		PageFactory.initElements(driver, this);
	} 
	
	
	public  String validateHomePageTitle()
	{
		return validatePageTitle(); 
	}  
	
}
