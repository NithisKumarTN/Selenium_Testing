package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printsearchlinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Learn Selenium\\chromedriver91.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Euro 2020"+Keys.ENTER);
		Thread.sleep(5000);
		//List<WebElement> suggestion =  driver.findElements(By.xpath("//a"));
		List<WebElement> suggestion =  driver.findElements(By.xpath("//*[@id ='search']//following::h3//following::div/cite"));
		for (WebElement webElement : suggestion) {
			System.out.println(webElement.getText());

		}

	}
}