package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithCheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Learn Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		
		WebElement check1 = driver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[2]/div[2]/div[1]/label/input"));
		
		WebElement check2 = driver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[2]/div[2]/div[2]/label/input"));
		
		WebElement check3 = driver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[2]/div[2]/div[3]/label/input"));
		
		WebElement check4 = driver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[2]/div[2]/div[4]/label/input"));
		
		check1.click();
		check2.click();
		check3.click();
		check4.click(); 
		
		WebElement button = driver.findElement(By.id("check1"));
		String ButStatus = button.getAttribute("value");
		System.out.println(ButStatus);
		Thread.sleep(3000);
		
		check1.click();
		String ButStatus1 = button.getAttribute("value");
		System.out.println(ButStatus1);
		
		Boolean status = check4.isSelected();
		System.out.println(status);

		
		

	}

}
