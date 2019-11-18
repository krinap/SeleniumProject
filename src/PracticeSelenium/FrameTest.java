package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\Learning_Selenium\\Selenium_Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://humber.ca/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement link = driver.findElement(By.linkText("Careers at Humber"));
		System.out.println(link.getLocation());

		//js.executeScript(arg0, arg1)
		js.executeScript("arguments[0].scrollIntoView(true)", link);
		
	}

}
