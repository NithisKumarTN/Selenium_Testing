package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Learn Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		
		List<WebElement> col = driver.findElements(By.tagName("th"));
		int colCount = col.size();
		System.out.println(colCount);
		
		List<WebElement> row = driver.findElements(By.tagName("tr"));
		int rowCount = row.size();
		System.out.println(rowCount);
		
		WebElement getpercent = driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String size = getpercent.getText();
		System.out.println(size);
		
		List<WebElement> allpercent = driver.findElements(By.xpath("//td[2]"));
		List<Integer> numbers = new ArrayList<Integer>();
		for (WebElement webElement : allpercent) {
			String text = webElement.getText().replace("%","");
			numbers.add(Integer.parseInt(text));
		}
		System.out.println(numbers);
		
		int small = Collections.min(numbers);
		System.out.println(small);
		String valueStr = Integer.toString(small)+"%";
		String xpath = "//td[normalize-space()="+"\""+ valueStr + "\""+"]"+"//following::td[1]";
		System.out.println(xpath);
		WebElement check = driver.findElement(By.xpath(xpath));
		check.click();
		


	}

}
