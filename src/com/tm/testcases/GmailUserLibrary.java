package com.tm.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.tm.lib.GmailWebLibrary;

public class GmailUserLibrary extends GmailWebLibrary {
	//=============================================================================
	public static void launchApp(){
		boolean status;
		status=launchBrowser("ff");
			if(status)
			System.out.println("Launch Browser Successfully");
		else
			
			System.out.println("Launch Browser not Successfully");
			driver.get("https://accounts.google.com/login/identifier?flowName=GlifWebSignIn&flowEntry=AddSession");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		}
	//===============================================================================
	public static void loginGmail(String uid ,String pwd){
		boolean status;
		status=setText("//input[@id='identifierId']",uid);
		if(status)
			System.out.println("userid entered Successfully");
		else
			
			System.out.println(" userid not entered");
		status=clickElement("//span[text()='Next']");
		if(status)
			System.out.println("Next Button clicked");
		else
			
			System.out.println(" next button not clicked");
		
		status=setText("//input[@name='password']",pwd);
		if(status)
			System.out.println("password entered Successfully");
		else
			
			System.out.println(" password not entered");
		status=clickElement("//span[text()='Next']");
		if(status)
			System.out.println("Next Button clicked");
		else
			
			System.out.println(" next button not clicked");
		status=verifyText("//div[text()='Home']");
		if(status)
			System.out.println("Login successfull");
		else
			
			System.out.println(" Login not successful");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		status=clickElement("//a[@className='gb_x']");
		if(status)
			System.out.println("naviagte to emails");
		else
			
			System.out.println(" navigae to emails not successful");
		
	}
	
	
	
	
	//===============================================================================
	public static void Logout(){
		driver.quit();
	}
	//================================================================================
	}


