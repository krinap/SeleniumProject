package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

         // connection of gecko web driver
		System.setProperty("webdriver.gecko.driver", "D:\\Learning_Selenium\\Selenium_Jars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		//WebDriver driver = new FirefoxDriver();
		
		// this line will open the website
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.className("inputtext")).sendKeys("abc");

		driver.findElement(By.id("email")).sendKeys("abcddjhjhjhjhkjhkj");
		driver.findElement(By.id("pass")).sendKeys("89988");
		
		
		
		// for login button click
		driver.findElement(By.id("loginbutton")).click();
		
	//	driver.findElement(By.name("email")).sendKeys("abcdhgfhgfhgfhgf");
		
	//	driver.findElement(By.name("email")).sendKeys("abcdhgfhgfhgfhgf");
	}

}
