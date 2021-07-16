package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Learn Selenium\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		String Parent = driver.getWindowHandle();
		WebElement window = driver.findElement(By.id("windowButton"));
		window.click();
		
		Set<String> Childs= driver.getWindowHandles();
		for (String string : Childs) {
			driver.switchTo().window(string);
			
		}
		driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(Parent);
		WebElement tab = driver.findElement(By.id("tabButton"));
		tab.click();
		Thread.sleep(3000);
		driver.quit();

	}

}
