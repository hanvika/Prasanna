package com.orangehrm.testsuite;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
//import org.testng.SkipException;
import org.testng.annotations.Test;

public class Capturingscreenshot  extends Constant{
	@Test
	public void getScreenshot() throws IOException
	{
		String runmode=eo.getcellData(dataengine1,0,3,2);
		if(runmode.equals("N"))
		{
			throw new SkipException("Screeshot test case skipped");
		}
		else
		{
		TakingScreenshot ts=PageFactory.initElements(driver, TakingScreenshot.class);
		ts.takescreenshot(driver,screenpath+"\\Addemployee2.png");
	    }
	}

}
