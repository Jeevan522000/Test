package com.selenium.suggetions1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.flipkart.com/");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//button[text()='✕']")).click();
	     List<WebElement> ele = driver.findElements(By.tagName("a"));
	     for(WebElement all:ele)
	     {
	    	 System.out.println(all.getText());
	     }
	     

	}

}
