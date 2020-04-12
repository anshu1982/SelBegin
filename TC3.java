package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Assertion.Assert;
import org.testing.Base.BaseClass;
import org.testing.Pages.LogOutPage;
import org.testing.Pages.LoginPage;
import org.testing.Pages.VideoPlay;

import org.testng.annotations.Test;

public class TC3  extends BaseClass{
	
	@Test
	public void Like() throws InterruptedException
	{
		
		 String expectedUrl ="https://www.youtube.com/";
		   Thread.sleep(3000);
		   Assert.Assert_Url(expectedUrl,driver.getCurrentUrl());
		   Thread.sleep(3000);
		 LoginPage login = new LoginPage(driver,pr);
		login.signin("FatherDad52@gmail.com","#FatherDad52@");
		Thread.sleep(3000);
		VideoPlay  vd = new VideoPlay(driver,pr);
		vd.video();
		Thread.sleep(3000);
	    WebElement Like = driver.findElement(By.xpath(pr.getProperty("Like")));
	    Like.click();
	    Thread.sleep(3000);
	    LogOutPage logout = new LogOutPage(driver,pr);
		logout.logedout();
		//Thread.sleep(3000);
		
		
		
		
		
	}

}




