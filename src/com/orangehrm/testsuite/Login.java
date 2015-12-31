package com.orangehrm.testsuite;
 import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.Platform;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login extends Constant{
	@Parameters("browser")
	@Test
	public void logintest(String b) throws IOException
	{
		DesiredCapabilities cap=null;
		if(b.equalsIgnoreCase("firefox"))
		{
		
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else if(b.equalsIgnoreCase("Chrome"))	
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("Chrome");
			cap.setPlatform(Platform.WINDOWS);
			
		}
		driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		driver.get("http://opensource.demo.orangehrm.com/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		LogintoOrangeHRM lo=PageFactory.initElements(driver,LogintoOrangeHRM.class);
	   Sleeper.sleepTightInSeconds(3);
	    String runmode=eo.getcellData(dataengine1,0,1,2);
		if(runmode.equalsIgnoreCase("N"))
		{
			throw new SkipException("Login test case skipped");
		}
		else
		{
		
	     lo.logincontent("Admin","admin");
	    }
		
	}

	}
