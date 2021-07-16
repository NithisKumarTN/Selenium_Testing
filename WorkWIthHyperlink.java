package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWIthHyperlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\Learn Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		WebElement link1 = driver.findElement(By.linkText("Go to Home Page"));
		link1.click();
		driver.navigate().back();

		WebElement link2 = driver.findElement(By.partialLinkText("Find where"));
		String linkname = link2.getAttribute("href");
		System.out.println(linkname);

		WebElement link3 = driver.findElement(By.linkText("Verify am I broken?"));
		link3.click();
		String title = driver.getTitle();
		if(title.contains("404")){
			System.out.println("Link broken");
		}
		else{
			System.out.println("Link not broken");
		}

		driver.navigate().back();
		/*WebElement link11 = driver.findElement(By.linkText("Go to Home Page"));
		link11.click();
		driver.navigate().back();*/

		List<WebElement> links = driver.findElements(By.tagName("a"));
		int linksize = links.size();
		System.out.println(linksize);



	}

}
