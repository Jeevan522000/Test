package com.selenium.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectGetOptions 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get("https://www.facebook.com/signup");
        driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
//        WebElement allmonth = driver.findElement(By.id("month"));
        WebElement allmonth = driver.findElement(By.id("Form_getForm_Country"));
        Select s =new Select(allmonth);
        List<WebElement> alloptions = s.getOptions();
        for (WebElement ele : alloptions) 
        {
			System.out.println(ele.getText());
		}
        driver.quit();
	}

}
