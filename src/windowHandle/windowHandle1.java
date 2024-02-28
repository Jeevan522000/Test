package windowHandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    //Windowhandle
	    
//	    driver.get("https://demo.actitime.com/login.do");
//	    String ele = driver.getWindowHandle();
//	    System.out.println(ele);
//	    
//	    driver.get("http://www.facebook.com");
//	    String ele1 = driver.getWindowHandle();
//	    System.out.println(ele1);
	    
	    //WindowHandles
	    
	    driver.get("https://the-internet.herokuapp.com/windows");
	    driver.findElement(By.linkText("Elemental Selenium")).click();
	    Set<String> ele = driver.getWindowHandles();
	    for(String s:ele)
	    {
	    	driver.switchTo().window(s);
	    String title=driver.getTitle();
	    System.out.println(title);
	    System.out.println(ele);
	    }
	    
         //practice
	   // driver.get("https://demoqa.com/browser-windows");
	}

}
