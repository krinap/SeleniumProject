package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D:\\Learning_Selenium\\Selenium_Jars\\geckodriver.exe");

		// Webdriver is a interface so subclass inherit the property of the parent class
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("abcddjhjhjhjhkjhkj");
		driver.findElement(By.id("pass")).sendKeys("89988");

		// for login button click
		driver.findElement(By.id("loginbutton")).click();
	}
}
