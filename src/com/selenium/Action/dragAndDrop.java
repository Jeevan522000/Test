package com.selenium.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop 
{
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//h1[text()='Block 2']"));
		WebElement ele1 = driver.findElement(By.id("column-3"));
		Actions a = new Actions(driver);
		a.dragAndDrop(ele, ele1);
		a.perform();
	}
}


