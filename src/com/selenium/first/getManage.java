package com.selenium.first;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class getManage 
{
		public static void main(String[] args) throws InterruptedException 
		  {
			ChromeDriver driver = new ChromeDriver(); 
			driver.get("https://demoqa.com./browser-windows");
			
		    Dimension size = driver.manage().window().getSize();
		    System.out.println("size = "+size);
		    System.out.println("Height = "+size.getHeight());
		    System.out.println("Width = "+size.getWidth());
		    Point position = driver.manage().window().getPosition();
		    System.out.println(position);
		    System.out.println("StartX = "+position.getX());
		    System.out.println("StartY = "+position.getY());
		  }// TODO Auto-generated method stub

	

}
