package AutomatingUIElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndToEnd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		List<WebElement> list = driver.findElements(By.cssSelector("li[class*='react-autosuggest__suggestion']"));
		int count = list.size();
		for(int i=0;i<count;i++)
		{
			String text = list.get(i).getAttribute("value");
			if(text.contains("Kolkata"))
			{
				list.get(i).click();
				System.out.println(text);
			}
					
		}
		
/*
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		Thread.sleep(2000L);
		
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		//driver.findElement(By.id("Div1")).getAttribute("style");
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertTrue(true);
		}
	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
	driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		
		for(int i=1;i<6;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
			
		}
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "6 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("btnclosepaxoption")).click();
	
		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		Select select=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		select.selectByValue("AED");
		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		System.out.println("success");
*/
		
		

	}

}
