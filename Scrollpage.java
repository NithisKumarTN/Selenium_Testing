package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Learn Selenium\\chromedriver91.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.wikipedia.com");
		Thread.sleep(3000);
		JavascriptExecutor script = (JavascriptExecutor) driver;
		//script.executeScript("window.scroll(0,400)","");
		//Thread.sleep(3000);
		//script.executeScript("window.scroll(0,-400)","");
		//Thread.sleep(3000);
		script.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
		//WebElement view = driver.findElement(By.linkText("Download Wikipedia for Android or iOS"));
		//Thread.sleep(3000);
		//script.executeScript("arguments[0].scrollIntoView(true)",view);
		
		
		

	}

}
