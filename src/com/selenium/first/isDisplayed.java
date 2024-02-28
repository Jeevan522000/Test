package com.selenium.first;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html");
	    driver.findElement(By.xpath("//a[text()=' jdk-8u202-linux-arm32-vfp-hflt.tar.gz']")).sendKeys(Keys.ENTER);
	    Thread.sleep(3000);
	    boolean b=driver.findElement(By.xpath("(//input[@name='licenseAccept'])[2]")).isDisplayed();
	    System.out.println(b);
	    Thread.sleep(3000);
	    
        //verification
	    WebElement b1 = driver.findElement(By.xpath("(//input[@name='licenseAccept'])[2]"));
	    if(b1.isDisplayed())
	    {
	    	System.out.println("True : Element is Displayed ");
	    }
	    else
	    {
	    	System.out.println("False : Element is not Displayed");
	    }
	}

}
