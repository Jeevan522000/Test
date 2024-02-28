package com.selenium.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class meditabPractice 
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://iemodemoindia.meditab.com/");
       driver.findElement(By.xpath("(//input[@autocomplete=\"new-password\"])[1]")).sendKeys("xyz");
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//input[@autocomplete=\"new-password\"])[2]")).sendKeys("xyz");
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//input[@autocomplete=\"new-password\"])[3]")).sendKeys("xyz");
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//div[@class=\"ui-chkbox-box ui-widget ui-corner-all ui-state-default\"])[1]")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//button[@class=\"ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only\"])[1]")).click();
       Thread.sleep(2000);
       WebElement element = driver.findElement(By.xpath(" //span[@class='mtab-login-error-message'] "));
       Thread.sleep(2000);
       if(element.isDisplayed())
       {
    	   System.out.println("True : Invalid username and password is shown in login page");
       }
       else
       {
    	   System.out.println("False : Invalid username and password is not shown in login page");
       }
	}

}
