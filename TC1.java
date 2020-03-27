package org.testing.TestScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testing.Base.BaseClass;
//import org.testing.Pages.LogOutPage;
//import org.testing.Pages.LoginPage;
//import org.testing.Pages.VideoPlay;
import org.testng.annotations.Test;



public class TC1 extends BaseClass 
{	
   @Test
	public void Trending() throws InterruptedException 
	{
	   Thread.sleep(3000);
	  // LoginPage login = new LoginPage(driver,pr);
	   // login.signin("dramatest18@gmail.com","Dramatest@2012");
	    //Thread.sleep(1000);
	  
		System.out.println( "Enter the data" + driver.findElement(By.xpath(pr.getProperty("Trending"))));
		
		
		
		
		WebElement Trending = driver.findElement(By.xpath(pr.getProperty("Trending")));
		Trending.click();
		Thread.sleep(1000);
		//LogOutPage logout = new LogOutPage(driver,pr);
		//logout.logedout();
		
	
		
		
	}

}
