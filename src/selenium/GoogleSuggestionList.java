package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSuggestionList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\Learning_Selenium\\Selenium_Jars\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();
		// WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		//type canada
		
		WebElement enterText = driver.findElement(By.name("q"));
		enterText.sendKeys("canada");
		
		// thread 
		Thread.sleep(3000);
		// count the suggestion size 
		
		List<WebElement> listofSuggestionText = driver.findElements(By.xpath("//ul[@role=\"listbox\"]/li"));
		
		System.out.println(listofSuggestionText.size());
		
		
		// print text
		
		for(int i = 0; i < listofSuggestionText.size(); i++)
		{
			System.out.println(listofSuggestionText.get(i).getText());
			
			if(!(listofSuggestionText.get(i).getText().contains("canada")))
			{
				System.out.println("Test Failed");
			}
			
		}

	}

}
