package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowserTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver;

		FileInputStream fs = new FileInputStream("D:\\Learning_Selenium\\testing\\prop.properties");
		Properties prop = new Properties();
		// this will load the data from the property file
		prop.load(fs);

		// string will the store the value of the key

		String browser = prop.getProperty("browser");

	

		if (browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\\\Learning_Selenium\\\\Selenium_Jars\\\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Learning_Selenium\\Selenium_Jars\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.setProperty("webdriver.chrome.driver",
					"D:\\\\Learning_Selenium\\\\Selenium_Jars\\\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("Test55");
		driver.findElement(By.id("pass")).sendKeys("************");
		driver.findElement(By.id("loginbutton")).click();

	}

}
