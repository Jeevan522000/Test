package com.selenium.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class c$h_Release 
{
    public static void main(String[] args) throws InterruptedException 
    {
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
    	Thread.sleep(2000);
    	WebElement ele = driver.findElement(By.xpath("//h1[text()='Block 2']"));
    	WebElement ele1 = driver.findElement(By.id("column-2"));
    	Actions a = new Actions(driver);
    	a.clickAndHold(ele).moveToElement(ele1).release();
    	a.perform();
	}
}
