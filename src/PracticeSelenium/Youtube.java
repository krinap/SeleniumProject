package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "D:\\Learning_Selenium\\Selenium_Jars\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.youtube.com/");

		WebElement enterText = driver.findElement(By.name("search_query"));
		enterText.sendKeys("krina");
		enterText.click();
		enterText.sendKeys(" ");

		// thread
		Thread.sleep(3000);
		// count the suggestion size
		
		// we can directly use the option from the list tag as well.
		List<WebElement> listofSuggestionText = driver.findElements(By.xpath("//li[@role=\"presentation\"]"));

		System.out.println(listofSuggestionText.size());

		// print text

		for (int i = 0; i < listofSuggestionText.size(); i++) {
			System.out.println(listofSuggestionText.get(i).getText());

		}
	}

}
