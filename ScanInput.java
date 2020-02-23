package Pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;

public class ScanInput {
	
	public static void main (String[]args)
	{
		System.out.println("Enter FirstName of User");
		Scanner sc= new Scanner(System.in);
		String Username = sc.next();
		System.setProperty("webdriver.chrome.driver","C://Users//Phonato -Shuchi//Desktop//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	    WebElement Firstname= driver.findElement(By.name("firstname"));
		Firstname.sendKeys(Username);
		 
	 
		
		
	
	
	
	}
	
	
	

}
