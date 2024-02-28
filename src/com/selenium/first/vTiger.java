package com.selenium.first;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vTiger {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://demo.vtiger.com/vtigercrm/");
       WebElement element =driver.findElement(By.id("username"));
       element.clear();
       Thread.sleep(1000);
       element.sendKeys("Jeevan");  
       Thread.sleep(3000);
       WebElement element1=driver.findElement(By.id("password"));
       element1.clear();
       Thread.sleep(1000);
       element1.sendKeys("Jeevan@123");
       Thread.sleep(3000);
       driver.findElement(By.xpath("//button[text()='Sign in']")).sendKeys(Keys.ENTER);
	}

}
