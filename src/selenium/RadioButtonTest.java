package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Learning_Selenium\\Selenium_Jars\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();
		// WebDriver driver = new FirefoxDriver();

		driver.get("http://www.echoecho.com/htmlforms10.htm");

		List<WebElement> allRadioButton = driver.findElements(By.name("group1"));

		System.out.println(allRadioButton.size());

		for (int i = 0; i < allRadioButton.size(); i++) {

			System.out.println(allRadioButton.get(i).getAttribute("value") +  "----->" + allRadioButton.get(i).isSelected());
		}
		
		// define the position of the array which one you want to select
		allRadioButton.get(0).click();
		
		System.out.println("----------------------------------------------------->");
		
		
		for (int i = 0; i < allRadioButton.size(); i++) {

			System.out.println(allRadioButton.get(i).getAttribute("value") +  "----->" + allRadioButton.get(i).isSelected());
		}

		
	}

}
