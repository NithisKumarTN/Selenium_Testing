package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "F:\\Learn Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		driver.manage().window().maximize();
		
		WebElement Value1 = driver.findElement(By.id("user-message"));
		WebElement buttonclick = driver.findElement(By.xpath("//*[@id='get-input']/button"));
		Value1.sendKeys("Hello");
		buttonclick.click(); 
		
		WebElement getPositionButton = driver.findElement(By.xpath("//*[@id='get-input']/button"));
		Point xypoint = getPositionButton.getLocation();
		int X = xypoint.getX();
		int Y = xypoint.getY();
		
		System.out.println("X and Y Value is "+ X+" "+" "+Y);
		
		WebElement color = driver.findElement(By.xpath("//*[@id='get-input']/button"));
		String buttoncolor = color.getCssValue("background-color");
		System.out.println("button color is "+ buttoncolor);
		
		WebElement size = driver.findElement(By.xpath("//*[@id='get-input']/button"));
	    int buttonheight = size.getSize().getHeight();
	    int buttonwidth = size.getSize().getWidth();
	    
	    System.out.println(buttonheight+" "+" "+buttonwidth);
	    
	    
	    
	   

	}

}
 