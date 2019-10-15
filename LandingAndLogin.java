package ultimateqatasks;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LandingAndLogin {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		int count=driver.findElements(By.xpath("//input[@class='radioButton']")).size();
		for(int i=0;i<count;i++)
		{
			String text = driver.findElements(By.xpath("//input[@class='radioButton']")).get(i).getAttribute("value");
			if(text.equals("radio3")) 
			{
				driver.findElements(By.xpath("//input[@class='radioButton']")).get(i).click();
			}
		}

		// webtable

		/*	WebElement tabledriver = driver.findElement(By.xpath("//table[@class='table-display']"));
		List<WebElement> list = tabledriver.findElements(By.xpath("//table[@id='product']/tbody[1]/tr[2]/td[3]"));*/
		WebElement table=driver.findElement(By.cssSelector(".table-display"));
		int colcount=table.findElements(By.xpath("//body//tr[2]/td")).size();
		System.out.println(colcount);

		WebElement footer=driver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]"));
		int countOfLinks=footer.findElements(By.tagName("a")).size();
		for(int i=1;i<countOfLinks;i++)
		{
			footer.findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		}

		String tr1=driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();
		Iterator<String> itr = set.iterator();

		while(itr.hasNext())
		{
			driver.switchTo().window(itr.next());
			System.out.println(driver.getTitle());

		}

		driver.switchTo().window(tr1);
		System.out.println(driver.getTitle());



		System.out.println("end");




	}

}
