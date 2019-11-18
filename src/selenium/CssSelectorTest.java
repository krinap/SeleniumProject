package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\Learning_Selenium\\Selenium_Jars\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();
		// WebDriver driver = new FirefoxDriver();

		// this line will open the website
		driver.get("https://www.facebook.com/");

		// typelastname
		driver.findElement(By.cssSelector("#email")).sendKeys("parikh");
		
		// password
		driver.findElement(By.cssSelector("#pass")).sendKeys("1234");
		
		driver.findElement(By.cssSelector("#loginbutton")).click();
		

	}

}
