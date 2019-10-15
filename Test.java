import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {

		/*System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/interview.php");
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//li[text()=' Selenium ']")).click();

		driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();

		System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));*/

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		for(int i=1;i<=N;i++)
		{
			if(i%5==0 && i%7==0)
			{                                                                                                                                             }
			if(i%7==0 && i%7==0)
			{
				System.out.println("Bar");

			}
			if(i%5==0 && i%7==0)
			{
				System.out.println("FooBar");

			}
			else
			{
				System.out.println(i);
			}
		}

	}

}
