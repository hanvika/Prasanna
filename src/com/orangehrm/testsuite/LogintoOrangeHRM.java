package com.orangehrm.testsuite;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LogintoOrangeHRM{
	@FindBy(name="txtUsername")
	WebElement txtUsername;
	
	@FindBy(name="txtPassword")
	WebElement txtPassword;
	
	@FindBy(id="btnLogin")
	WebElement btnLogin;
	@Test
	public void logincontent(String U,String P)
	{
		txtUsername.sendKeys(U);
		txtPassword.sendKeys(P);
		btnLogin.click();
		
		
		
		
	}
	

}
