package AutomatingUIElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**FIND //BENGALURU INTERNATION AIRPORT in the list. If it is present print in suggestive box. Test
 * should continue 3 times , if not found then print 'not found'*/
public class AUtoDuggestiveDropdownsValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32 (1)//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		int i=0;
		driver.get("https://ksrtc.in/oprs-web/guest/home.do");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
		 driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		 
		 
		//Javascript DOM can extract hidden elements
		//because selenium cannot identify hidden elements - (Ajax implementation)
		//investigate the properties of object if it have any hidden text
		 
		//JavascriptExecutor
		 JavascriptExecutor js= (JavascriptExecutor)driver;
		 String script = "return document.getElementById(\"fromPlaceName\").value;";
		 String text = (String) js.executeScript(script);
		 System.out.println(text);
		 while(!text.equalsIgnoreCase("BEGALURU INTERNATION AIRPORT"))
		 {
			 driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
			 text = (String) js.executeScript(script);
			 System.out.println(text);
			 i++;
			 if(i>3)
			 {
				 break;
			 }
			
		 }
		 if(i>3)
		 {
			 System.out.println("not found");
		 }
		
				
	}

}
