package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Learning_Selenium\\Selenium_Jars\\geckodriver.exe");

		// Web driver is a interface so subclass inherit the property of the parent
		// class
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com/");

		List<WebElement> element = driver.findElements(By.linkText("About"));

		if (element.size() > 0) {
			System.out.println("Element Present");
		} else {
			System.out.println("Element Not Present");
		}

	}

}
