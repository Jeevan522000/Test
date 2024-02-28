package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddenPopUps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.naukri.com/");
        //click on login button
        driver.findElement(By.id("login_Layer")).click();
        //Enter details
        driver.switchTo();
        driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("Jeevan");
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Jeevan");
        driver.findElement(By.xpath("//button[@class='btn-primary loginButton']")).click();
	}

}
