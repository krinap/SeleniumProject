package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonSigninTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Learning_Selenium\\Selenium_Jars\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();
		// WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.ca/");
		
		driver.findElement(By.id("nav-link-accountList")).click();
		
		driver.findElement(By.partialLinkText("")).click();

	}

}
