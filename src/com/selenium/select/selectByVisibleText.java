package com.selenium.select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectByVisibleText 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		    WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.facebook.com/signup");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("(//input[@class=\'inputtext _58mg _5dba _2ph-\'])[1]")).sendKeys("Jeevan");
	        Thread.sleep(2000);
//          driver.findElement(By.id("(//input[@class=\"inputtext _58mg _5dba _2ph-\"])[2]")).sendKeys("Bandal");
//	        Thread.sleep(2000);
//	        driver.findElement(By.id("(//input[@class=\"inputtext _58mg _5dba _2ph-\"])[3]")).sendKeys("bandaljeevan83@gmail.com");
//	        Thread.sleep(2000);
//	        driver.findElement(By.id("(//input[@class=\"inputtext _58mg _5dba _2ph-\"])[5]")).sendKeys("Jeevan@777");
//	        Thread.sleep(2000);
	        WebElement allday = driver.findElement(By.id("day"));
	        Thread.sleep(2000);
	        WebElement allmonth = driver.findElement(By.id("month"));
	        Thread.sleep(2000);
	        WebElement allyear = driver.findElement(By.id("year"));
	        Thread.sleep(2000);
	        Select s =new Select(allday);
	        s.selectByVisibleText("5");
	        Thread.sleep(2000);
	        Select s1 =new Select(allmonth);
	        s1.selectByVisibleText("Feb");
	        Thread.sleep(2000);
	        Select s3 =new Select(allyear);
	        s3.selectByVisibleText("2000");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("(//label[@class=\"_58mt\"])[2]")).click();
	}

}
