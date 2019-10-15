package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.id("checkBoxOption1")).click();
		
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		Thread.sleep(2000);
		driver.findElement(By.id("checkBoxOption1")).click();
		
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
	
		System.out.println(	driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		

	}

}
