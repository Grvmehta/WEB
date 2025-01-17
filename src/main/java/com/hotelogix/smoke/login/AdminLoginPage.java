package com.hotelogix.smoke.login;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import com.hotelogix.smoke.genericandbase.BasePage;
import com.hotelogix.smoke.genericandbase.GenericMethods;
import org.openqa.selenium.WebDriver;



public class AdminLoginPage {

	/*public WebElement Hotel_Code;

	public WebElement Username;

	public WebElement Password;

	public WebElement Login;
	public WebDriver driver;
	
	public AdminLoginPage(){
		this.Hotel_Code= GenericMethods.ExplicitWait("xpath","//input[@id='hotelCodeId']");
		this.Username= GenericMethods.ExplicitWait("xpath","//input[@id='userNameId']");
		this.Password= GenericMethods.ExplicitWait("xpath","//input[@id='passwordId']");
		this.Login= GenericMethods.ExplicitWait("xpath","//input[@name='Submit52']");	
	}*/
	@FindBy(xpath="//input[@id='hotelCodeId']")
	public  WebElement Hotel_Code;

	@FindBy(xpath="//input[@id='userNameId']")
	public  WebElement Username;

	@FindBy(xpath="//input[@id='passwordId']")
	public  WebElement Password;

	@FindBy(xpath="//input[@name='Submit52']")
	public  WebElement Login;

	public BasePage adminlogin_12719() throws Exception{

		GenericMethods.sendKeys(Hotel_Code, "12719");
		GenericMethods.sendKeys(Username, "deepa.kthayat@hotelogix.com");
		GenericMethods.sendKeys(Password, "deepak");
		GenericMethods.clickElement(Login);

		BasePage BP = PageFactory.initElements(GenericMethods.driver, BasePage.class);
		return BP;

	}

	public  BasePage adminlogin_12725() throws Exception{

		try{

		try{
	        GenericMethods.sendKeys(Hotel_Code, "12725");

	        }catch(Exception e){
	            String str="//input[@id='hotelCodeId']";
	            WebElement we=GenericMethods.ExplicitWait(Hotel_Code, str);
	            GenericMethods.sendKeys(we, "12725");
	            }

	       try{
	           GenericMethods.sendKeys(Username, "c.handravijayeciimt@gmail.com");
	       }catch(Exception e){
	           String str="//input[@id='userNameId']";
	           WebElement we=GenericMethods.ExplicitWait(Hotel_Code, str);
	           GenericMethods.sendKeys(we, "c.handravijayeciimt@gmail.com");
	       }

	       try{
	           GenericMethods.sendKeys(Password, "bdc776d0");
	       }catch(Exception e){
	           String str="//input[@id='passwordId']";
	           WebElement we=GenericMethods.ExplicitWait(Password, str);
	           GenericMethods.sendKeys(we, "bdc776d0");
	       }

	       try{
	           GenericMethods.clickElement(Login);
	       }catch(Exception e){
	           String str="//input[@name='Submit52']";
	           WebElement we=GenericMethods.ExplicitWait(Login, str);
	           GenericMethods.clickElement(we);
	       }
	       }catch(Exception e){

	    	   GenericMethods.driver.navigate().refresh();
	    	   Thread.sleep(3500);
	   		try{
		        GenericMethods.sendKeys(Hotel_Code, "12725");

		        }catch(Exception e1){
		            String str="//input[@id='hotelCodeId']";
		            WebElement we=GenericMethods.ExplicitWait(Hotel_Code, str);
		            GenericMethods.sendKeys(we, "12725");
		            }

		       try{
		           GenericMethods.sendKeys(Username, "c.handravijayeciimt@gmail.com");
		       }catch(Exception e1){
		           String str="//input[@id='userNameId']";
		           WebElement we=GenericMethods.ExplicitWait(Hotel_Code, str);
		           GenericMethods.sendKeys(we, "c.handravijayeciimt@gmail.com");
		       }

		       try{
		           GenericMethods.sendKeys(Password, "bdc776d0");
		       }catch(Exception e1){
		           String str="//input[@id='passwordId']";
		           WebElement we=GenericMethods.ExplicitWait(Password, str);
		           GenericMethods.sendKeys(we, "bdc776d0");
		       }

		       try{
		           GenericMethods.clickElement(Login);
		       }catch(Exception e1){
		           String str="//input[@name='Submit52']";
		           WebElement we=GenericMethods.ExplicitWait(Login, str);
		           GenericMethods.clickElement(we);
		       }

	       }

	       BasePage BP = PageFactory.initElements(GenericMethods.driver, BasePage.class);
	        return BP;
	    }



	public  BasePage adminlogin_20819() throws Exception{

		try{

		try{
	        GenericMethods.sendKeys(Hotel_Code, "20819");

	        }catch(Exception e){
	            String str="//input[@id='hotelCodeId']";
	            WebElement we=GenericMethods.ExplicitWait(Hotel_Code, str);
	            GenericMethods.sendKeys(we, "20819");
	            }

	       try{
	           GenericMethods.sendKeys(Username, "barkha.kapoorhms@gmail.com");
	       }catch(Exception e){
	           String str="//input[@id='userNameId']";
	           WebElement we=GenericMethods.ExplicitWait(Hotel_Code, str);
	           GenericMethods.sendKeys(we, "barkha.kapoorhms@gmail.com");
	       }

	       try{
	           GenericMethods.sendKeys(Password, "a899c22c");
	       }catch(Exception e){
	           String str="//input[@id='passwordId']";
	           WebElement we=GenericMethods.ExplicitWait(Password, str);
	           GenericMethods.sendKeys(we, "a899c22c");
	       }


	       try{
	           GenericMethods.clickElement(Login);
	           
	       }catch(Exception e){
	           String str="//input[@name='Submit52']";
	           WebElement we=GenericMethods.ExplicitWait(Login, str);
	           GenericMethods.clickElement(we);
	       }
	       }catch(Exception e){

	    	   GenericMethods.driver.navigate().refresh();
	    	   Thread.sleep(3500);
	   		try{
		        GenericMethods.sendKeys(Hotel_Code, "20819");

		        }catch(Exception e1){
		            String str="//input[@id='hotelCodeId']";
		            WebElement we=GenericMethods.ExplicitWait(Hotel_Code, str);
		            GenericMethods.sendKeys(we, "20819");
		            }

		       try{
		           GenericMethods.sendKeys(Username, "barkha.kapoorhms@gmail.com");
		       }catch(Exception e1){
		           String str="//input[@id='userNameId']";
		           WebElement we=GenericMethods.ExplicitWait(Hotel_Code, str);
		           GenericMethods.sendKeys(we, "barkha.kapoorhms@gmail.com");
		       }

		       try{
		           GenericMethods.sendKeys(Password, "a899c22c");
		       }catch(Exception e1){
		           String str="//input[@id='passwordId']";
		           WebElement we=GenericMethods.ExplicitWait(Password, str);
		           GenericMethods.sendKeys(we, "a899c22c");
		       }




		       try{
		           GenericMethods.clickElement(Login);
		       }catch(Exception e1){
		           String str="//input[@name='Submit52']";
		           WebElement we=GenericMethods.ExplicitWait(Login, str);
		           GenericMethods.clickElement(we);
		       }

	       }

	       BasePage BP = PageFactory.initElements(GenericMethods.driver, BasePage.class);
	        return BP;
	    }




}

