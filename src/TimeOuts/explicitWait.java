package TimeOuts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWait 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    WebDriverWait rv = new WebDriverWait(driver,Duration.ofSeconds(10));
	    driver.get("https://demo.actitime.com/login.do"); 
	    driver.findElement(By.id("username")).sendKeys("admin");
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    driver.findElement(By.id("loginButton")).sendKeys(Keys.ENTER);
        String ExpectedTitle="actiTIME - Enter Time-Track";
        rv.until(ExpectedConditions.titleIs(ExpectedTitle));
        String ActualTitle =driver.getTitle();
        System.out.println(ActualTitle);
        System.out.println("hii");
        
	}

}
