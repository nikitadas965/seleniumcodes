package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32 (1)//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qaclickacademy.com/practice.php");
		// no. of rows
		// no of cols
		// second row 's data
		
		 	WebElement table=driver.findElement(By.cssSelector(".table-display"));
		 	System.out.println(table.findElements(By.tagName("tr")).size()); // row count
		 	System.out.println(table.findElements(By.tagName("th")).size()); // col count
		 	List<WebElement> secondRow= driver.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		 	System.out.println(secondRow.get(0).getText());
		 	System.out.println(secondRow.get(1).getText());
		 	System.out.println(secondRow.get(2).getText());
		 	
		 			



		 	//System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		 	
	}

}
