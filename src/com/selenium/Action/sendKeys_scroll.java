package com.selenium.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sendKeys_scroll 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		Actions a = new Actions(driver);
    	a.sendKeys(Keys.PAGE_DOWN);
    	Thread.sleep(2000); 
    	a.sendKeys(Keys.PAGE_UP);
    	a.perform();

	}

}
