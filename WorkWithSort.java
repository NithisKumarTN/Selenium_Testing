package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkWithSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Learn Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		
		List<WebElement> sort = driver.findElements(By.xpath("//*[@id='sortable']/li"));
		WebElement from = sort.get(6);
		WebElement to = sort.get(0);
		
		Actions action = new Actions(driver);
		action.clickAndHold(from);
		action.moveToElement(to);
		action.release(to);
		action.build().perform();


	}

}
