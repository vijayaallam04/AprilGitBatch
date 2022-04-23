package com.tm.testcases;

import java.io.IOException;

import com.tm.lib.Excel;

public class Leave extends UserLibrary{	
		
	//============================================
	public static void TC01_ApplyLeave() throws IOException
	{
		
		boolean status;
		String data = Excel.ReadRowData("TC01_ApplyLeave");
		String[] arr = data.split("&&&");
		
		//Step 1: Launch Application
		launchApp();
		
		//Step 2: Login as a team member
		HRMLogin("arr[1]", "arr[2]");
		
		
		//Step 3: Navigate to ApplyLeave page
		 
		navToApplyLeave();
		
				
		//Step 4: Enter leave details then click save button
		  
		applyLeave("arr[3]","arr[4]","arr[5]","arr[6]");
		
		
		
		//Step 5: close application
		//Logout();		
	}	
	
	//============================================	
	public static void TC02_CancelLeave()
	{
		boolean status;
		//Step 1: Launch Application
		launchApp();
				
		//Step 2: Login as a team member
		HRMLogin("user02", "TM1234");
		
		//Step 3: Navigate to MyLeave page
		
		
		//Step 4: Search for leave date with Pending status then Cancel it
		
		
		//Step 5: close application
		Logout();
	}	
	//============================================
	
	//============================================	
		public static void TC03_ApproveLeave()
		{
			boolean status;
			//Step 1: Launch Application
			launchApp();
					
			//Step 2: Login as a team member
			HRMLogin("user05", "TM1234");
			
			//Step 3: Navigate to MyLeave page
			
			
			//Step 4: Search for leave date with Pending status then Cancel it
			
			
			//Step 5: close application
			Logout();
		}	
		//============================================

}
