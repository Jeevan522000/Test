package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       driver.get("https://demo.actitime.com/login.do");
	       
	       LoginPage lp=new LoginPage(driver);
//	       PageFactory.initElements(driver, lp);
//	       lp.getusernametext().sendKeys("Pune");
//	       driver.navigate().refresh();
//	       lp.getusernametext().sendKeys("admin");
//	       lp.getpasswordtext().sendKeys("manager");
//	       lp.getloginbutton().click();
	       lp.login("admin", "manager");
	       
	       HomePage hp = new HomePage(driver);
//	       PageFactory.initElements(driver, hp);
	       hp.Home();
	}

}
