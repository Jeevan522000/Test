package com.selenium.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorPartialLinktext 
{
	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demo.actitime.com/login.do");
		 driver.findElement(By.partialLinkText("Forgot your")).click();
	}
}
