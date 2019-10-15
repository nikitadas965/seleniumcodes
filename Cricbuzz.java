package ultimateqatasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
		int sum=0;
		
		WebElement table=driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		List<WebElement> list = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"));
		int count=list.size();
		for(int i=0;i<count-2;i++)
		{
			String value=list.get(i).getText();
			
			int valueInInt=Integer.parseInt(value);
			// for char its int valueinint=Character.getNumericValue(value);
			sum=sum+valueInInt;
		}
		
		String extraValue= table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int extra=Integer.parseInt(extraValue);
		
		sum=sum+extra;
		
		System.out.println(sum);
		
		driver.quit();
		
		

		

	}

}
