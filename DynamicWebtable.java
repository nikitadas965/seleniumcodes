package ultimateqatasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32 (1)//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		int countofrows= driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr")).size();
		String value="";
		for(int i=1;i<countofrows;i++)
		{
			/*value=driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+i+"]/th")).getText();
					 if(value.equalsIgnoreCase("Clock Tower Hotel"))
					 {
						int countofcols=driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+i+"]/td")).size();
						for(int j=1;j<=countofcols;j++)
						{
							String colvalue=driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+i+"]/td["+j+"]")).getText();
							System.out.println(colvalue);
						}
					 }*/

			value=driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+i+"]/td[2]")).getText();
			if(value.equalsIgnoreCase("Dubai"))
			{
				int countofcols=driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+i+"]/td")).size();

				for(int j=1;j<countofcols;j++)
				{
					String colvalue=driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+i+"]/td["+j+"]")).getText();
					System.out.println(colvalue);
				}
			}
		}


		/*WebElement cart=  driver.findElement(By.xpath("//div[@class='sc-list-body sc-java-remote-feature']"));
				   int count = cart.findElements(By.xpath("//div[@class='a-row sc-list-item sc-list-item-border sc-java-remote-feature']")).size();
				   String q1=driver.findElement(By.xpath(" //span[@id='a-autoid-0-announce']")).getText();
				   System.out.println(q1);*/


	}

}
