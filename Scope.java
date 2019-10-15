package Synchronization;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//INTERVIEW QUS
//give me the count of links on the page
//count of links in footer section
//give total links of first column

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
/******************************************************************/
//give me the count of links on the page
//count of links in footer section
// count the links of first column		
		// check if the column 's links are working or not
		
		/**WE ARE LIMITING THE SCOPE OF DRIVERS TO GET OUR LINKS*/	
		
/*************************************************************************/		
		System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32 (1)//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://qaclickacademy.com/practice.php");
		System.out.println(	driver.findElements(By.tagName("a")).size());
		
		//count of links in footer section
		
		/**we will create a mini driver for this footer section to limit the scope of driver*/
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		//  this footerDriver plays the role of the driver for footer part
		
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
	
		// count the links of first column
		
		WebElement columnDriver=footerDriver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]"));
	
		int totalLinks=columnDriver.findElements(By.tagName("a")).size();
		
		for(int i=1;i<totalLinks;i++)
		{
			//String clickontab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));  
			Thread.sleep(5000L);
			
			/*Here we are clicking on the links on separate tabs by finding the links first, iterating on them and clicking on the links*/
			
			// NOW we need to fetch the titles of the pages
			
		
		}
		Set<String> set = driver.getWindowHandles(); // 4
		Iterator<String> it=set.iterator(); // for traversing
			
			while(it.hasNext())
			{ 
				driver.switchTo().window(it.next()); // till it finds the if is present
				System.out.println(driver.getTitle());
				
				/* here we are iterating through all the windows and fetching the title */
			}
		
		
	
		
		
	}

}
