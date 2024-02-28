package PopUps;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUploadPopUps 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.guru99.com/test/upload/");
        driver.findElement(By.id("file_wraper0")).click();
        Thread.sleep(2000);
        Runtime.getRuntime().exec("C:\\Users\\Administrator\\OneDrive\\Desktop\\auto1.exe");
	}
}
