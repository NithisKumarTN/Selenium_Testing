package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsingPropertySetting {
	

	public static void main(String[] args) throws IOException {
		WebDriver driver = null;
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream("config.properties");
		Properties props = new Properties();
		props.load(file);
		String browser = props.getProperty("browser");
		String path = props.getProperty("path");
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", path);
		    driver = new ChromeDriver(); 
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gekco.driver", path);
		    driver = new FirefoxDriver(); 
		    
		}
		driver.get("http://www.google.co.in");
		driver.quit();
		}

}