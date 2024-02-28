package com.selenium.first;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jdk {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html");
	    driver.findElement(By.xpath("//a[text()=' jdk-8u202-linux-arm32-vfp-hflt.tar.gz']")).sendKeys(Keys.ENTER);
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//input[@name='licenseAccept'])[2]")).sendKeys(Keys.ENTER);
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//a[@class='download-file icn-download-locked'])[1]")).sendKeys(Keys.ENTER);
	}

}
