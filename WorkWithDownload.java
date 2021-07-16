package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithDownload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Learn Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");

		WebElement downloadex =driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div[2]/a[1]"));
		downloadex.click();
		Thread.sleep(3000);
		File file = new File("C:\\Downloads");
		File[] totalfiles = file.listFiles();
		for (File file2 : totalfiles) {
			if(file2.getName().equals("testleaf.xls"));
			System.out.println("File is downloaded");
			break;
			
			
		}
		

	}

}
