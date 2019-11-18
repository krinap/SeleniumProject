package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class MaximizeWindowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\\\Learning_Selenium\\\\Selenium_Jars\\\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.mississauga.ca/portal/home");
		
		driver.manage().window().maximize();

	}

}
