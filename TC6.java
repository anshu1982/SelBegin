package org.testing.TestScripts;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.BaseClass;
import org.testing.Pages.LogOutPage;
import org.testing.Pages.LoginPage;
import org.testng.annotations.Test;
import org.testing.Pages.VideoPlay;

public class TC6 extends BaseClass {
	
 @Test
	public void Library() throws InterruptedException
	{
		Thread.sleep(3000);
		LoginPage login = new LoginPage(driver,pr);
		login.signin("dramatest18@gmail.com","Dramatest@2012");
		Thread.sleep(3000);
		WebElement Library = driver.findElement(By.id(pr.getProperty("Library")));
		Library.click();
       Thread.sleep(3000);
       LogOutPage logout = new LogOutPage(driver,pr);
		logout.logedout();}
}
