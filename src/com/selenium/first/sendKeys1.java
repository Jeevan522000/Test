package com.selenium.first;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendKeys1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.actitime.com/login.do");
	    WebElement ele= driver.findElement(By.id("username"));
	    ele.sendKeys("Pune");
	    Thread.sleep(2000);
	    ele.sendKeys(Keys.CONTROL+"A");
	    Thread.sleep(2000);
	    ele.sendKeys(Keys.CONTROL+"C");
	    Thread.sleep(2000);
	    driver.findElement(By.name("pwd")).sendKeys(Keys.CONTROL+"V");
	}

}
