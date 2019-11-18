package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MissisaugaTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Learning_Selenium\\Selenium_Jars\\geckodriver.exe");

		// Web driver is a interface so subclass inherit the property of the parent
		// class
		WebDriver driver = new FirefoxDriver();

		// open the website
		driver.get("http://www.mississauga.ca/portal/home");

		// now perform actions
		// when you want to perform the actions you should use action builder

		Actions builder = new Actions(driver);

		WebElement cityHall = driver.findElement(By.id("tnNavHall"));

		builder.moveToElement(cityHall).build().perform();

		Thread.sleep(2000);

		List<WebElement> menulist = driver.findElements(By.xpath("//div[@id='tnNavHallMenu']/a"));

		System.out.println(menulist.size());

		for (int i = 0; i < menulist.size(); i++) {

			System.out.println(menulist.get(i).getText());
		}

	}

}
