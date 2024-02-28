package javaScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       driver.get("https://demo.actitime.com/login.do");
	       WebElement text = driver.findElement(By.id("username"));
	       JavascriptExecutor jse = (JavascriptExecutor) driver;
	       jse.executeScript("arguments[0].value='pune'", text);
	}
}
