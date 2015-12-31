package com.orangehrm.testsuite;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class AddEmployee extends Constant{
	@Test
	public  void addEmployeeTest() throws IOException 
{

AddEmployeePage aep=PageFactory.initElements(driver,AddEmployeePage.class);
int rowcount=eo.getRowCount(path,0);
String runmode=eo.getcellData(dataengine1,0,2,2);
if(runmode.equals("N"))
{
	throw new SkipException("AddEmp test case skipped");
}
else
{
	
     for(int i=1;i<=rowcount;i++)
      {
	    Row r=eo.getRow(path, 0, i);
		aep.menu.PIM();
		
		Sleeper.sleepTightInSeconds(1);
		aep.AddEmployee.click();
		Sleeper.sleepTightInSeconds(2);
		aep.AddEmployee_reg(r);
      }
		
}
	
		
}
}
