package AutomatingUIElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		/*Select class is used to work with dropdowns. Has some pre defined methods. It loads all the 
		 * methods and apply on this web element
		 * ONLY FOR STATIC DROPDOWNS*/
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		// passing the webelement in select so that the object can know where to work on
		s.selectByValue("USD"); // id 
		// goes to the dropdown and clicks on USD.
		s.selectByIndex(2); 
		s.selectByVisibleText("USD");
		List<WebElement> list = s.getOptions();
		int count = list.size();
	String val=	list.get(count).getText();
		
		
		
	}

}
