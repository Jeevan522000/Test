package com.selenium.first;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//works fine for : input and button tag
	    //Enabled : true
        //not enabled : false		
		
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
//	    driver.get("https://demo.actitime.com/login.do");
//	    Boolean ele= driver.findElement(By.id("username")).isEnabled();
//	    System.out.println(ele);
	    
	    driver.get("https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html");
	    driver.findElement(By.xpath("//a[text()=' jdk-8u202-linux-arm32-vfp-hflt.tar.gz']")).sendKeys(Keys.ENTER);
	    Thread.sleep(3000);
//	    driver.findElement(By.xpath("(//input[@name='licenseAccept'])[2]")).sendKeys(Keys.ENTER);
//	    Thread.sleep(3000);
	    Boolean b=driver.findElement(By.xpath("(//a[@class='download-file icn-download-locked'])[1]")).isEnabled();
	    System.out.println(b);
	}

}
