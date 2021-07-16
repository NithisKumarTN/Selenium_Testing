package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\Learn Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");

		WebElement radio = driver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[1]/div[2]/label[1]"));
		radio.click();
		WebElement button = driver.findElement(By.id("buttoncheck"));
		button.click();
		
		WebElement gender = driver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[2]/div[2]/div[1]/label[1]/input"));
		gender.click();
		WebElement age = driver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[2]/div[2]/div[2]/label[3]/input"));
		String agedisp = age.getAttribute("value");
		System.out.println(agedisp);
		age.click();
		
		WebElement button1 = driver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[2]/div[2]/button"));
		button1.click();
		

	}

}
