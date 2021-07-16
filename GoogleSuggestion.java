package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Learn Selenium\\chromedriver91.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Euro 2020");
		Thread.sleep(5000);
		List<WebElement> suggestion =  driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
		//int pos=0;
		for (WebElement webElement : suggestion) {
			String name = webElement.getText();
			System.out.println(name);
			if(name.contains("live")) {
				webElement.click();
				break;
			/*pos++;
			if(pos==3) {
				webElement.click();
				break;*/
		}
	}
		

	}

}
