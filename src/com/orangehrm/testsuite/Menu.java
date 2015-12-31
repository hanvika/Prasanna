package com.orangehrm.testsuite;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;

public class Menu {
	@FindBy(xpath="//*[@id='menu_admin_viewAdminModule']/b")
	WebElement Admin;
	public void Admin()
	{
		Admin.click();
	}
	
	@FindBy(xpath="//*[@id='menu_pim_viewPimModule']/b")
	WebElement PIM;
	public void PIM()
	{
		PIM.click();
	}
	
	@FindBy(xpath="//*[@id='menu_leave_viewLeaveModule']/b")
	WebElement Leave;
	public void Leave()
	{
		Leave.click();
	}
	
	@FindBy(xpath=".//*[@id='menu_time_viewTimeModule']/b")
	WebElement Time;
	public void Time()
	{
		Time.click();
	}
	
	@FindBy(xpath="//*[@id='menu_recruitment_viewRecruitmentModule']/b")
	WebElement Recruitment;
	public void Recruitment()
	{
		Recruitment.click();
	}
	
	@FindBy(xpath="//*[@id='menu_discipline_defaultDisciplinaryView']/b")
	WebElement Discipline;
	public void Discipline()
	{
		Discipline.click();
	}
	
	@FindBy(xpath="//*[@id='menu_training_defaultTrainingModulePage']/b")
	WebElement Training;
	public void Training()
	{
		Training.click();
	}
	
	@FindBy(xpath="//*[@id='menu_performance_viewMyAppraisals']/b")
	WebElement Performance;
	public void Performance()
	{
		Performance.click();
	}
	
	@FindBy(xpath="//*[@id='menu_performance_viewMyAppraisals']/b")
	WebElement Onboarding;
	public void Onboarding()
	{
		Onboarding.click();
	}
	
	@FindBy(xpath="//*[@id='menu_dashboard_index']/b")
	WebElement More;
	public void More()
	{
		More.click();
	}
	@FindBy(id="welcome")
	WebElement welcomeAdmin;
	@FindBy(linkText="Change Password")
	WebElement changePassword;
	@FindBy(linkText="Logout")
	WebElement logout;
	public void logouttest()
	{
		Sleeper.sleepTightInSeconds(5);
		welcomeAdmin.click();
		Sleeper.sleepTightInSeconds(3);
		logout.click();
	}
	

}
