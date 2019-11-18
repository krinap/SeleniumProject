package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeysTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\\\Learning_Selenium\\\\Selenium_Jars\\\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

		driver.findElement(By.id("identifierId")).sendKeys("test55@gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		driver.findElement(By.name("password")).sendKeys("********");
		driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
		
	}
	
}
