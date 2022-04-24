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
	
	public void PersonOneCode()
	{
		System.out.println("Added by Person1");
	}

               public void Hello1()
              {
                   System.out.println("JAVA,Selenium"+ "Updated by person2.............");

               }
<<<<<<< HEAD

                public void Hello4()
              {
                   System.out.println("JAVA,Selenium"+ "Updated by person2.............");

               }
}
=======
               
               public void Hello2()
               {
                    System.out.println("JAVA,Selenium"+ "Updated by person1.............");

                }
               
               public void Hello3()
               {
                    System.out.println("JAVA,Selenium"+ "Updated by person1.............");

                }
                
               
               
               
               
}          
              

>>>>>>> 4abf29da2b777941538a742cdef7dd982c6807cc
