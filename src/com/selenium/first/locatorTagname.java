package com.selenium.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorTagname {

	public static void main(String[] args) 
	{
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.actitime.com/login.do");
	 driver.findElement(By.tagName("a")).click();
	}

}
