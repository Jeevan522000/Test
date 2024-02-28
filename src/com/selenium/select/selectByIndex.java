package com.selenium.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectByIndex 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/signup");
        WebElement allmonth = driver.findElement(By.id("month"));
        Select s =new Select(allmonth);
        List<WebElement> alloption = s.getOptions();
        for (int i = 0; i < alloption.size(); i++) 
        {
        	System.out.println(i);
        	s.selectByIndex(i);	
//        	s.selectByIndex(s.getOptions().size()-3);    select value according to index - here 3rd last
		}
	}

}
