package javaScript;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		   WebDriver driver = new ChromeDriver();
//	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       driver.get("https://www.naukri.com/");
	       JavascriptExecutor jse = (JavascriptExecutor) driver;
	       
	       //scrollBy
//	       jse.executeScript("window.scrollBy(0,900)");
//	       Thread.sleep(2000);
//           jse.executeScript("window.scrollBy(300,0)");
           
           //scrollTo
           jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
           Thread.sleep(2000);
           jse.executeScript("window.scrollTo(document.body.scrollWidth,0)");
	}

}
