package com.selenium.first;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class nav 
{
	public static void main(String[] args) throws InterruptedException 
	{
	// System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
      ChromeDriver driver = new ChromeDriver();
      driver.get("http://demo.actitime.com/login.do");
      Thread.sleep(2000);
      driver.get("http://www.flipkart.com/");
      Navigation nav = driver.navigate();
      nav.back();
      Thread.sleep(2000);
      nav.forward();
      Thread.sleep(2000);
      nav.refresh();
	}
}
