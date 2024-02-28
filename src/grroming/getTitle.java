package grroming;

import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle 
{
  public static void main(String[] args) 
  {
	  ChromeDriver driver = new ChromeDriver();
      driver.get("http://www.flipkart.com/");
      String title = driver.getTitle();
      System.out.println(title);
  }
}
