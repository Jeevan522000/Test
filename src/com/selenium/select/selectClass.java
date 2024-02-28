package com.selenium.select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectClass 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/signup");
        WebElement allmonth = driver.findElement(By.id("month"));
        Select s =new Select(allmonth);
        if(s.isMultiple())
        {
        	System.out.println("True : it is a Multi List");
        }
        else
        {
        	System.out.println("False : it is a Single List");
        }
	}

}
