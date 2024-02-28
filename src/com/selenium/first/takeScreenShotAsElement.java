package com.selenium.first;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class takeScreenShotAsElement 
{

	public static void main(String[] args) throws IOException 
	{
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		String timestamp = ldt.toString().replace(':', '-');
		System.out.println(timestamp);
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
//      driver.get("https://demo.actitime.com/login.do");
//	driver.get("https://www.flipkart.com/");
      driver.get("https://www.amazon.in/");
      WebElement st = driver.findElement(By.id("nav-logo-sprites"));
	  File tempfile = st.getScreenshotAs(OutputType.FILE);
//	  System.out.println(tempfile.getAbsolutePath());
//	  Thread.sleep(90000);
	  File destFile = new File("./errorShot/Amazon "+timestamp+".png");
//	  tempfile.renameTo(destFile);
	  FileUtils.copyFile(tempfile, destFile);
	}

}
