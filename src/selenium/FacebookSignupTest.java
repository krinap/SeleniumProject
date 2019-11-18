package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignupTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Learning_Selenium\\Selenium_Jars\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();
		// WebDriver driver = new FirefoxDriver();

		// this line will open the website
		driver.get("https://www.facebook.com/");

		// typelastname
		driver.findElement(By.name("lastname")).sendKeys("parikh");
		// 10 digit number
		driver.findElement(By.name("reg_email__")).sendKeys("8998878990");
		// password
		driver.findElement(By.name("reg_passwd__")).sendKeys("1234");

		// select month
		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		// s.selectByIndex(5); // this will select from the index
		m.selectByValue("11");

		// select day
		WebElement day = driver.findElement(By.id("day"));
		Select d = new Select(day);
		// s.selectByIndex(5); // this will select from the index
		d.selectByValue("3");

		// select year

		WebElement year = driver.findElement(By.id("year"));

		Select s = new Select(year);
		// s.selectByIndex(5); // this will select from the index
		s.selectByValue("1993"); // every option has a value so we can use the value
		// s.selectByVisibleText("Antiques");
		
		
		 WebElement female = driver.findElement(By.xpath("//input[@value='1']"));							
	     WebElement male = driver.findElement(By.xpath("//input[@value='2']"));	
	     WebElement custom = driver.findElement(By.xpath("//input[@value='-1']"));	
	     
	     female.click();
	     
	     System.out.println("Female is selected");	
	     
	     

		// click signup
		driver.findElement(By.name("websubmit")).click();

		Thread.sleep(3000);
		// verify error message
		String actualMsg = "What’s your name?";

		String expectedMsg;

		expectedMsg = driver.findElement(By.xpath("(//div[contains(@id,'js_')])[2]")).getText();

		System.out.println(expectedMsg);

		if (actualMsg.equals(expectedMsg)) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Failed");
		}

	}

}
