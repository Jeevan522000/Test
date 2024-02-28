package com.selenium.first;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://demo.actitime.com/login.do");
	       Rectangle element = driver.findElement(By.id("username")).getRect();
	       System.out.println("Width = "+element.getWidth());
	       System.out.println("height = "+element.getHeight());
	       System.out.println("StartX = "+element.getX());
	        System.out.println("StartY = "+element.getY());
	        
	        Rectangle element1 = driver.findElement(By.name("pwd")).getRect();
		       System.out.println("Width = "+element1.getWidth());
		       System.out.println("height = "+element1.getHeight());
		       System.out.println("StartX = "+element1.getX());
		        System.out.println("StartY = "+element1.getY());
	}

}
