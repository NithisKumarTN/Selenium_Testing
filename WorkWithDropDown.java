package selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkWithDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Learn Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		WebElement dropdown = driver.findElement(By.id("select-demo"));
		
		Select select = new Select(dropdown);
		
		select.selectByIndex(3);
		List<WebElement> list = select.getOptions();
		int size=list.size();
		System.out.print(size);
		
		dropdown.sendKeys("Monday");
		
		WebElement multidropdown = driver.findElement(By.id("multi-select"));
		Select multiselect = new Select(multidropdown);
		
		multiselect.selectByIndex(0);
		multiselect.selectByIndex(2);
		multiselect.selectByIndex(5);

		

	}

}
