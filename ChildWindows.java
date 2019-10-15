package ActionClassandIFrames;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChildWindows {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32 (1)//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions a=new Actions(driver); // enables us to hover and do keyboard actions
		a.moveToElement(driver.findElement(By.xpath("//a[@tabindex='21']"))).keyDown(Keys.CONTROL).click().build().perform();
		Set<String> ids=driver.getWindowHandles(); /// taken the window handles id into a set
		String parentid=driver.getWindowHandle();//storing the id of parent window
		Iterator<String> i = ids.iterator(); // iterator for traversing thru the child windows and parent window
		
		String childid= i.next(); //getting the child windows
		driver.switchTo().window(childid); // switching to child window 
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		while(i.hasNext())
		{
			driver.switchTo().window(i.next());
			String title=driver.getTitle();
			if(title.equals("required title"))
			{
				System.out.println(title);
			}
			
		}
		
		
		
		
	}

}
