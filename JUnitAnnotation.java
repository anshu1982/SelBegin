package pac1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JUnitAnnotation {
	ChromeDriver driver;
	@Before
	public void before()
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//Phonato -Shuchi//Desktop//chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void test()
	{
	WebElement Firstname = driver.findElement(By.cssSelector("input#u_0_m"));
	Firstname.sendKeys("Selinium");
	WebElement Surname =driver.findElement(By.cssSelector("input[name=lastname]"));
	Surname.sendKeys("Course");
	WebElement MobileNumber = driver.findElement(By.name("reg_email__"));
    MobileNumber.sendKeys("9876651221");
    WebElement Password = driver.findElement(By.name("reg_passwd__"));
    Password.sendKeys("Aryen@123");
    WebElement Day = driver.findElement(By.name("birthday_day"));
    Select sel = new Select(Day);
    sel.selectByIndex(4);
    WebElement Month = driver.findElement(By.name("birthday_month"));
    Select sel1 = new Select(Month);
    sel1.selectByVisibleText("Oct");
    WebElement Year = driver.findElement(By.name("birthday_year"));
    Select sel2 = new Select(Year);
    sel2.selectByValue("1990");
    WebElement Gender = driver.findElement(By.cssSelector("input#u_0_7"));
    Gender.click();
    WebElement SignUp = driver.findElement(By.name("websubmit"));
    SignUp.click();
	}

		@After
		public void after()
			{
			 	driver.close();
			}
		}

