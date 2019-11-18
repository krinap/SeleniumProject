package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Learning_Selenium\\Selenium_Jars\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();
		// WebDriver driver = new FirefoxDriver();

		driver.get("https://www.amazon.ca/");

		// search about the header
		List<WebElement> menu = driver.findElements(By.xpath("//div[@id='nav-xshop']//a"));

		System.out.println(menu.size());

		for (WebElement list : menu) {
			System.out.println(list.getText());
		}

		// check node9
		WebElement node9 = driver.findElement(By.xpath("//div[@id='nav-xshop']//a[9]"));

		System.out.println(node9.getText());

		// check the list size and list options

		// search about the header

		Actions builder = new Actions(driver);

		WebElement products = driver.findElement(By.xpath("//span[@class='nav-arrow nav-icon-flipped']"));

		builder.moveToElement(products).build().perform();

		Thread.sleep(2000);

		List<WebElement> menulist = driver.findElements(By.xpath("//div[@id='nav-al-wishlist']//span"));

		System.out.println(menulist.size());

		for (int i = 0; i < menulist.size(); i++) {
			// not printing the text
			System.out.println(menulist.get(i).getText());
		}

	}

}
