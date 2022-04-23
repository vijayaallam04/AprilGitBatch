package com.tm.lib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class WebLibrary {
	
	public static WebDriver driver;
	 
	public static boolean launchBrowser(String browser)
	{
		boolean retval = true;
		try{
			switch(browser.toUpperCase())
			{
			case "FF" :    
				 driver = new FirefoxDriver();
				break;
				
			case "CHROME" :
				//
				driver = new ChromeDriver();
				break;
				
			case "IE" :
				//
				driver = new InternetExplorerDriver();
				break;
			}			
					
		}
		
		catch(Exception e)
		{
			retval = false;
		}
		
		return retval;
	}
	
	//=========================================================
	public static boolean setText(String xpath, String value)
	{
		boolean retval = true;
		try{
			driver.findElement(By.id(xpath)).sendKeys(value);
		} 
		
		catch(Exception e)
		{
			retval = false;
		}
		
		return retval;
	}
	
	//=========================================================
	public static boolean clickElement(String xpath)
	{
		boolean retval = true;
		try{
			driver.findElement(By.xpath(xpath)).click();
		}
		
		
		catch(Exception e)
		{
			retval = false;
		}
		
		return retval;
	}
	
	//=========================================================
	
	public static boolean mouseHoverToElement(String xpath){
		boolean retval=true;
		try{
			Actions act_obj=new Actions(driver);
			WebElement ele=driver.findElement(By.xpath(xpath));
			act_obj.moveToElement(ele).build().perform();
	
		}
		catch(Exception e)
		{
			retval=false;
		}
		return retval;
	}

	//=======================================================================
	public static boolean verifyText(String xpath)
	{
		boolean retval=true;
		try{
			driver.findElement((By.xpath(xpath)));
		}
		catch(Exception e){
			retval =false;
		}
		return retval;
	}
	
	//========================================================================
	
	public static boolean selectElement(String xpath,String value){
		boolean retval=true;
		try{
			
			Select obj=new Select(driver.findElement(By.xpath(xpath)));
			obj.selectByVisibleText(value);
		}
		
		catch(Exception e){
			retval=false;
		}
		return retval;
		
	}
	
	public static boolean date(String xpath,String value){
		boolean retval=false;
		try{
			
			driver.findElement(By.xpath(xpath)).clear();
			driver.findElement(By.xpath(xpath)).click();
			driver.findElement(By.xpath(xpath)).sendKeys(value);
			driver.findElement(By.xpath(xpath)).sendKeys(Keys.ESCAPE);
		}
		catch(Exception e){
			retval=false;
		}
		return retval;
		
}
}