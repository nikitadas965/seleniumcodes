package AutomatingUIElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
	//	driver.findElement(By.xpath("//input[@value='Butter']")).click();
		//get radio button 's count
		int count = driver.findElements(By.xpath("//input[@name='group2']")).size();
		for(int i=0;i<count;i++)
		{
			String text = driver.findElements(By.xpath("//input[@name='group2']")).get(i).getAttribute("value");
			if(text.equals("Beer")) 
			{
				driver.findElements(By.xpath("//input[@name='group2']")).get(i).click();
			}
		}
		
	
/*GETTING THE COUNT OF RADIO BUTTONS AND THEN SELECTING OUR DESIRED BUTTON WHEN THE ALL THE ATTRIBUTES ARE SAME */
	}

}
