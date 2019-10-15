package ultimateqatasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 http://admin:admin123@xyz.com
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//li[@class='_1KCOnI _2BfSTw _1h5QLb _3ZgIXy']/a[contains(text(),'Mobiles')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search Brand']")).sendKeys("Gionee");
		driver.findElement(By.xpath("//section[@class='_1gjf4c D_NGuZ']/div[2]/div[1]/div[2]/div[1]/div[1]/label[1]/div[1]")).click();
	String text=	driver.findElement(By.xpath("//div[@class='_3wU53n']")).getText();
	System.out.println(text);
	
	
		
		
		

	}

}
