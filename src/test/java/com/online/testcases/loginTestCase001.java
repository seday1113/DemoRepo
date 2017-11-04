package com.online.testcases;


import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.online.Base.TestBase;
import com.online.pages.homePage;
import com.online.pages.loginPage;

public class loginTestCase001 extends TestBase 
{
	
	public static final Logger log = Logger.getLogger(loginTestCase001.class.getName());
	
         loginPage lpage;
	
	      homePage hpage;
	
	public loginTestCase001()
	{
		super();
		
	}
	
	
	@BeforeMethod
	public void setUP() throws Exception
	{
		init();
		
		initializationBrowser();
		
		lpage= new loginPage();
		
	}
	
	
	@Test(priority=1)
	public void loginPageTitleTest()
	{
		log.info("========== test case started ================== ");
		String tile=lpage.validateLoginPage();
		Assert.assertEquals(tile, "My Store");
		log.info(" ------------------test case ended ---------- ");
		
	}
	
	
		
	
	
	@Test(priority=2)
	public void loginn() throws Exception
	{
		log.info("========== test case started ================== ");
		
		hpage=lpage.Login(prop.getProperty("username"), prop.getProperty("password"));	
		
		log.info(" ------------------test case ended ---------- ");     
		
	}
	
	@AfterMethod
	public void ternDown()
	{
		
		driver.quit();
		
	}
	
	
	
}
