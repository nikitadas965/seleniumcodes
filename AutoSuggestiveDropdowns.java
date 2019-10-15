package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32 (1)//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		int i=0;
		driver.get("https://qaclickacademy.com/practice.php");
		driver.findElement(By.id("autocomplete")).sendKeys("IND");
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

		JavascriptExecutor js= (JavascriptExecutor)driver;
		String script=" return document.getElementById(\"autocomplete\").value;";

		String text = (String) js.executeScript(script);

		while(!text.equalsIgnoreCase("INDIA"))
		{
			i++;
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
			System.out.println(text);
			if(i>2)
			{
				break;
			}
		}

		if(i>2)
		{
			System.out.println("failed");
		}

	}

}
