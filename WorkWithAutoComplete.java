package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithAutoComplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","F:\\Learn Selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");

		WebElement autocomplete = driver.findElement(By.id("tags"));
		autocomplete.sendKeys("s");
		Thread.sleep(4000);
		List<WebElement> options = driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));
		
        int count=0; 
		for (WebElement webElement : options) {
			count = count+1;
			if(webElement.getText().equalsIgnoreCase("selenium")){
				webElement.click();
			
				break;
			}
			

		}
		System.out.print(count);
		
	}

}
