package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
        System.setProperty("webdriver.gecko.driver", "D:\\Learning_Selenium\\Selenium_Jars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		//driver.findElement(By.linkText("About")).click();
		
		//we can use the keywords
		driver.findElement(By.partialLinkText("Abo")).click();
		
		Thread.sleep(3000);
		//driver.findElement(By.linkText("Store")).click();
		
		String expectedTitle = "About | Google";
		String actualtTitle = driver.getTitle();
		
		
		System.out.println(actualtTitle);
		
		if(expectedTitle.equals(actualtTitle))
		{
		System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		
		
	}

}
