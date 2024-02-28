package com.selenium.suggetions1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 
{
  public static void main(String[] args)
  {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).click();
	List<WebElement> ele = driver.findElements(By.xpath("//li[@class='sbct' and not(@id='YMXe')]"));
    System.out.println(ele.size());
    for(WebElement all : ele)
    {
    	System.out.println(all.getText());
    }
  }
}
