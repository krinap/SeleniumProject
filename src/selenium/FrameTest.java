package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\\\Learning_Selenium\\\\Selenium_Jars\\\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");

		List<WebElement> sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());

		if (sortable.size() > 0) {
			System.out.println("sortable present");

		} else {
			System.out.println("sortable not present");
		}

		List<WebElement> draggable = driver.findElements(By.id("draggable"));
		System.out.println(draggable.size());

		if (draggable.size() > 0) {
			System.out.println("draggable present");
		} else {
			System.out.println("draggable not present");
		}

		// driver.switchTo().frame(0);
		// driver.switchTo().frame("demo-frame");// This option we can use only for id.
		// In this case we cannot use
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		System.out.println("---------------------------------------------------------------------");

		sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());

		if (sortable.size() > 0) {
			System.out.println("sortable present");

		} else {
			System.out.println("sortable not present");
		}

		draggable = driver.findElements(By.id("draggable"));
		System.out.println(draggable.size());

		if (draggable.size() > 0) {
			System.out.println("draggable present");
		} else {
			System.out.println("draggable not present");
		}

		System.out.println("-------------------------------------------------------------------------");

		driver.switchTo().defaultContent();
		sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());

		if (sortable.size() > 0) {
			System.out.println("sortable present");

		} else {
			System.out.println("sortable not present");
		}

		draggable = driver.findElements(By.id("draggable"));
		System.out.println(draggable.size());

		if (draggable.size() > 0) {
			System.out.println("draggable present");
		} else {
			System.out.println("draggable not present");
		}
	}

}
