package com.selenium.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCssValue {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.actitime.com/login.do");
	    String ele = driver.findElement(By.id("loginButton")).getCssValue("background");
	    System.out.println(ele);
	}

}
