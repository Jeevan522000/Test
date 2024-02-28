package sample_demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class vtiger {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\G-ONE\\BackUp\\SELENIUM1\\sample\\drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		   WebDriver driver = new ChromeDriver(options);
	       driver.manage().window().maximize();
	       driver.get("https://demo.vtiger.com/vtigercrm/");
	       WebElement element =driver.findElement(By.id("username"));
	       element.clear();
	       Thread.sleep(1000);
	       element.sendKeys("admin");  
	       Thread.sleep(3000);
	       WebElement element1=driver.findElement(By.id("password"));
	       element1.clear();
	       Thread.sleep(1000);
	       element1.sendKeys("vtiger");
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//button[text()='Sign in']")).sendKeys(Keys.ENTER);

	}

}
