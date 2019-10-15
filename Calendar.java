package AutomatingUIElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32 (1)//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();
		
		while(!driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='datepicker-switch']")).getText().contains("June"))
		{
			driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='next']")).click();
		}
		
		// to choose June 27
		
		
		/**Break into chunks and then search*/
	
		// grab the common att, put into list, iterate
		List<WebElement> list= driver.findElements(By.className("day"));
		int count = list.size();
		for(int i=0;i<count;i++)
		{
			String text = list.get(i).getText();
			if(text.equalsIgnoreCase("27"))
			{
				
				driver.findElements(By.className("day")).get(i).click();
				
				break;
			}



		}
		/*driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//div[@class='fsw_inputBox dates inactiveWidget ']")).click();
		// for month
		
		while(!driver.findElement(By.xpath("//div[contains(text(),'May 2019')]")).getText().contains("May"))
		{
			driver.findElement(By.cssSelector(".DayPicker-NavButton.DayPicker-NavButton--next")).click();
		}
		List<WebElement> list= driver.findElements(By.cssSelector(".DayPicker-Day"));
		int count = driver.findElements(By.cssSelector(".DayPicker-Day")).size(); // storing total number of attributes under this
		for(int i=0;i<count;i++) // traversing thru the options
		{
			String text = driver.findElements(By.cssSelector(".DayPicker-Day")).get(i).getText(); 
			if(text.equalsIgnoreCase("30"))
			{
				driver.findElements(By.cssSelector(".DayPicker-Day")).get(i).click();
				break;
			}
		}
		*/
		
		
		 
	}

}
