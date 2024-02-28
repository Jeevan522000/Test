package grroming;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a1 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/doodles"); 
		Thread.sleep(2000);
		String ele=driver.getTitle();
        System.out.println(ele);
		String ele2= driver.getCurrentUrl();
        System.out.println(ele2);
		String ele3= driver.getPageSource();
		System.out.println(ele3);
		String ele4=driver.getWindowHandle();
		Set<String> ele5= driver.getWindowHandles();
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.manage().window().minimize(); driver.manage().window().maximize();
		Thread.sleep(2000);
		Point point= driver.manage().window().getPosition();
		System.out.println(point);
		int x= point.getX();
		int y= point.getY();
        System.out.println(x + " "+ y);
		Point point1=new Point (500, 500);
		driver.manage().window().setPosition(point1); 
		Dimension dia= driver.manage().window().getSize();
		System.out.println(dia);
		int height =dia.getHeight();
		int width= dia.getWidth();

		Dimension diam=new Dimension(450,450);


		driver.manage().window().setSize(diam);
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();

		driver.navigate().to("https://www.google.com/doodles");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Celebrating Ihsan Abdel Kouddous']")).click();
		driver.quit();

	}

}
