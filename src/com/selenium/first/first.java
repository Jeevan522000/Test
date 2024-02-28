package com.selenium.first;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class first 
{

	public static void main(String[] args) 
	{
	// System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
      ChromeDriver driver = new ChromeDriver();
      driver.get("http://www.facebook.com/");
      String expectedTitle="Facebook – log in or sign up";
      String actualTitle = driver.getTitle();
      if(actualTitle.equals(expectedTitle))
      {
    	  System.out.println("Title Match");
      }
      else
      {
    	  System.out.println("Title Mismatch");
      }
      System.out.println("---------------------------------------------");
      
      String expectedURL="https://www.facebook.com/";
      String actualURL=driver.getCurrentUrl();
      if(actualURL.equals(expectedURL))
      {
    	  System.out.println("URL matched");
      }
      else
      {
    	  System.out.println("URL mismatched");
      }
      
      System.out.println("---------------------------------------------------");
      String expectedPageSource="Facebook helps you connect and share with the people in your life.";
      String actualPageSource=driver.getPageSource();
      if(actualPageSource.equals(expectedPageSource))
      {
    	  System.out.println("true");
      }
      else
      {
    	  System.out.println("False");
      }
      
      System.out.println("---------------------------------------------------");
      String expectedPageSource1="Facebook helps you connect and share with the people in your life.";
      String actualPageSource1=driver.getPageSource();
      if(actualPageSource1.contains(expectedPageSource1))
      {
    	  System.out.println("true");
      }
      else
      {
    	  System.out.println("False");
      }
      
      System.out.println("-----------------------------------------------------");
      driver.findElement(By.id("facebook")).click();
      driver.quit();
	}

}
