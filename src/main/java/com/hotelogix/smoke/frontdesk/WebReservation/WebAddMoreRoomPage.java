package com.hotelogix.smoke.frontdesk.WebReservation;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.hotelogix.smoke.admin.PriceManager.PackageDetailsCentralisedRate;
import com.hotelogix.smoke.genericandbase.GenericMethods;

public class WebAddMoreRoomPage
{
/*
 WebElement SectionTitle;
 WebElement Confirm_BT;
 WebElement TotalAmt;
 WebElement TotalTax;
 WebElement TotalAmtWithTAx;
 List<WebElement> count; 
 List<WebElement> AllRoomTypeOnWeb;
 List<WebElement> package_count;
 WebElement AddOnsName_TX; 
 WebElement AddOns_Link; 
 WebElement drpdown_Rooms;
	public  ArrayList<String> al=new ArrayList<String> ();
 public WebDriver driver;
 public WebAddMoreRoomPage(){
	 //this.driver=driver;
        SectionTitle= GenericMethods.ExplicitWait("xpath","//form[@id='frmWebRes']//table//tr[2]/td/span");
		Confirm_BT= GenericMethods.ExplicitWait("xpath","//input[@value='Confirm']");
		TotalAmt= GenericMethods.ExplicitWait("xpath","//form[@id='frmWebRes']/table/tbody/tr[7]/td/table[2]/tbody/tr/td/table/tbody/tr[2]/td[2]/strong");
		TotalTax= GenericMethods.ExplicitWait("xpath","//form[@id='frmWebRes']/table/tbody/tr[7]/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[2]/strong");
        TotalAmtWithTAx= GenericMethods.ExplicitWait("xpath","//form[@id='frmWebRes']/table/tbody/tr[7]/td/table[2]/tbody/tr/td/table/tbody/tr[4]/td[2]/strong");
		count= (List<WebElement>) GenericMethods.ExplicitWait("xpath","//form[@id='frmWebRes']//tbody//tr");
		AllRoomTypeOnWeb= (List<WebElement>) GenericMethods.ExplicitWait("xpath","//table[@id='web_res_id1']//tr[4]//form[@id='frmWebRes']/table/tbody//tr");
		package_count= (List<WebElement>) GenericMethods.ExplicitWait("xpath","//form[@id='frmWebRes']//tbody//tr[7]//td[@class='brdr-btm'][2]//tbody//tr");
		AddOnsName_TX= GenericMethods.ExplicitWait("xpath","//table[@class='tbl-contentNew']/tbody/tr[3]//em");
		AddOns_Link= GenericMethods.ExplicitWait("xpath","//span[text()=' Add-ons ']");
	    drpdown_Rooms= GenericMethods.ExplicitWait("xpath","//select[contains(@onchange,'changeSelectedRoom')]");
		
 }
  
  
 */

	@FindBy(xpath="//form[@id='frmWebRes']//table//tr[2]/td/span")
    public  WebElement SectionTitle;

	@FindBy(xpath="//input[@value='Confirm']")
    public  WebElement Confirm_BT;

	@FindBy(xpath="//form[@id='frmWebRes']/table/tbody/tr[7]/td/table[2]/tbody/tr/td/table/tbody/tr[2]/td[2]/strong")
	public  WebElement TotalAmt;

	@FindBy(xpath="//form[@id='frmWebRes']/table/tbody/tr[7]/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[2]/strong")
	public  WebElement TotalTax;

	@FindBy(xpath="//form[@id='frmWebRes']/table/tbody/tr[7]/td/table[2]/tbody/tr/td/table/tbody/tr[4]/td[2]/strong")
	public  WebElement TotalAmtWithTAx;

	@FindBy(xpath="//form[@id='frmWebRes']//tbody//tr")
	public  List<WebElement> count;

	@FindBy(xpath="//table[@id='web_res_id1']//tr[4]//form[@id='frmWebRes']/table/tbody//tr")
    public  List<WebElement> AllRoomTypeOnWeb;

	//@FindBy(xpath="//form[@id='frmWebRes']//tbody//tr[7]//td[@class='brdr-btm'][2]//tbody//tr")

	@FindBy(xpath="//form[@id='frmWebRes']//tbody//tr[7]//td[@class='brdr-btm'][2]//tbody//tr")
	public  List<WebElement> package_count;

	public  ArrayList<String> al=new ArrayList<String> ();




	@FindBy(xpath="//table[@class='tbl-contentNew']/tbody/tr[3]//em")
    public  WebElement AddOnsName_TX;


@FindBy(xpath="//span[text()=' Add-ons ']")
    public  WebElement AddOns_Link;

   @FindBy(xpath="//select[contains(@onchange,'changeSelectedRoom')]")
   public WebElement drpdown_Rooms;



public void fn_ValidateAddedAddOns() throws Exception
{

        try
        {
        String str=GenericMethods.getText(AddOnsName_TX);
        Assert.assertTrue(str.contains(AddOnsPage.AddOnsName));
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
 public void sample(){
	 String abc = "abc";
	 String cde = "abc";
	 Assert.assertEquals(abc, cde);
 }

public AddOnsPage fn_ClickAddOnsLink() throws Exception
{

        try
        {
            GenericMethods.clickElement(AddOns_Link);
            AddOnsPage AOP=PageFactory.initElements(GenericMethods.driver, AddOnsPage.class);
            return AOP;
        }
        catch(Exception e)
        {
            throw e;
        }

}



public WebConfirmReservationPage ClickOnConfirmBtn() throws Exception
	{
	   try
	   {
		GenericMethods.clickElement(Confirm_BT);
		WebConfirmReservationPage WCR=PageFactory.initElements(GenericMethods.driver,WebConfirmReservationPage.class );
		return WCR;
	   }
	   catch(Exception e)
	   {
		   throw e;
	   }
	}



public WebConfirmReservationPage fn_selectRoomAndConfirm() throws Exception
{
	
    try
    {
	GenericMethods.selectElementByIndex(drpdown_Rooms, 1);
	
	GenericMethods.clickElement(Confirm_BT);
	WebConfirmReservationPage WCR=PageFactory.initElements(GenericMethods.driver,WebConfirmReservationPage.class );
	return WCR;
    }
    catch(Exception e)
    {
    	throw e;
    }
}


	public WebConfirmReservationPage fn_ConfirmBookingPaymentPage() throws Exception
	{
		try
		{
       // GenericMethods.clickElement(Confirm_BT);
        String str=GenericMethods.getText(SectionTitle);
       /* if(str.equalsIgnoreCase("Confirm your Booking / Payments"))
        {
            System.out.println("Confirm your Booking / Payments section is visible on Web Reservation");

        }*/
        Assert.assertEquals(str, "Confirm your Booking / Payments");
        WebConfirmReservationPage WCRP=PageFactory.initElements(GenericMethods.driver, WebConfirmReservationPage.class);
        return WCRP;
		}
		catch(Exception e)
		{
			throw e;
		}
	}


	public ArrayList<String> GetPriceDetails()
	{
		String tamt=GenericMethods.getText(TotalAmt).trim();
		String ttax=GenericMethods.getText(TotalTax).trim();
		String TamtTax=GenericMethods.getText(TotalAmtWithTAx).trim();
		al.add(tamt);
		al.add(ttax);
		al.add(TamtTax);
		return al;

	}


	public  void packagePriceVerify(String name)
	{
		int no=GenericMethods.tr_count(AllRoomTypeOnWeb);
		for(int i=7;i<=no-2;i++)
		{
	     String nameRoomType = GenericMethods.driver.findElement(By.xpath("//form[@id='frmWebRes']//tbody//tr["+i+"]//td[@class='brdr-btm']/h5")).getText();

	     if(nameRoomType.equals(name))
	     {
		//int noOfPackage=GenericMethods.tr_count(count);
		String pkgPrice =packageVerify();
		 String priceOfPackage = "Rs "+PackageDetailsCentralisedRate.priceOfPAckage;
		 System.out.println(priceOfPackage);
		if(pkgPrice.equals(priceOfPackage))
		{
			System.out.println("Package Price Matched");
			break;
		}
		else
		{
			System.out.println("Package Price not Matched");
		}

		}
	     else
	     {
			System.out.println("Room Type not matched");
		}
	    }
	}



	public  String  packageVerify()
	{
		List<WebElement> abc=package_count;
		int a=abc.size();
		String pkgPrice = null;
		int noOfPackage=GenericMethods.tr_count(package_count);
		for (int i=1; i<=noOfPackage;i=i+4)
		{
			String pkgName = GenericMethods.driver.findElement(By.xpath("//td[@class='brdr-btm']//tbody//tr["+i+"]/td/strong")).getText();
			System.out.println(pkgName);
			if(pkgName.contains(PackageDetailsCentralisedRate.pkgName))
			{
				System.out.println("Package name matched");
				 pkgPrice = GenericMethods.driver.findElement(By.xpath("//td[@class='brdr-btm']//tbody//tr["+i+"]//td[2]/strong")).getText();
				System.out.println(pkgPrice);
			break;
			}
			else
			{
				System.out.println("Package name not matched");
			}
		}
		return pkgPrice;
	}

public String fn_pageVerify() throws Exception
{
	try
	{
   String str=GenericMethods.getText(SectionTitle);
   return str;
 //  Assert.assertEquals(str, "Reservation Detail");
	}
	catch(Exception e)
	{
		throw e;
	}
	
}



}
