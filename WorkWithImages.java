package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Learn Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Image.html");
		WebElement image1 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/img"));
		image1.click();
		driver.get("http://www.leafground.com/pages/Image.html");
		WebElement image2 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/img"));
		if(image2.getAttribute("naturalWidth").equals("0")){
			System.out.println("Image Broken");
		}
		else{
			System.out.println("Image Not Broken");
		}

	}

}
