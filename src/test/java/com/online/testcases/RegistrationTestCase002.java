package com.online.testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Util.TestUtil;
import com.online.Base.TestBase;
import com.online.pages.RegistrationPage;
import com.online.pages.homePage;


public class RegistrationTestCase002 extends TestBase {
	
	
	public static final Logger log = Logger.getLogger(RegistrationTestCase002.class.getName());
	
      

       homePage hpage;
       
       RegistrationPage Rpage;
       
       TestUtil     Excelutil;
       
       String sheetname = "Sheet2";

			public RegistrationTestCase002()
			{
				super();
				
			}

			
			@BeforeMethod
			public void setUP() throws Exception
			{
				init();
				
				initializationBrowser();
				
				Rpage = new RegistrationPage();
				
			}
			
			
			@DataProvider
			public Object[][] getOnlineTestData1(){
				
				Object data [][] = TestUtil.getTestData(sheetname) ;
				
				return data;
				
			}
			
                     //  int  daynum, int monthnum, int yearnum,    daynum, monthnum, yearnum,

					@Test(dataProvider="getOnlineTestData1")
					public void Registration_Test(String newemail, String newFirstname, String  newlastanme, String  newpasswd, String custfname, String custlname, String custcompany, String add1, String city1, String cust_state, String cust_zipcode, String  cust_mobile, String custAlias_Add1 )
					{

						log.info("========== test case started ================== ");
						
	try {
		
		
		
		hpage=Rpage.NewEmailAcc(newemail, newFirstname, newlastanme, newpasswd,  custfname, custlname, custcompany, add1, city1, cust_state, cust_zipcode, cust_mobile, custAlias_Add1)	;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}				
						
						log.info(" ------------------test case ended ---------- ");     
						
					}


	


					

						@AfterMethod
						public void ternDown()
						{
							
							driver.quit();
							
						}

}
