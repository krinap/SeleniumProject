package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Learning_Selenium\\Selenium_Jars\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://ca.yahoo.com/");
		
		List<WebElement> linkList = driver.findElements(By.xpath("//li[@data-category='trending news']//a"));
		
		System.out.println(linkList.size());
		
//		for(int i = 0; i < linkList.size(); i++)
//		{
//			System.out.println(linkList.get(i).getText());
//		}
		
		// for each loop
		for(WebElement list : linkList)
		{
			System.out.println(list.getText());
		}
	}

}
