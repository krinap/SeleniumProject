package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_textbox_submit_clear_click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\\\Learning_Selenium\\\\Selenium_Jars\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "http://demo.guru99.com/test/login.html";
		driver.get(baseUrl);

		// Get the WebElement corresponding to the Email Address(TextField)
		WebElement email = driver.findElement(By.id("email"));

		// Get the WebElement corresponding to the Password Field
		WebElement password = driver.findElement(By.name("passwd"));

		email.sendKeys("abcd@gmail.com");
		password.sendKeys("abcdefghlkjl");
		System.out.println("Text Field Set");

		Thread.sleep(2000);
		// Deleting values in the text box
		email.clear();
		password.clear();
		System.out.println("Text Field Cleared");

		// Find the submit button
		WebElement login = driver.findElement(By.id("SubmitLogin"));

		// Using click method to submit form
		email.sendKeys("abcd@gmail.com");
		password.sendKeys("abcdefghlkjl");

		Thread.sleep(2000);
		login.click();
		System.out.println("Login Done with Click");

		Thread.sleep(2000);
		// using submit method to submit the form. Submit used on password field
		driver.get(baseUrl);
		
		driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.name("passwd")).sendKeys("abcdefghlkjl");
		driver.findElement(By.id("SubmitLogin")).submit();
		System.out.println("Login Done with Submit");

		// driver.close();
	}

}
