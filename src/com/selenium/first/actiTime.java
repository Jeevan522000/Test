package com.selenium.first;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTime
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://demo.actitime.com/login.do");
       WebElement element =driver.findElement(By.id("username"));
       System.out.println(element);
       Thread.sleep(1000);
       element.sendKeys("admin");  
       Thread.sleep(3000);
       WebElement element1=driver.findElement(By.name("pwd"));
       Thread.sleep(1000);
       element1.sendKeys("manager");
       Thread.sleep(3000);
       driver.findElement(By.id("loginButton")).sendKeys(Keys.ENTER);
	}

}
