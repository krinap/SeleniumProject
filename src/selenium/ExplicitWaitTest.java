package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// alert4

		System.setProperty("webdriver.gecko.driver", "D:\\Learning_Selenium\\Selenium_Jars\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();
		// WebDriver driver = new FirefoxDriver();

		// this line will open the website
		driver.get("http://www.echoecho.com/javascript4.htm");

//		driver.findElement(By.name("B2")).click();
////		
//		Thread.sleep(3000);

		WebDriverWait wait = new WebDriverWait(driver, 50);

		driver.findElement(By.name("B2")).click();

		wait.until(ExpectedConditions.alertIsPresent());

		Alert al = driver.switchTo().alert();

		System.out.println(al.getText());

		// a.accept();

		al.dismiss();
	}

}
