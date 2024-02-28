package com.selenium.first;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class takeScreenShotAs 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		String timestamp = ldt.toString().replace(':', '-');
		System.out.println(timestamp);
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
//      driver.get("https://demo.actitime.com/login.do");
//	  driver.get("https://www.flipkart.com/");
      driver.get("https://www.myntra.com/");
	  TakesScreenshot ts = (TakesScreenshot) driver;
	  File tempfile = ts.getScreenshotAs(OutputType.FILE);
//	  System.out.println(tempfile.getAbsolutePath());
//	  Thread.sleep(90000);
	  File destFile = new File("./error/Myntra "+timestamp+".png");
//	  tempfile.renameTo(destFile);
	  FileUtils.copyFile(tempfile, destFile);
	  
	}
}
