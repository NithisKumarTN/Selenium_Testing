package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Learn Selenium\\chromedriver91.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		WebElement lang = driver.findElement(By.xpath("//*[@id=\'SIvCob\']/a[5]"));
		String before = lang.getCssValue("text-decoration");
		System.out.println(before);
		Actions action = new Actions(driver);
		action.moveToElement(lang);
		action.perform();
		String after = lang.getCssValue("text-decoration");
		System.out.println(after);
		
		

	}

}
