package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Learning_Selenium\\Selenium_Jars\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://jqueryui.com/droppable/");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Actions builder = new Actions(driver);

		// we have to move to the frame

		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		WebElement drag = driver.findElement(By.cssSelector("#draggable"));

		System.out.println(drag.getText() + " is selected");

		WebElement drop = driver.findElement(By.id("droppable"));

		System.out.println(drop.getText() + " is selected");

		builder.dragAndDrop(drag, drop).build().perform();

		// verify error message
		String actualMsg = "Dropped!";

		String expectedMsg;

		expectedMsg = driver.findElement(By.id("droppable")).getText();

		System.out.println(expectedMsg);

		if (actualMsg.equals(expectedMsg)) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Failed");
		}

	}

}
