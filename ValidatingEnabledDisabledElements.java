package AutomatingUIElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ValidatingEnabledDisabledElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

		/****************************************************************************/
		/*IF YOU WANT TO SEE WHETHER AN ELEMENT IS DISABLED OR ENABLED , JUST TAKE THE ATTRIBUTE
		 * WHICH IS GETTING CHANGED ON ENABLING OR DISABLING IT, PULL THAT AND APPLY VALIDATION*/

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click(); // clicking on one trip and making the calendar box disabled
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));//pulling the style attribute having the changing 
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) // if the changing atttribute 's value is true then test passes or else fails
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}

	}

}
