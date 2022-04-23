package com.tm.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;

import com.tm.lib.WebLibrary;

public class UserLibrary extends WebLibrary{
	
	public static void launchApp()
	{
		boolean status;
		status = launchBrowser("ff");		
		if(status)
			System.out.println("Browser launched");
		else
			System.out.println("Browser not launched");
		
		driver.get("http://testingmasters.com/hrm/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	//=================================================
	public static void HRMLogin(String uid, String pwd)
	{
		boolean status;
		status = setText("txtUsername", uid);
		if(status)
			System.out.println("User id entered");
		else
			System.out.println("User id not entered");
		
		status = setText("txtPassword", pwd);
		if(status)
			System.out.println("Password entered");
		else
			System.out.println("Password not entered");
		
		status = clickElement("//input[@id='btnLogin']");
		if(status)
			System.out.println("Login button clicked");
		else
			System.out.println("Login button not clicked");
	}
		
		//navigate to apply leave
		
	public static void navToApplyLeave(){
		boolean status;
		status= mouseHoverToElement("//a[@id='menu_leave_viewLeaveModule']");
		if(status)
		
			System.out.println("MouseHover to Leave Menu is successful");
		
		else
			System.out.println("MouseHover to Leave Menu is not successful");
		
		status=clickElement("//a[@id='menu_leave_applyLeave']");
		if(status)
			
			System.out.println("Apply Link Clicked");
		
		else
			System.out.println("Apply link not clicked");
		
		status=verifyText("//h1[text()='Apply Leave']");
		
if(status)
			
			System.out.println("Apply Leave Page Displayed");
		
		else
			System.out.println("Apply Leave Page not Displayed");
			
		
	}
	
	//=====================================================
	
	public static void applyLeave(String leavetype,String fromdate,String todate,String comment){
		boolean status;
		status=selectElement("//select[@id='applyleave_txtLeaveType']",leavetype);
		if(status)
		System.out.println("Annula Leave Selected");
		else
			System.out.println("Annula Leave not Selected");
		status=date("//input[@id='applyleave_txtFromDate']",fromdate);
		if(status)
			System.out.println("fromdate filled");
			else
				System.out.println("from date not filled");
		status=date("//applyleave_txtToDate']",todate);
		if(status)
			System.out.println("todate filled");
			else
				System.out.println("to date not filled");
		status=clickElement("//input[@id='applyBtn']");
		if(status)
			System.out.println("Apply button clicked");
			else
				System.out.println("apply button not clicked");
		
	}
	
	public static void Logout()
	{
		driver.quit();
	}
	
	//=====================================================

}

