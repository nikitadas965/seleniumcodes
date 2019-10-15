import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("#username")).sendKeys("test");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("123");

		driver.findElement(By.cssSelector("#Login")).click();
		System.out.println("success");
		
		/*css can be written in many ways:
		 * 1. tagname[attribute='value']
		 * 2. #id
		 * 3. .class (whenever there is space between class name, replace the gaps with "."  
		 * EG.... -> .label.value (if in the inspect element it is class="label value"
		 *  will not accept class names with more than 1 gaps*/
				
	}

}
