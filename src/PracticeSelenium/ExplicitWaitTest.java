package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Learning_Selenium\\Selenium_Jars\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();
		// WebDriver driver = new FirefoxDriver();

		driver.get("https://www.amazon.ca/");

		WebElement searchInput = driver.findElement(By.id("twotabsearchtextbox"));

		searchInput.sendKeys("toys");

		WebElement searchBtnClick = driver.findElement(By.className("nav-input"));

		searchBtnClick.click();

		// wait for new window with explicit wait

		if (Explicitwait(driver, "Fisher-Price")) {
			driver.findElement(By.cssSelector("#pdagDesktopSparkleDescription1")).click();

			System.out.println("Pass");
		} else {
			System.out.println("fail");
		}

		// CSS selector to find the id

	}

	// method to call the Explicit wait to check the text
	public static boolean Explicitwait(WebDriver driver, String text) {
		new WebDriverWait(driver, 10)
				.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Fisher-Price")));
		return true;
	}

}
