package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	public WebDriver driver;
  @FindBy(id="username")
  private WebElement usernametext;
  
  public WebElement getusernametext()
  {
	  return usernametext;
  }
  
  @FindBy(name="pwd")
  private WebElement passwordtext;
  
  public WebElement getpasswordtext()
  {
	  return passwordtext;
  }
  
  @FindBy(id="loginButton")
  private WebElement loginbutton;
  
  public WebElement getloginbutton()
  {
	  return loginbutton;
  }
  
  //constructor
  public LoginPage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  //Actions Method
  
  public HomePage login(String username,String password)
  {
	  usernametext.sendKeys(username);
	  passwordtext.sendKeys(password);
	  loginbutton.click();
	  return new HomePage(driver);
  }
  
}
