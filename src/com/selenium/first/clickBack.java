package com.selenium.first;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickBack 
{

	public static void main(String[] args) throws InterruptedException 
	{
		  ChromeDriver driver = new ChromeDriver();
	      driver.get("http://www.flipkart.com/");
		 driver.findElement(By.linkText("https://www.flipkart.com/grocery-supermart-store?marketplace=GROCERY&fm=neo%2Fmerchandising&iid=M_87c2c083-2a6c-427f-b3fc-ff5126baf912_1_372UD5BXDFYS_MC.CBUR1Q46W5F1&otracker=hp_rich_navigation_1_1.navigationCard.RICH_NAVIGATION_Grocery_CBUR1Q46W5F1&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_1_L0_view-all&cid=CBUR1Q46W5F1")).click();
		 driver.navigate().back();
	}

}
