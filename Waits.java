package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/** asks to wait implicitly. Global scope **/ // IMPLICIT WAIT
		
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		driver.findElement(By.id("H-destination")).sendKeys("nyc");
		driver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
		driver.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);

		//EXPLICIT WAIT
		WebDriverWait d=new WebDriverWait(driver,20);
		/** expected conditions has all the methods **/
		d.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='resultsContainer']/section/article[1]")));
		//Thread.sleep(5000L);

		driver.findElement(By.xpath("//div[@id='resultsContainer']/section/article[1]")).click();
		/*** here an object 'd' is created on driver which is explicitly affecting only few mentioned elements**/
		
		
		//FLUENT WAIT
		
		FluentWait<WebDriver>  wait= new FluentWait<WebDriver>(driver);
		wait.pollingEvery(1,TimeUnit.SECONDS);
		wait.withTimeout(10,TimeUnit.SECONDS);
	}

}
