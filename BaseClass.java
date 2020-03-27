package org.testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public ChromeDriver driver;
	public Properties pr;
	
	@BeforeMethod
	public void BrowserLaunch() throws InterruptedException, IOException
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		    System.setProperty("webdriver.chrome.driver","C://Users//Phonato -Shuchi//Desktop//chromedriver.exe");
		    driver = new ChromeDriver();
		    pr= new Properties();
			driver.get("https://www.youtube.com/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			File f = new File("C:\\Users\\Phonato -Shuchi\\workspace\\YTFPOMFrameWork\\ObjRepo.properties");
			FileInputStream fi = new FileInputStream(f);
			pr.load(fi);
			Thread.sleep(3000);
			
		}
			
			@AfterMethod
			public void BrowserClose() throws InterruptedException
			{
			Thread.sleep(2000);
			driver.close();
			
			}

}
