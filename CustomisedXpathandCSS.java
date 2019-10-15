import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomisedXpathandCSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		//syntax= ("//tagname[@attribute='value']")
		driver.findElement(By.xpath("//input[@class='inputtext']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234"); //xpath
		
	//	driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		//syntax = ("tagname[attribute='value']")
		driver.findElement(By.cssSelector("input[aria-label='Log In']")).click(); // css selector 
	
	}

}
