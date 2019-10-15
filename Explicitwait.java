package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.findElement(By.xpath("//a[contains(@href,'loadAjax')]")).click();
		WebDriverWait d = new WebDriverWait(driver,5);
		/*d.until(ExpectedConditions.presenceOfElementLocated(By.id("results")));
		System.out.print(driver.findElement(By.cssSelector("#results")).getText());
		System.out.println("success");*/
	d.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='results']"))));
	
		System.out.println(driver.findElement(By.xpath("//div[@id='results']")).getText());
		
		
		
		
		
	}

}
