package com.selenium.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class submit
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.vtiger.com/vtigercrm/");
	    driver.findElement(By.xpath("//button[text()='Sign in]")).submit();
	    
	}

}
