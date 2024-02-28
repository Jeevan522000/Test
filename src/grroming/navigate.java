package grroming;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
	      driver.get("http://www.flipkart.com/");
	     Navigation nav = driver.navigate();
	     nav.forward();
	     Thread.sleep(2000);
	     nav.back();
	     Thread.sleep(2000);
	     nav.refresh();
	     

	}

}
