package com.selenium.Action;
//move to element method 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//div[text()='Pricing']"));
		Actions a = new Actions(driver);
		//a.moveToElement(ele);                 //when co-ordinates are unknown but target is known
		a.moveToElement(ele, 100, 0);          //when co-ordinates are known
		a.perform();
	}

}
