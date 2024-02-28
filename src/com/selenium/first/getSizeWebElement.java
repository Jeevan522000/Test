package com.selenium.first;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSizeWebElement {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://demo.actitime.com/login.do");
	        Dimension element = driver.findElement(By.id("username")).getSize();
	       System.out.println("Width = "+element.getWidth());
	       System.out.println("height = "+element.getHeight());

	}

}
