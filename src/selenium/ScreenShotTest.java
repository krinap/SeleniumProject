package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\Learning_Selenium\\Selenium_Jars\\geckodriver.exe");

		// Web driver is a interface so subclass inherit the property of the parent
		// class
		FirefoxDriver driver = new FirefoxDriver();

		// open the website
		driver.get("https://www.ebay.ca//");
		
		File srcFile = driver.getScreenshotAs(OutputType.FILE); // this line is for firefox driver
		
		//File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // This line is for webdriver
		
		FileUtils.copyFile(srcFile, new File("D:\\Learning_Selenium\\testing\\screenshot.png"));

	}

}
