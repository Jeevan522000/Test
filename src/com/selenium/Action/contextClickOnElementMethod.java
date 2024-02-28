package com.selenium.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextClickOnElementMethod
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//a[@class='M6CB1c yZqNl']"));
		Actions a = new Actions(driver);
		a.contextClick(ele);
		a.perform();
	}

}
