package com.selenium.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class click 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www,google.com/doodles");
		WebElement ele = driver.findElement(By.linkText("Valentine's Day 2023"));
		Actions a = new Actions(driver);
		a.click(ele).perform();
	}
}
