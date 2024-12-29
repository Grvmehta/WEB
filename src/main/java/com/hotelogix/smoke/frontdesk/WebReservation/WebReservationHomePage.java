package com.hotelogix.smoke.frontdesk.WebReservation;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.crypto.SealedObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.hotelogix.smoke.admin.PriceManager.RoomPricesLandingPage;
import com.hotelogix.smoke.admin.WebTravelAgent.TravleAgent_LoginPage;
import com.hotelogix.smoke.genericandbase.Constant;
import com.hotelogix.smoke.genericandbase.ExcelUtil;
//import com.hotelogix.smoke.admin.WebBookingEngine.SelectRoom_Packages;
import com.hotelogix.smoke.genericandbase.GenericMethods;

public class WebReservationHomePage
{


	public static String frmMonth="Nov";
	public static String frmYear="2015";
	public static String frmDate="1";
	public static String toMonth="Nov";
	public static String toYear="2015";
	public static String toDate="3";
	public static String noOfRoom="3";

/*
 WebElement StayDetails_Text;
 WebElement CheckINCalender_IMG;
 WebElement NightEditBox_ED;
 WebElement CheckInCalenderDate_Link;
 WebElement CheckOutCalender_IMG;
 WebElement Adult_DD;
 WebElement CheckAvalibility_BT;
 List<WebElement> DateCollection;
 List<WebElement> Tr_Count;
 WebElement SpecialDiscount_Link;
 WebElement SPdiscount_DD;
 WebElement SPdiscount_ED;
 WebElement Price_Text;
 WebElement Discount_Text;
 WebElement reason_DD;
 WebElement reason_editbox;
 WebElement arrivalCal;
 WebElement departureCal;
 WebElement adult_DrpDwn;
 WebElement chkAvalibility_BT;
 WebElement noOfNight_txtField;
 WebElement mnthYearTitelFrmcal;
 WebElement select_FrmMnth;
 WebElement enterFrmYear;
 WebElement okButton_Frmcalander;
 WebElement chartfrom;
 WebElement travleAgent_Link;
 public WebDriver driver;
 public WebReservationHomePage(){
//this.driver=driver;

        StayDetails_Text= GenericMethods.ExplicitWait("xpath","//form[@id='frmWebRes']//table//tr[2]/td");
		CheckINCalender_IMG= GenericMethods.ExplicitWait("xpath","//img[@id='calIn']");
		NightEditBox_ED= GenericMethods.ExplicitWait("xpath","//input[@id='non']");
		CheckInCalenderDate_Link= GenericMethods.ExplicitWait("xpath","//table[@id='webresCalPopup_t']//tbody//tr//td//a");
		CheckOutCalender_IMG= GenericMethods.ExplicitWait("xpath","//img[@id='calOut']");
		Adult_DD= GenericMethods.ExplicitWait("name","noOfAdult");
		CheckAvalibility_BT= GenericMethods.ExplicitWait("name","Submit");
		DateCollection= (List<WebElement>) GenericMethods.ExplicitWait("xpath","//table[@id='webresCalPopup_t']//tbody//tr//td//a");
		Tr_Count= (List<WebElement>) GenericMethods.ExplicitWait("xpath","//table[@class='tbl-contentNew']//tr['2']//td[2]//table//tr");
	    SpecialDiscount_Link= GenericMethods.ExplicitWait("xpath","//form[@id='frmWebRes']//a/em");
		SPdiscount_DD= GenericMethods.ExplicitWait("xpath","//select[@id='spDiscount']");
		Price_Text= GenericMethods.ExplicitWait("xpath","//table[@class='tbl-contentNew']//table//tr//td[2]//strong");
		Discount_Text= GenericMethods.ExplicitWait("xpath","//select[@id='spDiscount']//option[2]");
		reason_DD= GenericMethods.ExplicitWait("xpath","//select[@name='reqId']");
		reason_editbox= GenericMethods.ExplicitWait("xpath","//input[@name='Spvalue']");
		arrivalCal= GenericMethods.ExplicitWait("xpath","//table[@class='tbl01']//td/img");
		departureCal= GenericMethods.ExplicitWait("xpath","//td//img[@id='calOut']");
		adult_DrpDwn= GenericMethods.ExplicitWait("xpath","//table[@class='tbl01']//tr[11]//td/select");
		chkAvalibility_BT= GenericMethods.ExplicitWait("xpath","//input[@id='avlChkBtnId']");
		noOfNight_txtField= GenericMethods.ExplicitWait("xpath","//table[@class='tbl01']//tr[5]//td/input");
        mnthYearTitelFrmcal= GenericMethods.ExplicitWait("xpath","//a[@class='calnav']");
        select_FrmMnth= GenericMethods.ExplicitWait("xpath","//div[@class='yui-cal-nav']/div/select");
        enterFrmYear= GenericMethods.ExplicitWait("xpath","//div[@class='yui-cal-nav']//div/input");
        okButton_Frmcalander= GenericMethods.ExplicitWait("xpath","//div[@class='yui-cal-nav']//div/span/button");
        chartfrom= GenericMethods.ExplicitWait("xpath","//div[@id='webresCalPopup']");
        travleAgent_Link= GenericMethods.ExplicitWait("xpath","//table[@id='web_res_id1']//td//a[2]");
 
 
 
 
 
 
 
 
 
 
 
 
 }
 
 
 */
	@FindBy(xpath="//form[@id='frmWebRes']//table//tr[2]/td")
    public  WebElement StayDetails_Text;

	@FindBy(xpath="//img[@id='calIn']")
    public  WebElement CheckINCalender_IMG;

    @FindBy(xpath="//input[@id='non']")
    public  WebElement NightEditBox_ED;

    @FindBy(xpath="//table[@id='webresCalPopup_t']//tbody//tr//td//a")
    public  WebElement CheckInCalenderDate_Link;

    @FindBy(xpath="//img[@id='calOut']")
    public  WebElement CheckOutCalender_IMG;

    @FindBy(name="noOfAdult")
    public  WebElement Adult_DD;

    @FindBy(name="Submit")
    public  WebElement CheckAvalibility_BT;

    @FindBy(xpath="//table[@id='webresCalPopup_t']//tbody//tr//td//a")
    public  List<WebElement> DateCollection;

    @FindBy(xpath="//table[@class='tbl-contentNew']//tr['2']//td[2]//table//tr")
    public  List<WebElement> Tr_Count;


    @FindBy(xpath="//form[@id='frmWebRes']//a/em")
    public  WebElement SpecialDiscount_Link;

    @FindBy(xpath="//select[@id='spDiscount']")
    public  WebElement SPdiscount_DD;

    @FindBy(xpath="//input[@name='Spvalue']")
    public  WebElement SPdiscount_ED;

    @FindBy(xpath="//table[@class='tbl-contentNew']//table//tr//td[2]//strong")
    public  WebElement Price_Text;

    @FindBy(xpath="//select[@id='spDiscount']//option[2]")
    public  WebElement Discount_Text;

    @FindBy(xpath="//select[@name='reqId']")
    public  WebElement reason_DD;

    @FindBy(xpath="//input[@name='Spvalue']")
    public  WebElement reason_editbox;


    @FindBy(xpath="//table[@class='tbl01']//td/img")
	public  WebElement arrivalCal;

    @FindBy(xpath="//td//img[@id='calOut']")
	public  WebElement departureCal;

    @FindBy(xpath="//table[@class='tbl01']//tr[11]//td/select")
	public  WebElement adult_DrpDwn;

	@FindBy(xpath="//input[@id='avlChkBtnId']")
	public  WebElement chkAvalibility_BT;

	@FindBy(xpath="//table[@class='tbl01']//tr[5]//td/input")
	public  WebElement noOfNight_txtField;

	@FindBy(xpath="//a[@class='calnav']")
	public  WebElement mnthYearTitelFrmcal;

	@FindBy(xpath="//div[@class='yui-cal-nav']/div/select")
	public  WebElement select_FrmMnth;

	@FindBy(xpath="//div[@class='yui-cal-nav']//div/input")
	public  WebElement enterFrmYear;

	@FindBy(xpath="//div[@class='yui-cal-nav']//div/span/button")
	public  WebElement okButton_Frmcalander;

	@FindBy(xpath="//div[@id='webresCalPopup']")
    public  WebElement chartfrom;

	@FindBy(xpath="//table[@id='web_res_id1']//td//a[2]")
	public  WebElement travleAgent_Link;
	
	@FindBy(xpath="//div[@id='webresCalPopup']//a[contains(text(),'Next Month')]")
	public  WebElement rightArrow_Link;
	

	public void fn_ValidateStaydetailsPage(int iTestCaseRow) throws Exception
	{
		try
		{
        String str=GenericMethods.getText(StayDetails_Text); 
        String str1=ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1));
        
        System.out.println(str);
        System.out.println(str1);
        
        int a=ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1);
    	Assert.assertEquals(str.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1))), true);

        //return str;
		}
		catch(Exception e)
		{
			throw e;
		}
    }


	public WebSelectRoomPage fn_CheckAvability() throws Exception
	{
		try
		{
			Thread.sleep(7000);
        GenericMethods.clickElement(CheckINCalender_IMG);
        GenericMethods.clickElement(CheckInCalenderDate_Link);
        GenericMethods.js_Sendkey(NightEditBox_ED, "1");
        Calendar cal = Calendar.getInstance();
        System.out.println("current date: " + cal.getTime());
        cal.add(Calendar.DATE, 1);
        Date dob=cal.getTime();
        System.out.println("dob"+dob);
        String st=dob.toString();
        System.out.println("st::"+st);
        String[] parts=st.split(" ");
        String parts2=parts[2];
        System.out.println(parts2);
        Thread.sleep(2000);
        GenericMethods.js_Click(CheckOutCalender_IMG);
        System.out.println("Size of dateCollection::"+DateCollection.size());
        for(WebElement date: DateCollection )
        {
            String strobj1=date.getText();
            System.out.println("date get text came as::"+strobj1);
            if(parts2.contains("01") && (strobj1.contains("31")) || (strobj1.contains("30"))  ){
            	System.out.println("Clicking right arrow");
            	rightArrow_Link.click();
            	DateCollection.get(0).click();
            break;
        }
            else if(parts2.contains(strobj1))
            {
            	System.out.println("In else");
            	date.click();
                break;
            }
        }

        Thread.sleep(3000);
        GenericMethods.selectElement(Adult_DD, "1");
        GenericMethods.clickElement(CheckAvalibility_BT);

        WebSelectRoomPage WSP =  PageFactory.initElements(GenericMethods.driver, WebSelectRoomPage.class);
        return WSP;
		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public static float c;
    public static String disc;

    public WebSelectRoomPage spclDisc_chkAvailability() throws Exception
    {
    	try
    	{
    		Thread.sleep(3000);
    	GenericMethods.clickElement(CheckINCalender_IMG);
        GenericMethods.clickElement(CheckInCalenderDate_Link);
        GenericMethods.sendKeys(NightEditBox_ED, "1");
        Calendar cal = Calendar.getInstance();
        System.out.println("current date: " + cal.getTime());
        cal.add(Calendar.DATE, 1);
        Date dob=cal.getTime();
        String st=dob.toString();
        String[] parts=st.split(" ");
        String parts2=parts[2];
        System.out.println(parts2);
        GenericMethods.clickElement(CheckOutCalender_IMG);
        for(WebElement date: DateCollection )
        {
            String strobj=date.getText();
            if(parts2.contains(strobj)){
            date.click();
            break;
        }
        }
        GenericMethods.selectElement(Adult_DD, "1");
        GenericMethods.clickElement(SpecialDiscount_Link);
        Select sel=new Select(SPdiscount_DD);
        //sel.selectByVisibleText("army(50.00%)");
        //GenericMethods.selectbyNo(SPdiscount_DD, 1);
        sel.selectByIndex(1);
        disc=sel.getFirstSelectedOption().getText();
        int i=disc.indexOf("(");
		String str=disc.substring(i+1,disc.indexOf("%"));
		c=Float.parseFloat(str);
		System.out.println(c);
        //GenericMethods.selectbyNo(reason_DD, 0);
		Thread.sleep(1000);
		GenericMethods.selectElementByIndex(reason_DD, 0);
		Thread.sleep(3000);
        String data=GenericMethods.generateRandomString();
        GenericMethods.sendKeys(reason_editbox,data);
        Thread.sleep(3000);
        GenericMethods.clickElement(CheckAvalibility_BT);
        WebSelectRoomPage WSP =  PageFactory.initElements(GenericMethods.driver, WebSelectRoomPage.class);
        return WSP;
    	}
    	catch(Exception e)
    	{
    		throw e;
    	}

        }

    public  WebSelectRoomPage fillRevForm() throws Exception{
		fn_SelectDateFrmDatePicker(arrivalCal,"Nov","2015","1");
		fn_SelectDateFrmDatePicker(departureCal,"Nov","2015","2");
		noOfNight_txtField.click();
		noOfNight_txtField.clear();
		GenericMethods.sendKeys(noOfNight_txtField, "1");
		GenericMethods.selectElement(adult_DrpDwn, "1");
		GenericMethods.clickElement(chkAvalibility_BT);
		WebSelectRoomPage pageobj=PageFactory.initElements(GenericMethods.driver, WebSelectRoomPage.class );
		return pageobj;
	}

  //************************************************ DatePicker method	------ From datePicker
  		public  void fn_SelectDateFrmDatePicker(WebElement calIcon, String month, String year, String date1) throws Exception{

  			 frmMonth=month;
  			 frmYear=year;
  			 frmDate=date1;


  			 GenericMethods.clickElement(calIcon);
  			 GenericMethods.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
  			 GenericMethods.clickElement(mnthYearTitelFrmcal);

  			 GenericMethods.selectElement(select_FrmMnth, frmMonth);

  			 GenericMethods.clickElement(enterFrmYear);
  		     enterFrmYear.clear();
  		     GenericMethods.sendKeys(enterFrmYear, frmYear);

  		     GenericMethods.clickElement(okButton_Frmcalander);

  		     String classname = chartfrom.getAttribute("class");

  		     WebElement abc=  GenericMethods.driver.findElement(By.xpath("//table[@id='webresCalPopup_t']//tbody//tr//td//a[contains(text(),('" + frmDate + "') )]"));
  			 abc.click();

  			}

  		public  TravleAgent_LoginPage fn_NavigateToTA_Console() throws Exception
  		{
  			GenericMethods.clickElement(travleAgent_Link);
  			TravleAgent_LoginPage pageobj=PageFactory.initElements(GenericMethods.driver, TravleAgent_LoginPage.class);
  			return pageobj;
  		}

  		public static int fn_CheckTax(int Price, int percent){
  			int a=Price*percent/100;
  			return a;
  		}



}
