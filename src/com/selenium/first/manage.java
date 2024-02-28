package com.selenium.first;

import org.openqa.selenium.chrome.ChromeDriver;

public class manage 
{
  public static void main(String[] args) throws InterruptedException 
  {
	ChromeDriver driver = new ChromeDriver(); 
	driver.get("https://demoqa.com./browser-windows");
	driver.manage().window().fullscreen();
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.manage().window().minimize();
	Thread.sleep(2000);
  }
}
