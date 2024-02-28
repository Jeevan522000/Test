package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	public WebDriver driver;
	
  @FindBy(id="logoutLink")
  private WebElement logoutbutton;
  
  public WebElement getLogoutButton()
  {
	  return logoutbutton;
  }
  
  //constructor
  
  public HomePage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  //Action Method
  
  public LoginPage Home()
  {
	  logoutbutton.click();
	  return new LoginPage(driver);
  }
}
