package com.selenium.first;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class setManage
{
	public static void main(String[] args) throws InterruptedException 
	  {
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://demoqa.com./browser-windows");
		Dimension dim = new Dimension(500,700);
		driver.manage().window().setSize(dim);
		
		Point p = new Point(20,30);
		driver.manage().window().setPosition(p);
	  }
}
