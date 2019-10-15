import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffEndToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//a[contains(@href,'register')]")).click();
		driver.findElement(By.cssSelector("input#txtlogin")).sendKeys("test");
		driver.findElement(By.cssSelector("input[name*='nex']")).click();
		System.out.println("success");
		/*driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("test123");
		driver.findElement(By.cssSelector("input#password")).sendKeys("123");
		driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();*/
	}

}
