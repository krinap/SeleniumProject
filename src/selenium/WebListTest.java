package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Learning_Selenium\\Selenium_Jars\\geckodriver.exe");

		// Web driver is a interface so subclass inherit the property of the parent
		// class
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com/");

		// this will find first element of word a
		driver.findElement(By.tagName("a"));

		// this will give the list of the Web element with tagName A
		List<WebElement> allList = driver.findElements(By.tagName("a"));

		// this will print the size of all list
		System.out.println(allList.size());

		// writing the first element of 1 position
		// System.out.println(allList.get(0).getText());

		// writing all the elements in a loop
		for (int i = 0; i < allList.size(); i++) {
			System.out.println(allList.get(i).getText());
		}

		// Scenario 2   // find all the tag from footer

		
//		WebElement footer = driver.findElement(By.id("fsl"));
//
//		List<WebElement> allListFooter = footer.findElements(By.tagName("a"));
		
		List<WebElement> allListFooter = driver.findElements(By.xpath("//span[@id=\"fsl\"]/a"));

		// this will print the size of all list
		System.out.println("-----Size of a tag in footer----  " + allListFooter.size());

		// writing the first element of 1 position
		// System.out.println(allList.get(0).getText());
		System.out.println("------------List of a tag in footer -------");
		// writing all the elements in a loop
		for (int i = 0; i < allListFooter.size(); i++) {
			
			
			System.out.println( allListFooter.get(i).getText());
		}
	}

}
