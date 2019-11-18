package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// open gmail.com
		System.setProperty("webdriver.gecko.driver", "D:\\Learning_Selenium\\Selenium_Jars\\geckodriver.exe");

		// by normal id
		WebDriver driver = new FirefoxDriver();

		// this line will open the website
		driver.get(
				"https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

//		// correct email
//		WebElement email = driver.findElement(By.id("identifierId"));
//		email.sendKeys("test55@gmail.com");
//		// click on next button
//
//		WebElement btnLogin = driver.findElement(By.id("identifierNext"));

//		btnLogin.click();
//		//
//		Thread.sleep(3000);
//
//		WebElement pwd = driver.findElement(By.name("password"));
//		pwd.sendKeys("1234");
//
//		Thread.sleep(3000);
//		WebElement btnNext = driver.findElement(By.id("passwordNext"));
//		btnNext.click();

		// by xpath now

		// correct email
		WebElement email = driver.findElement(By.xpath("//input[@id='identifierId']"));
		email.sendKeys("test14r@gmail.com");
		// click on next button

		WebElement btnLogin = driver.findElement(By.id("identifierNext"));
		btnLogin.click();
		//
		Thread.sleep(3000);

		WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
		pwd.sendKeys("1234");
		Thread.sleep(3000);

		WebElement btnNext = driver.findElement(By.xpath("//div[@id='passwordNext']"));
		btnNext.click();

		Thread.sleep(2000);

		String expectedError = "Wrong password. Try again or click Forgot password to reset it.";

		String actualError;

		actualError = driver
				.findElement(By.xpath("//span[contains(text(),'Wrong password. Try again or click Forgot password')]"))
				.getText();

		if (expectedError.equals(actualError)) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Failed");
		}

	}

}
