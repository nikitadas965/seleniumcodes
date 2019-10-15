import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test123 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		Thread.sleep(5000);		
		driver.manage().window().maximize();
		/*String val = driver.findElement(By.id("continents")).getText();
		//System.out.println(val);
		Select sel = new Select(driver.findElement(By.id("continents")));
		String a = sel.getFirstSelectedOption().getText();
		System.out.println(a);*/
		driver.findElement(By.partialLinkText("Partial Link Test"));
		driver.findElement(By.name("firstname")).sendKeys("nikita");
		driver.findElement(By.id("lastname")).sendKeys("das");
		driver.findElement(By.id("buttonwithclass")).click();
		List<WebElement> list = driver.findElements(By.xpath("//input[@type='radio']"));
		for(int i=0;i<list.size();i++)
		{
			String text = list.get(i).getAttribute("value");
			if(text.equalsIgnoreCase("Female"))
			{
				list.get(i).click();
			}
		}
		
		



	}

}
