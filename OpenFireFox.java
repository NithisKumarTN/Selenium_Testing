package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;

public class OpenFireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.gecko.driver","F:\\Learn Selenium\\geckodriver.exe");
		
		WebDriver gecko = new FirefoxDriver();
		gecko.get("https://www.google.co.in/");
		gecko.get("http://facebook.com/");
		gecko.quit();

	}

}
