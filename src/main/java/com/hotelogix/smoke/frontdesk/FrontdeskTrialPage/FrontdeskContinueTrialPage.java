package com.hotelogix.smoke.frontdesk.FrontdeskTrialPage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.hotelogix.smoke.frontdesk.CashCounter.CashCounterPage;
import com.hotelogix.smoke.genericandbase.GenericMethods;

public class FrontdeskContinueTrialPage
{
	
/*	public WebElement CountinueWithTrail_BT;
	public WebElement text_TX;
	public WebElement Yes_BT;
	public 	FrontdeskContinueTrialPage()
	{
	
		CountinueWithTrail_BT= GenericMethods.ExplicitWait("xpath","//a[text()='Continue with Trial']");
		text_TX= GenericMethods.ExplicitWait("xpath","//td[@class='contentarea05']");
		Yes_BT= GenericMethods.ExplicitWait("xpath","//td[@class='contentarea05']//a");
	}

	*/
	
/*public 	FrontdeskContinueTrialPage()
{
    	PageFactory.initElements(GenericMethods.driver, SpanishXpath.class);
}*/
	

	
public static String text="Another user with the same username is already logged in to the system. Would you like to continue?";

/*WebDriver driver;
public FrontdeskContinueTrialPage(WebDriver driver){
	
	this.driver=driver;
	  PageFactory.initElements(new AjaxElementLocatorFactory(GenericMethods.driver, 60),this);
}*/

   /* @FindBy(xpath="//a[text()='Continue with Trial']")
    public static WebElement CountinueWithTrail_BT;

    @FindBy(xpath="//td[@class='contentarea05']")
    public static WebElement text_TX;

    @FindBy(xpath="//td[@class='contentarea05']//a")
    public static WebElement Yes_BT;*/
    
    
    @FindBy(xpath="//a[text()='Continue with Trial']")
    public static WebElement CountinueWithTrail_BT;

    @FindBy(xpath="//td[@class='contentarea05']")
    public static WebElement text_TX;

    @FindBy(xpath="//div[@class='form-check-inline']//a[contains(text(),'Yes')]")
    public static WebElement Yes_BT;
    
   // PageFactory.initElements(new AjaxElementLocatorFactory(GenericMethods.driver, 60),this);

public static class SpanishXpath
{
	public WebElement CountinueWithTrail_BT;
	public SpanishXpath(){
		this.CountinueWithTrail_BT= GenericMethods.ExplicitWait("xpath","//a[text()='Continuar con la versión de prueba']");
	}
	
	/*@FindBy(xpath="//a[text()='Continuar con la versión de prueba']")
    public static WebElement CountinueWithTrail_BT;*/

}



    public CashCounterPage fn_ClickCountinueWithTrail_BT() throws Exception
    {
    	try
    	{
    		// GenericMethods.driver.manage().timeouts().pageLoadTimeout(500, TimeUnit.SECONDS);
    		Thread.sleep(3000);
        //String str=GenericMethods.getText(text_TX);
    		String str=GenericMethods.driver.getCurrentUrl();
    		if(str.contains("confirmation")) {
            	System.out.println("In if");
            	//Assert.assertEquals(str.contains(text), true);
            	GenericMethods.clickElement(Yes_BT);
            	//Thread.sleep(6000);
              //  GenericMethods.clickElement(CountinueWithTrail_BT);

            	
            }
            else
            {
            	System.out.println("In else");
            GenericMethods.clickElement(CountinueWithTrail_BT);
           // GenericMethods.driver.manage().timeouts().pageLoadTimeout(500, TimeUnit.SECONDS);
            }
    	        } catch(Exception e){
    	        	e.printStackTrace();
    	        	//throw e;
    	    	}
	  CashCounterPage AHO = PageFactory.initElements(GenericMethods.driver, CashCounterPage.class);
          return AHO;
    }





}
