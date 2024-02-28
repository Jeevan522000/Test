package com.selenium.first;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {
	
	//works fine for : radio and checkbox
    //selected : true	
    //unselected : false    
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html");
	    driver.findElement(By.xpath("//a[text()=' jdk-8u202-linux-arm32-vfp-hflt.tar.gz']")).sendKeys(Keys.ENTER);
	    Thread.sleep(3000);
	    boolean b=driver.findElement(By.xpath("(//input[@name='licenseAccept'])[2]")).isSelected();
	    System.out.println(b);
	    Thread.sleep(3000);
	    
	    //verification
	    
	     WebElement b1 = driver.findElement(By.xpath("(//input[@name='licenseAccept'])[2]"));
	     if(b1.isSelected())
	     {
	    	 System.out.println("True : ChechBox is Selected");
	     }
	     else
	     {
	    	 System.out.println("False : ChechBox is not Selected"); 
	     }
	     Thread.sleep(3000);
	     
	     b1.sendKeys(Keys.ENTER);
	     if(b1.isSelected())
	     {
	    	 System.out.println("True : ChechBox is Selected");
	     }
	     else
	     {
	    	 System.out.println("False : ChechBox is not Selected"); 
	     }
	}

}
