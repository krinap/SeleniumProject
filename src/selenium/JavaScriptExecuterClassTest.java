package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecuterClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Learning_Selenium\\Selenium_Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.nike.com/ca/");

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		// jse.executeScript("window.scrollBy(0,5500)");

		WebElement a = driver.findElement(By.linkText("Trousers and Leggings"));
		System.out.println(a.getLocation());

		jse.executeScript("arguments[0].scrollIntoView(true)", a);

		//a.click();

	}

}

// There are two ways to scroll your page, 1. using x and y cordinate scrollBy and 
//2. scrollIntoView method both using javascriptexecutor