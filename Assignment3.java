package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://qaclickacademy.com/practice.php");
		driver.findElement(By.cssSelector("#checkBoxOption3")).click(); // check box selected
		String label= driver.findElement(By.xpath("//label[@for='honda']")).getText();
		System.out.println(label);
	
		Select select = new Select(driver.findElement(By.id("dropdown-class-example")));
		
		select.selectByVisibleText(label);
		driver.findElement(By.id("name")).sendKeys(label);
		driver.findElement(By.id("alertbtn")).click();
		String alert=driver.switchTo().alert().getText();
	if(alert.contains(label))
	{
		System.out.println("verified");
	}
	else
	{
		System.out.println("failed");
	}
		
System.out.println("end");
	}

}
