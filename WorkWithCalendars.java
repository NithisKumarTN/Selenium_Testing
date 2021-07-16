package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithCalendars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Learn Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Calendar.html");
		
		WebElement date = driver.findElement(By.id("datepicker"));
		date.sendKeys("28/03/2021"+Keys.ENTER);
		
		date.click();
		WebElement next = driver.findElement(By.xpath("//a[@title='Next']"));
		next.click();
		
		WebElement datepick = driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		datepick.click();

	}

}
