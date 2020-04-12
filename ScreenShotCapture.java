package org.testing.Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotCapture {

	public static void TakeScreenShot(ChromeDriver driver,String location) throws InterruptedException, IOException
	{
		File f =driver.getScreenshotAs(OutputType.FILE);
		//OutputType is Interface  and FILE is field called by interfaceNme.field
		FileUtils.copyFile(f, new File (location));
		Thread.sleep(2000);
		
	}

}
