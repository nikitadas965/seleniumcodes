import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		/*driver.findElement(By.id("username")).sendKeys("hello"); // email
		driver.findElement(By.name("pw")).sendKeys("12345"); //password
		//driver.findElement(By.id("Login")).click();
*/		
	/*************same using xpath and css selectors ******/
		
		driver.findElement(By.cssSelector("#username")).sendKeys("hello");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("12345");
		
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click(); //login button
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
	}
}
