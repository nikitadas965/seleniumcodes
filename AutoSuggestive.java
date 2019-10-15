package AutomatingUIElements;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		WebElement source = driver.findElement(By.id("gosuggest_inputSrc"));
		source.clear();
		source.sendKeys("MUM");
		Thread.sleep(2000);
		System.out.println(Thread.currentThread());
		source.sendKeys(Keys.ARROW_DOWN);
		source.sendKeys(Keys.ENTER);
		
		
		WebElement dest = driver.findElement(By.id("gosuggest_inputDest"));
		dest.clear();
		dest.sendKeys("DEL");
		Thread.sleep(2000);
		int i=1;
		while(i<3) {
		dest.sendKeys(Keys.ARROW_DOWN);
		i++;
		}
		dest.sendKeys(Keys.ENTER); 
		System.out.println("success");
	}

}
