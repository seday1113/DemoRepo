package com.online.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;



public class TestBase 
{
	
	public static final Logger log = Logger.getLogger(TestBase.class.getName());
	
	public static WebDriver driver;
	
	public static Properties prop;
	
	
	
	public TestBase()
	{
		
		prop = new Properties();
		
		
			try {
				FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//com//online//conifg//Config.properties");
				
				
					prop.load(ip);
					
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
				
	}
	
	
	public static void init() throws IOException {
		
		String log4jConfPath = "log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
		
	}
	
	public static void initializationBrowser()
	{
		
		String browserName = prop.getProperty("browser");
		
		if (browserName.equalsIgnoreCase("chrome"))
		{
			
			// System.setProperty("webdriver.chrome.driver", "C:\\Users\\satya\\workspace\\testSelenium\\drivers\\chromedriver.exe");
			
			log.info("Creating object of "+browserName);
			
			  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver1.exe");  
		
			
			driver=new ChromeDriver();
			
		} else  if (browserName.equalsIgnoreCase("firefox"))
		{
			
		//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\satya\\workspace\\testSelenium\\drivers\\geckodriver.exe");
			
			log.info("Creating object of "+browserName);
			
			  System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//drivers//geckodriver.exe");  
			
			driver=new FirefoxDriver();
			
		} else  if (browserName.equalsIgnoreCase("ie"))
		{
			
			log.info("Creating object of "+browserName);
			
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();

			capabilities.setCapability(CapabilityType.BROWSER_NAME, "IE");

			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);

			capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);

			
			System.setProperty("webdriver.ie.driver", "C:\\Users\\satya\\Desktop\\selenium_auto\\IEDriverServer_Win32_3.6.0\\IEDriverServer.exe");
			
		//	  System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"//drivers//IEDriverServer.exe");  
			  
			  // C:\Users\satya\Desktop\selenium_auto\IEDriverServer_Win32_3.6.0
			
			
			  driver = new InternetExplorerDriver();
			
		}
		
		// Maximize browser
		
		log.info(" maximize the browser window  ");
				driver.manage().window().maximize();
				
				
				driver.manage().deleteAllCookies();
				log.info(" deleting cookies   ");

				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				log.info("implicit wait applied   ");
				
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				log.info("page  load time out applied   ");
				
				driver.get(prop.getProperty("url"));
				log.info(" getting url  from property file - configartions     ");
				
				
		
	}

}
	
	
