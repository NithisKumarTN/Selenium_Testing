package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithIFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Learn Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement button = driver.findElement(By.id("Click"));
		Thread.sleep(3000);
		button.click();
		String Text = button.getText();
		System.out.println(Text);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		
		WebElement button2 = driver.findElement(By.id("Click1"));
		button2.click();
		
		driver.switchTo().defaultContent();
		
		List<WebElement> Frames = driver.findElements(By.tagName("iframe"));
		int total = Frames.size();
		System.out.println(total);
		
		
		
		
		
		

	}

}
