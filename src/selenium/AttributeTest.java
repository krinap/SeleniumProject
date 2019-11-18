package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Learning_Selenium\\Selenium_Jars\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();
		// WebDriver driver = new FirefoxDriver();

		driver.get("https://www.ebay.ca/");

		// when we have to use the attribute we can use this
		String s = driver.findElement(By.id("gh-ac")).getAttribute("placeholder");

		System.out.println(s);

		driver.findElement(By.id("gh-ac")).sendKeys("Iphone");

		// when we want to get the data for what we have written
		System.out.println(driver.findElement(By.id("gh-ac")).getAttribute("value"));

	}

}
