package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       System.setProperty("webdriver.chrome.driver", "D:\\Learning_Selenium\\Selenium_Jars\\chromedriver.exe");
		
		
		  WebDriver driver = new ChromeDriver();
		// ChromeDriver driver = new ChromeDriver();
		
		// this line will open the website
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.className("inputtext")).sendKeys("abc");

		driver.findElement(By.id("email")).sendKeys("abcddjhjhjhjhkjhkj");
		driver.findElement(By.id("pass")).sendKeys("89988");
		
		// for login button click
		driver.findElement(By.id("loginbutton")).click();
	}

}
