package com.online.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.online.pages.homePage;
import com.online.testcases.loginTestCase001;
import com.online.Base.TestBase;

public class loginPage extends TestBase 
{
	
	public static final Logger log = Logger.getLogger(loginPage.class.getName());
	
	//  page factory OR  Object Resp
	

	
//	@FindBy(xpath="//input[@id='passwd']")
	
	@FindBy(css="input[id='passwd']")
	WebElement Password;
	
//	@FindBy(xpath="//a[@class='login']")
	
	@FindBy(css="a[class='login']")
	WebElement MyaccLink;
	
	
//	@FindBy(xpath="//button[@id='SubmitLogin']")
	
	@FindBy(css="button[id='SubmitLogin']")
	WebElement loginBtn1;
	
	@FindBy(css="input[id='email']")
	WebElement EnterUsername_email;
	
	
	
	
	
	public loginPage(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	// Actions
	
	public String validateLoginPage(){
		
		return driver.getTitle();
	}
	
    
	
     public homePage Login(String username,String pwd) throws Exception{
    	 
    	 
    	 MyaccLink.click();
    	 log.info("clicked on 1st signin link   "+MyaccLink.toString());
    	 
    	 		
    	 EnterUsername_email.sendKeys(username);
    	 log.info("enterted email address in text box    "+EnterUsername_email.toString());
    	
    
    	Password.sendKeys(pwd);
    	
    	 log.info("enterted passowrd in text box    "+Password.toString());
    	
    	loginBtn1.click();
    	
    	log.info("clicked on 2nd   signin button   "+loginBtn1.toString());
    	
    	
    	
    	return new homePage();
    	
 	}
     
     

	

}
