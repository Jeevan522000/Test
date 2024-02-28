package com.selenium.select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectByValue 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/signup");
//        WebElement allmonth = driver.findElement(By.id("month"));
//        Select s =new Select(allmonth);
//        List<WebElement> alloptions = s.getOptions();
//        for (WebElement ele : alloptions) 
//        {
//			s.selectByValue(ele.getAttribute("value"));
//		}
        WebElement allday = driver.findElement(By.id("day"));
        Thread.sleep(1000);
        WebElement allmonth = driver.findElement(By.id("month"));
        Thread.sleep(1000);
        WebElement allyear = driver.findElement(By.id("year"));
        Thread.sleep(1000);
        Select s =new Select(allday);
        s.selectByValue("5");
        Thread.sleep(1000);
        Select s1 =new Select(allmonth);
        s1.selectByValue("2");
        Thread.sleep(1000);
        Select s3 =new Select(allyear);
        s3.selectByVisibleText("2000");
	} 

}
