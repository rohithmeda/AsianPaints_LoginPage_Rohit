package pages;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Utility;
public class LandingPage extends Utility{
	

	
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div/div/header/div[2]/div[2]/div[1]/a[1]/span")
	private WebElement loginButtonoflandingpage;
	
	@FindBy(xpath="/html")
	private WebElement text;
	
	@FindBy(xpath="//div[@id='st_notification_modal']/iframe")
  private WebElement frame1;

  @FindBy(id="NC_CTA_TWO")
  private WebElement nothanksbutton;
	
	@FindBy(xpath="//*[@id='__st_fancy_popup']/iframe")
    private WebElement frame2;
	
  @FindBy(id="__st_bpn_no")
  private WebElement laterbutton;
	
//	@FindBy(xpath="//*[@id='__st_fancy_popup']/iframe")
//	private WebElement frame3;
	  
    @FindBy(xpath="//button[text()='ACCEPT ALL COOKIES']")
    private WebElement acceptCookiesButton;
    
	public void noThanksButton() throws IOException

    {
        driver.switchTo().frame(frame1);
        nothanksbutton.click();
       driver.switchTo().defaultContent();

    }
   public void laterButton() throws IOException

    {

       driver.switchTo().frame(frame2);
       laterbutton.click();
        driver.switchTo().defaultContent();
   }
	
    @FindBy(id="__st_bpn_no")
    private WebElement dontallow;

//    public void Dontallow() {
//
//            driver.switchTo().frame(frame3);
//
//            dontallow.click();
//
//            driver.switchTo().defaultContent();
//        }

   public void acceptCookiesButton() {
	   acceptCookiesButton.click();
	}
		
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

}
