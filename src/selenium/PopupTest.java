package selenium;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopupTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Learning_Selenium\\Selenium_Jars\\geckodriver.exe");

		// Web driver is a interface so subclass inherit the property of the parent
		// class
		FirefoxDriver driver = new FirefoxDriver();

		// open the website
		driver.get("https://www.aliexpress.com/");

		// if pop is there then close the pop up

		Alert al = driver.switchTo().alert();

		System.out.println(al.getText());

		List<WebElement> link = driver.findElements(By.linkText("x"));

		System.out.println(link.size());

		if (link.size() > 0) {
			link.get(0).click();
		}

		driver.findElement(By.linkText("Buyer Protection")).click();
		
		

	}

}
