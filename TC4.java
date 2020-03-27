package org.testing.TestScripts;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.BaseClass;
import org.testing.Pages.LogOutPage;
import org.testing.Pages.LoginPage;
import org.testing.Pages.VideoPlay;
import org.testng.annotations.Test;

public class TC4 extends BaseClass {
	
	public ChromeDriver driver;
	public Properties pr;
	@Test

    public void  Subscribe() throws InterruptedException
    {
		 Thread.sleep(3000);
		LoginPage login = new LoginPage(driver,pr);
		login.signin("dramatest18@gmail.com","Dramatest@2012");
		Thread.sleep(1000);
		VideoPlay  vd = new VideoPlay(driver,pr);
		vd.video();
		    WebElement Subscribe = driver.findElement(By.xpath(pr.getProperty("Subscribe")));
		    Subscribe.click();
		    LogOutPage logout = new LogOutPage(driver,pr);
			logout.logedout();
		    Thread.sleep(2000);}
			
}
