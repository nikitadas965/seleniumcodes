package AutomatingUIElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdowns_CurrentDateCalendar {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.findElement(By.id("divpaxinfo")).click(); // passengers
		Thread.sleep(2000L);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); // get the first option , default option
		int i=1;
		while(i<5) // loop for increasing the passenger number
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click(); // click on done to close it
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); // get the selected option
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click(); // place of 2nd option of the total tags that come ( one place is present twice(src nd dest)
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']")).click();
		
		// index value given bcz same value is in frst dropdown and if we dont mention the index then
		// it would try to take value of frst dropdown leading to errors
		
		/*alternate method is parent child relationship using xpath..
		 * "{parent xpath}{space}{child xpath}"*
		 * most optimized technique*/
		
		//selects current date in calendar
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
	}
	
	/** here we are opening the dynamic dropdown, waiting for sometime , clicking on the plus sign
	 * to increase the adult count to 5 and then closing the dropdown by clicking on done button**/
	 

}
