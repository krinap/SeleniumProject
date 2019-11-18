package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MutiWindowTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Learning_Selenium\\Selenium_Jars\\geckodriver.exe");

		// Web driver is a interface so subclass inherit the property of the parent
		// class
		WebDriver driver = new FirefoxDriver();

		// open the website
		driver.get("https://moodle.cestarcollege.com/moodle/");

		driver.findElement(By.linkText("Faq")).click();

		Set<String> allwindows = driver.getWindowHandles();

		System.out.println(allwindows.size());

		Iterator<String> itr = allwindows.iterator();

		String mainWindow = itr.next();
		String childWindow = itr.next();

		System.out.println(mainWindow);
		System.out.println(childWindow);

		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());

		driver.close();

		Thread.sleep(2000);

		driver.switchTo().window(mainWindow);

		System.out.println(driver.getTitle());

		driver.quit();

	}

}
