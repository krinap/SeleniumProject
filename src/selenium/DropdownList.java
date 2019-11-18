package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Learning_Selenium\\Selenium_Jars\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.ebay.ca/");

		// directly with the usage of xpath
		// List<WebElement> listofCategory =
		// driver.findElements(By.xpath("//select[@aria-label='Select a category for
		// ssearch']/option"));

		// we can use this way as well
		WebElement box = driver.findElement(By.id("gh-cat"));
		List<WebElement> listofCategory = box.findElements(By.tagName("option"));

		// we can also use tagname here
		// List<WebElement> listofCategory = box.findElements(By.tagName("option"));

		Thread.sleep(3000);

		System.out.println("DropdownList size" + listofCategory.size());

		for (WebElement list : listofCategory) {

			if (list.isSelected()) {
				System.out.println(list.getText() + "-----" + list.isSelected());
			}

		}

		Select s = new Select(box);
		// s.selectByIndex(5); // this will select from the index
		// s.selectByValue("2984"); // every option has a value so we can use the value
		s.selectByVisibleText("Antiques");

		System.out.println("-------------------------------------------------------------");

		for (WebElement list : listofCategory) {

			if (list.isSelected()) // in Boolean default value for isselected is true
				System.out.println(list.getText() + "-----" + list.isSelected());
		}

	}

}
