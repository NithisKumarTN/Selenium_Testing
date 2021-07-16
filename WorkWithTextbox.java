package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithTextbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Learn Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		
		WebElement msg = driver.findElement(By.id("user-message"));
		msg.sendKeys("Message");
		
		WebElement Value1 = driver.findElement(By.xpath("//*[@id='sum1']"));
		Value1.sendKeys("34"+Keys.ENTER);
		Value1.clear();
	
		
			
		
		

	}

}
