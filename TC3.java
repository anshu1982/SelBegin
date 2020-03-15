package org.testing.TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC3 {
	
	ChromeDriver driver;
    @BeforeMethod
    public void browserLaunch() throws InterruptedException
    {
	ChromeOptions options= new ChromeOptions();   
	options.addArguments("--disable-notifications");	
	System.setProperty("webdriver.chrome.driver","C://Users//Phonato -Shuchi//Desktop//chromedriver.exe");
	driver = new ChromeDriver(options);
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	}
    
    @Test
  	public void loginPlayLike() throws InterruptedException
  	{	
  	WebElement Signin = driver.findElement(By.xpath("//ytd-button-renderer[@class='style-scope ytd-masthead style-suggestive size-small']"));
  	Signin.click();
  	WebElement Email = driver.findElement(By.xpath("//div[@class='Xb9hP'] //input[@id='identifierId' and @type='email']"));
  	Email.sendKeys("dramatest18@gmail.com");
  	Thread.sleep(1000);
  	WebElement Next = driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
  	Next.click();
  	Thread.sleep(3000);
  	WebElement Password = driver.findElement(By.xpath("//div[@class='Xb9hP']//input[@class='whsOnd zHQkBf'or @name='password']"));        
  	Password.sendKeys("Dramatest@2012");
  	Thread.sleep(3000);
  	WebElement Next1 = driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
  	Next1.click();
  	Thread.sleep(3000);
  	List <WebElement> as = driver.findElements (By.id("video-title"));
    as.get(1).click();
    Thread.sleep(3000);
    WebElement Like = driver.findElement(By.xpath("//yt-icon[@class='style-scope ytd-toggle-button-renderer']"));
    Like.click();
    }
    
    @AfterMethod
   	public void logoutClose() throws InterruptedException
   	{
    WebElement image = driver.findElement(By.xpath("//img[@id='img']"));
    image.click();
    Thread.sleep(1000);
   	WebElement Signout = driver.findElement(By.xpath("//a[@href='/logout']"));
   	Signout.click();
   	driver.close();}
}
