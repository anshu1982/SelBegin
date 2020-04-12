package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	ChromeDriver driver;
	Properties pr;
	
	public LoginPage(ChromeDriver driver,Properties pr)
	{
		this.driver = driver;
		this.pr = pr;}
		
		public void signin(String Username,String Pasword) throws InterruptedException
		{
		Thread.sleep(2000);
		WebElement Signin = driver.findElement(By.xpath	(pr.getProperty("Signin")));
		Signin.click();
		WebElement Email = driver.findElement(By.id(pr.getProperty("Email")));
		Email.sendKeys("FatherDad52@gmail.com");
		WebElement Next = driver.findElement(By.xpath(pr.getProperty("Next")));
		Next.click();
		Thread.sleep(3000);
		WebElement Password = driver.findElement(By.name(pr.getProperty("Password")));
		Password.sendKeys("#FatherDad52@");
		WebElement Next1 = driver.findElement(By.xpath(pr.getProperty("Next1")));
		Next1.click();
		Thread.sleep(3000);
	
	}
	

}




