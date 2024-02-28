package com.selenium.first;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocationWebElement 
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://demo.actitime.com/login.do");
	       Point element = driver.findElement(By.id("username")).getLocation();
	        System.out.println("StartX = "+element.getX());
	        System.out.println("StartY = "+element.getY());

	}

}