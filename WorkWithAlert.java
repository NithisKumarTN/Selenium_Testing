package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Learn Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		WebElement alertbox = driver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[1]/div[2]/button"));
		alertbox.click();
		
		Alert alert =driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		
		WebElement confirmbox = driver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[2]/div[2]/button"));
		confirmbox.click();
		Thread.sleep(3000);
		Alert confirmalert = driver.switchTo().alert();
		
		confirmalert.dismiss();
		
		WebElement promptbox = driver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[3]/div[2]/button"));
		promptbox.click();
		Thread.sleep(3000);
		Alert promptalert = driver.switchTo().alert();
		promptalert.sendKeys("Chennai Super Kings");
		promptalert.accept();
		
		

	}

}
