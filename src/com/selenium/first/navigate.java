package com.selenium.first;

import org.openqa.selenium.chrome.ChromeDriver;

public class navigate 
{
	public static void main(String[] args) throws InterruptedException 
	{
	// System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
      ChromeDriver driver = new ChromeDriver();
      driver.get("http://demo.actitime.com/login.do");
      Thread.sleep(2000);
      driver.get("http://www.flipkart.com/");
      driver.navigate().back();
      Thread.sleep(2000);
      driver.navigate().forward();
      Thread.sleep(2000);
      driver.navigate().refresh();
	}
}
