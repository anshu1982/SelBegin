package org.testing.TestScripts;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testing.Base.BaseClass;
import org.testing.Pages.LogOutPage;
import org.testing.Pages.LoginPage;
import org.testing.Utilities.Logs;
import org.testing.Utilities.ScreenShotCapture;
import org.testng.annotations.Test;

public class TC1 extends BaseClass 

	{	
		   @Test
			public void Trendings() throws InterruptedException, IOException 
			{
			   Thread.sleep(1000);
			  LoginPage login = new LoginPage(driver,pr);
			   login.signin("testerselinium@gmail.com","Tester@selinium");
			    Thread.sleep(3000);
			   
			  Logs.takeLog("TC1","Login Successfully");
				WebElement Trending = driver.findElement(By.xpath(pr.getProperty("Trending")));
				Trending.click();
				Thread.sleep(3000);
				
				//code to take  Logs and screenshot after we click Trending link
			
			  
				ScreenShotCapture.TakeScreenShot(driver, "C:\\Users\\Phonato -Shuchi\\Desktop\\trending.jpg");
				
				Logs.takeLog("TC1","TC1 pass successfully");
				Thread.sleep(3000);
				LogOutPage logout = new LogOutPage(driver,pr);
				logout.logedout();
				//Thread.sleep(3000);
				
			
				
				
			}

		}

