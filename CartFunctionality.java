package ultimateqatasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartFunctionality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32 (1)//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/viewcart?otracker=PP_GoToCart");
		String text = driver.findElement(By.xpath("//div[contains(text(),'Total Payable')]/span")).getText().substring(1);
		double initial=Double.parseDouble(text);
		
		driver.findElement(By.className("wNrY5O")).click();
		
		/*WebDriverWait d = new WebDriverWait(driver, 20);
		d.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Total Payable')]/span")));*/
		
		String text1 = driver.findElement(By.xpath("//div[contains(text(),'Total Payable')]/span")).getText().substring(1);
		
		double finalamt=Double.parseDouble(text1);
		if(finalamt>initial)
		{
			System.out.println(finalamt);
			System.out.println(initial);
		}
		
		
		
		
		
		

	}

}
