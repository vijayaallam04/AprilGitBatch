package com.tm.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GmailWebLibrary {
	public static WebDriver driver;
	//==============================================================
	public static boolean launchBrowser(String browser){
		boolean retval=true;
		try{
			switch(browser.toUpperCase()){
			case "FF":
				driver=new FirefoxDriver();
				break;
			case "chrome":
				driver=new FirefoxDriver();
				break;
			case "IE":
				driver=new InternetExplorerDriver();
				break;

		}
		}
			catch(Exception e)
			{
				retval=false;
			}
			return retval;
	}
	//===============================================================
	
	public static boolean setText(String xpath,String value){
		boolean retval=true;
		try{
			driver.findElement(By.xpath(xpath)).sendKeys(value);
		}
		catch(Exception e){
			retval=false;
			
		}
		return retval;
		
	}
	//================================================================
	public static boolean clickElement(String xpath){
		boolean retval=true;
		try{
			driver.findElement(By.xpath(xpath)).click();
		}
		catch(Exception e){
			retval=false;
		}
		return retval;
	}
	
	//================================================================
    public static boolean verifyText(String xpath){
    	boolean retval=true;
    	try{
    		driver.findElement(By.xpath(xpath));
    	}
    	catch(Exception e){
    		retval=false;
    	}
    	return retval;
    }
}
