package com.selenium.first;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElement 
{
   public static void main(String[] args) throws InterruptedException 
   {
	   ChromeDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
//	   driver.get("https://demo.actitime.com/login.do");
	   
//	 1. passing a value
	   
//	     driver.findElement(By.id("username")).sendKeys("pune");
//	     driver.findElement(By.name("pwd")).sendKeys("PUNE");
//	     driver.quit();
	   
//	 2.pass - clear - pass
	   
//	   WebElement element = driver.findElement(By.id("username"));
//	   element.sendKeys("Pune");
//	   Thread.sleep(2000);
//	   element.clear();
//	   Thread.sleep(2000);
//	   element.sendKeys("Satara"); 
//	   driver.quit();
	   
//	   3.
	   driver.get("https://www.selenium.dev/");
	   driver.findElement(By.className("close")).click();
	   
   }
}
