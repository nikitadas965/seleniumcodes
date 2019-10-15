package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32//chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.cleartrip.com/");
	driver.findElement(By.id("DepartDate")).click();
	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ")).click();
	
	Select s=  new Select(driver.findElement(By.id("Adults")));
	s.selectByValue("3");
	
	Select sel= new Select(driver.findElement(By.id("Childrens")));
	sel.selectByValue("4");
	driver.findElement(By.id("MoreOptionsLink")).click();
	Select select= new Select(driver.findElement(By.id("Class")));
	select.selectByValue("First");
	
	driver.findElement(By.xpath("//input[@id='AirlineAutocomplete']")).sendKeys("abcd");
	
	driver.findElement(By.cssSelector("#SearchBtn")).click();
	Thread.sleep(2000L);
	System.out.println(	driver.findElement(By.id("homeErrorMessage")).getText());

	

	}

}
