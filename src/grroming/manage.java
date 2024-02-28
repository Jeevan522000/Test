package grroming;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class manage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		Thread.sleep(1000);
		driver.manage().window().minimize();
		Thread.sleep(1000);
		driver.manage().window().maximize();
	    driver.get("http://www.flipkart.com/");
		Dimension size = driver.manage().window().getSize();
	    System.out.println("size = "+size);
	    System.out.println("Height = "+size.getHeight());
	    System.out.println("Width = "+size.getWidth());
	    Point position = driver.manage().window().getPosition();
	    System.out.println(position);
	    System.out.println("StartX = "+position.getX());
	    System.out.println("StartY = "+position.getY());
	    
	    
	    Dimension dim = new Dimension(500,700);
		driver.manage().window().setSize(dim);
		
		Point p = new Point(20,30);
		driver.manage().window().setPosition(p);

	}

}
