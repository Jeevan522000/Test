package grroming;

import org.openqa.selenium.chrome.ChromeDriver;

public class getPageSource {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		  ChromeDriver driver = new ChromeDriver();
	      driver.get("http://www.flipkart.com/");
	      String source = driver.getPageSource();
	      System.out.println(source);

	}

}
