package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver", "D:\\Learning_Selenium\\Selenium_Jars\\geckodriver.exe");

		// Web driver is a interface so subclass inherit the property of the parent
		// class
		WebDriver driver = new FirefoxDriver();

		// open the website
		// it will directly enter in to the website
	//	driver.get("http://www.mississauga.ca/portal/home");
		
		// in interview they can ask the difference between driver.get and driver.navigate.to
		
		// driver.navigate.to which is same as driver.get
		driver.navigate().to("http://www.mississauga.ca/portal/home");
		
		
		// this are different from driver.navigate.to
		// this is for navigate back
		driver.navigate().back();
		
		// for navigate forward
		driver.navigate().forward();
		// to refresh the page
		driver.navigate().refresh();
		
		

	}

}
