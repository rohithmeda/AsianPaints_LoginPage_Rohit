package pages;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Utility;
public class LandingPage extends Utility{
	

	
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div/div/header/div[2]/div[2]/div[1]/a[1]/span")
	private WebElement loginButtonoflandingpage;
	
	@FindBy(xpath="/html")
	private WebElement text;
		
	public LandingPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	
	} 
	
	public String validateLandinPageTitle()
	{
		return validatePageTitle(); 
	} 
	


	public LoginPage loginButtonOfLandingpage() throws IOException {
		loginButtonoflandingpage.click();
		return new LoginPage();
	}
	
	public void getText() throws IOException {
		
		System.out.print(text.getText());
	}
	
	
public void captureScreenshot() throws Exception {
		
		Date currentDate = new Date();
		String screenshotFileName = currentDate.toString().replace(" ", "-").replace(":", "-");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File binaryFile = ts.getScreenshotAs(OutputType.FILE);
		
		//Make sure screenshots folder is already created at the project level
		File imageFile = new File(screenshotsPath + screenshotFileName + ".png"); 
		FileUtils.copyFile(binaryFile, imageFile);
		
		
	}
	
public void laterButton() throws IOException{

    driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"__st_fancy_popup\"]/iframe")));

    driver.findElement(By.id("__st_bpn_no")).click();

    driver.switchTo().defaultContent();

}


public void noThanksButton() throws IOException{

    driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='st_notification_modal']/iframe")));

    driver.findElement(By.id("NC_CTA_TWO")).click();

    driver.switchTo().defaultContent();

}
	
	

}
