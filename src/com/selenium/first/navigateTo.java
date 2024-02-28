package com.selenium.first;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class navigateTo 
{
 
	public static void main(String[] args) throws MalformedURLException 
	{
		ChromeDriver driver = new ChromeDriver();
	    driver.navigate().to("https://licindia.in/Home-(1)Customer-Portal");
	    URL url = new URL("https://licindia.in/Home-(1)Customer-Portal");
	    driver.navigate().to(url);
	}

}
