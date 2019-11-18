package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBookListTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Learning_Selenium\\Selenium_Jars\\geckodriver.exe");

		// Web driver is a interface so subclass inherit the property of the parent
		// class
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");

		List<WebElement> fbFooterList = driver
				.findElements(By.xpath("//div[@aria-label=\"Facebook site links\"]//a"));
		
		//div[@class="td-footer-links td-copy-align-centre td-copy-white"]//a"

		//In this //a means find from this inside 
		//List<WebElement> fbFooterList = driver.findElements(By.xpath("//div[@aria-label=\"Facebook site links\"]//a"));
		
		//"//div[@aria-label=\"Facebook site links\"]/ul/li/a"
		//div[@aria-label="Facebook site links"]//a
		System.out.println(" List size -->" + fbFooterList.size());

		System.out.println("------ Footer Name Link List---------");

		for (int i = 0; i < fbFooterList.size(); i++) {
			System.out.println(fbFooterList.get(i).getText());
		}
	}

}
