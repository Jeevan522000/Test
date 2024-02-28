package com.selenium.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPath 
{
  public static void main(String[] args) throws InterruptedException 
  {
	   WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("html/body/div/div/div[2]/div/div/div/a/div/div/img")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/div/div/div[2]/div/div/div[2]/a/div/div/img")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("html/body/div/div/div[2]/div/div/div[3]/a/div/div/img")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("html/body/div/div/div[2]/div/div/div[4]/a/div/div/img")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("html/body/div/div/div[2]/div/div/div[5]/a/div/div/img")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/div/div/div[2]/div/div/div[6]/a/div/div/img")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/div/div/div[2]/div/div/div[7]/a/div/div/img")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/div/div/div[2]/div/div/div[8]/a/div/div/img")).click();
		Thread.sleep(2000);
		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("html/body/div/div/div[2]/div/div/div[9]/a/div/div/img")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("html/body/div/div/div[2]/div/div/div[10]/a/div/div/img")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
  }

}
