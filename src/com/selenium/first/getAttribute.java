package com.selenium.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.actitime.com/login.do");
//	    String ele= driver.findElement(By.id("username")).getAttribute("value");
//	    System.out.println(ele);
//	    if(ele.isEmpty())
//	    {
//	    	System.out.println("True");
//	    }
//	    else
//	    {
//	    	System.out.println("False");
//	    }
	    
	    String ele= driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("title");
	    String ActualElement="Do not select if this computer is shared";
	    if(ele.equals(ActualElement))
	    {
	    	System.out.println("True");
	    }
	    else
		    {
		    	System.out.println("False");
		    }
	}

}
