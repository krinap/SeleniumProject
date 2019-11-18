package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScotiaBankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Learning_Selenium\\Selenium_Jars\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();
		// WebDriver driver = new FirefoxDriver();

		driver.get(
				"https://www.scotiabank.com/ca/en/personal.html?cid=ps_fc0bd09f0661026285d9616e707504339a99c064&ds_rl=1249487&gclid=EAIaIQobChMIqOGfq6vn5AIVk8BkCh1GTAIKEAAYASAAEgK15fD_BwE&gclsrc=aw.ds");

		List<WebElement> menulist = driver.findElements(By.xpath("//ul[@role='menubar']/li/a/span"));

		System.out.println(menulist.size());

		for (int i = 0; i < menulist.size(); i++) {
			// not printing the text
			System.out.println(menulist.get(i).getText());
		}

		// FooterMenu

		WebElement menu = driver.findElement(By.className("f--links"));

		List<WebElement> fmenulist = menu.findElements(By.tagName("a"));

		System.out.println(fmenulist.size());

		for (int i = 0; i < fmenulist.size(); i++) {
			// not printing the text
			System.out.println(fmenulist.get(i).getText());
		}

	}
	
	
	
	//

}
