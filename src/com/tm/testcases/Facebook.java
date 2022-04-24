package com.tm.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("gundabathulavlakshmi90@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("hanvesh11");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                }

               public void Hello1()
              {
                   System.out.println("JAVA,Selenium"+ "Updated by person2.............");

               }
}
