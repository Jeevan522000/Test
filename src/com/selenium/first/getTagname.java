package com.selenium.first;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTagname 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
	    driver.get("http://demo.actitime.com/login.do");
	    String ele = driver.findElement(By.xpath("//*[text()='actiTIME 2020 Online")).getTagName();  //write * instead of tagname
	    System.out.println(ele);
	}

}
