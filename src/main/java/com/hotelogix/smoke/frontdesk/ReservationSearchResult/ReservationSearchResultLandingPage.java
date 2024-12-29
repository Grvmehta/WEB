package com.hotelogix.smoke.frontdesk.ReservationSearchResult;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.hotelogix.smoke.frontdesk.ViewDetailsPage.ViewDetailsPage;
import com.hotelogix.smoke.genericandbase.GenericMethods;


public class ReservationSearchResultLandingPage {



 /*public WebElement RecordLink;
 public WebElement ReservationID;
 public WebDriver driver;
 public ReservationSearchResultLandingPage(){
	 //this.driver=driver;
 
  RecordLink= GenericMethods.ExplicitWait("xpath","//table[@id='roomPoTableId']//td");
  ReservationID= GenericMethods.ExplicitWait("xpath","//table[@id='roomPoTableId']/tbody/tr[2]/td[3]");
 
 
 }
 
 */


	@FindBy(xpath="//table[@id='roomPoTableId']//td")
    public static WebElement RecordLink;

	@FindBy(xpath="//table[@id='roomPoTableId']/tbody/tr[2]/td[3]")
	public static WebElement ReservationID;


	public ViewDetailsPage fn_ClickOnSearchedRecord() throws Exception
	{
		try
		{
        GenericMethods.clickElement(RecordLink);
        ViewDetailsPage VDP=PageFactory.initElements(GenericMethods.driver, ViewDetailsPage.class);
        return VDP;
		}
		catch(Exception e)
		{
			throw e;
		}
    }


    public void VerifyReservationById(String rid) throws Exception
    {
    	try
    	{
    	Thread.sleep(2000);

        String RId=GenericMethods.getText(ReservationID).trim();
        Assert.assertEquals(rid, RId);
    	}
    	catch(Exception e)
    	{
    		throw e;
    	}
    	catch(AssertionError e)
    	{
    		throw e;
    	}
    }
}
