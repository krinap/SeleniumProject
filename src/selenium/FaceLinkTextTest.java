package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceLinkTextTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Learning_Selenium\\Selenium_Jars\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.linkText("Places")).click();

		Thread.sleep(3000);
		// driver.findElement(By.linkText("Store")).click();

		String expectedTitle = "Discover great places in every city | Facebook";
		String actualtTitle = driver.getTitle();

		System.out.println(actualtTitle);

		if (expectedTitle.equals(actualtTitle)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}

	}

}
