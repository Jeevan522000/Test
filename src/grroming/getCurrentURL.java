package grroming;

import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentURL {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 ChromeDriver driver = new ChromeDriver();
	      driver.get("http://www.flipkart.com/");
	      String url = driver.getCurrentUrl();
	      System.out.println(url);

	}

}
