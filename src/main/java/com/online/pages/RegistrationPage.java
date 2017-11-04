package com.online.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.online.Base.TestBase;

public class RegistrationPage extends TestBase {
	
public static final Logger log = Logger.getLogger(RegistrationPage.class.getName());
	
	//  page factory OR  Object Resp

	
				@FindBy(css="a[class='login']")
				WebElement NewAccLink;

             

				@FindBy(css="input[id='email_create']")
				WebElement NewUsername_email;


				//@FindBy(xpath="//button[@id='SubmitLogin']")
				
				@FindBy(css="button[id='SubmitCreate']")
				WebElement CreateACCbtn;
				
				@FindBy(css="input[value='1']")
				WebElement radioBtnforMale;
				
				@FindBy(css="input[value='2']")
				WebElement radioBtnforFeMale;	
				
				@FindBy(css="input[name='customer_firstname']")
				WebElement customer_firstname;
	
				@FindBy(css="input[name='customer_lastname']")
				WebElement customer_lastname;
				
				@FindBy(css="input[id='passwd']")
				WebElement NewPassword;
				
				
			//	@FindBy(css="select[id='days']")
			//	WebElement days_dob;
	      
			//	@FindBy(css="select[id='months']")
			//	WebElement month_dob;
			//	
			//	@FindBy(css="select[id='years']")
			//	WebElement year_dob;
				
				// address web elements 
				
				@FindBy(css="input[name='firstname']")
				WebElement cus_firstname;
				
				@FindBy(css="input[name='lastname']")
				WebElement cus_lastname;
				
				@FindBy(css="input[name='company']")
				WebElement cus_company;
				
				@FindBy(css="input[name='address1']")
				WebElement cus_address1;
				
				@FindBy(css="input[name='city']")
				WebElement cus_city;
				
				// id_state
				@FindBy(css="select[id='id_state']")
				WebElement select_id_state;
				
				//postcode
				@FindBy(css="input[name='postcode']")
				WebElement cus_postcode;
				
				@FindBy(css="input[name='phone_mobile']")
				WebElement cus_phone_mobile;
				
				
				@FindBy(css="input[name='alias']")
				WebElement cus_alias_address;
				
				
				@FindBy(css="button[name='submitAccount']")
				WebElement Register_ACC_button;
				
				@FindBy(css="a[class='logout']")
				WebElement ACC_logOUT;
				
				
	
	public RegistrationPage(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	// Actions
	
	public String validateRegistrationPage(){
		
		return driver.getTitle();
	}
	
	
	//  int daynum,int monthnum,int yearnum,
	
	
	       public homePage NewEmailAcc(String newemail, String newFirstname, String newlastanme, String newpasswd, String custfname , String custlname , String custcompany  ,String add1  ,String city1 ,String cust_state   ,String cust_zipcode,String cust_mobile  , 
	    		   String custAlias_Add1                                   
	    		   
	    		   ) throws Exception{
   	 
   	                   //  1 -  click on sign in link 
			           NewAccLink.click();
				       log.info("clicked on 1st new signin link   "+NewAccLink.toString());
				 
				       //  2 -  enter new email id
				        NewUsername_email.sendKeys(newemail);
				         log.info("enterted email address in text box    "+NewUsername_email.toString());
	

	                     //  3 - click on create accoount button 	
				         CreateACCbtn.click();
	
				         log.info("clicked on 2nd   signin button   "+CreateACCbtn.toString());
				         
				         Thread.sleep(5000);
				         
				     //  4 - click on male radio button 	
				         radioBtnforMale.click();
				         
				         log.info(" click on male radio button   "+radioBtnforMale.toString());
				         
				         // 5 customer_firstname
				         customer_firstname.sendKeys(newFirstname);
				         
				         log.info(" first name entered    "+customer_firstname.toString());
				         
				         // 6 
				         customer_lastname.sendKeys(newlastanme);
				         
				         log.info(" last name entered    "+customer_lastname.toString());
				         
				         //7
				         NewPassword.sendKeys(newpasswd);
	
				         log.info(" password entered    "+NewPassword.toString());
				         
				         
				        /*
				         
				         Select select = new Select(driver.findElement(By.cssSelector("select[id='days']")));
				     
				         
				         select.selectByIndex(daynum);
				     		
				     	  log.info(" selected day of DOB   ");	
				     		  
				     		 // 9  
				     	
				     		Select select1 = new Select(driver.findElement(By.cssSelector("select[id='months']")));
				     		select1.selectByIndex(monthnum);
				      
				     		  log.info(" selected MONTH of DOB   ");
				     		  
				     		  
				     		  // 10 
				     		
				     			Select select2 = new Select(driver.findElement(By.cssSelector("select[id='years']")));
				     			select2.selectByIndex(yearnum);
				     			
				     			  log.info(" selected YEAR of DOB   ");
				     			
				     			*/
				     	//11
				     			cus_firstname.sendKeys(custfname);
				     		  
				     			 log.info(" cust first name again enter   "+cus_firstname.toString());
				     		  
				     		  
				     		// 12   
				     			cus_lastname.sendKeys(custlname);
				     		  
				     			 log.info(" cust last name again enter   "+cus_lastname.toString());
				     		  
				     		//13  
				     			cus_company.sendKeys(custcompany);
				     		  
				     			log.info(" cust cus_company  "+cus_company.toString());
				     		  
				     		  // 
				     			cus_address1.sendKeys(add1);
				     			log.info(" cust cus_address1  "+cus_address1.toString());
				     			
				     			
				     			cus_city.sendKeys(city1);
				     			log.info(" cust cus_city "+cus_city.toString());
				     			
				     			
				     		// select_id_state	
				     			
				     			Select select3 = new Select(driver.findElement(By.cssSelector("select[id='id_state']")));
					     		select3.selectByVisibleText(cust_state);    
					     		
					     		log.info(" cust select_id_state	 ");
					     		
					     		
					     		
					     		cus_postcode.sendKeys(cust_zipcode.substring(0, 5));
					     		
					     		log.info(" cust cus_postcode ");
				     			
				     			
					     		cus_phone_mobile.sendKeys(cust_mobile);
				     			
					     		log.info(" cus_phone_mobile     "+cus_phone_mobile.toString());
				     			
				     			
				     			
					     		cus_alias_address.sendKeys(custAlias_Add1);
				     			
					     		log.info(" cust cus_alias_address "+cus_alias_address.toString());
				     			
				     			
				     			
					     		Register_ACC_button.click();
					     		
					     		log.info(" cust Register_ACC_button clicked  "+Register_ACC_button.toString());
					     		
					     		 Thread.sleep(8000);
					     		 
					     		 
					     		ACC_logOUT.click();
				     			
					     		log.info(" cust ACC_logOUT clicked  "+ACC_logOUT.toString());
					     		
					     		Thread.sleep(8000);
	
	               return new homePage();
	
}

}
