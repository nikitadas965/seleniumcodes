import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentToChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		// syntax-> parent/child
		driver.findElement(By.xpath("//div[@class='SDkEP']/div/input")).sendKeys("Wikipedia");
		driver.findElement(By.xpath("//div[@class='A8SBwf']/div[3]/center/input[1]")).click();
		System.out.println("success");
	}

}
