package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Learning_Selenium\\Selenium_Jars\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("abcddjhjhjhjhkjhkj");

		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("89988");

		WebElement loginBtn = driver.findElement(By.id("loginbutton"));
		loginBtn.click();

	}

}
