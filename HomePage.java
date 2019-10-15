package ultimateqatasks;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HomePage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32 (1)//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[contains(text(),'Shop')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();

		WebElement sliders=driver.findElement(By.xpath("//div[@class='themify_builder_sub_row clearfix gutter-default   sub_row_1-0-2']"));
		int count = sliders.findElements(By.xpath("//div[contains(@id,'text-22-sub_row_1-0-2-')]")).size();
		Assert.assertEquals(count, 3);
		Thread.sleep(5000L);
		/*JavascriptExecutor javascript = (JavascriptExecutor) driver;
		
		for(int i=1;i<count;i++)
		{
			sliders.findElements(By.xpath("//div[contains(@class,'module module-text text-22-sub_row_1-0-2-')]")).get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
			javascript.executeScript("var element = document.querySelector('//div[contains(@id,'text-22-sub_row_1-0-2-')]'); element.value = 'whatever';");

		}
	
		Set<String> set = driver.getWindowHandles();
		
		Iterator<String> itr = set.iterator();
		String bookaddid=itr.next();
		while(itr.hasNext())
		{
			driver.switchTo().window(itr.next());
			System.out.println(driver.getTitle());
		}
		
		driver.switchTo().window(bookaddid);*/
		
		
		driver.findElement(By.xpath("//div[@id='text-22-sub_row_1-0-2-0-0']")).click();
		
		driver.findElement(By.xpath("//button[@class='single_add_to_cart_button button alt']")).click();
		driver.findElement(By.xpath("//a[@class='button wc-forward']")).click();
		String text=  driver.findElement(By.xpath("//td[@class='product-name']")).getText();
		Assert.assertEquals(text, "Selenium Ruby");
		
		String subtotal = driver.findElement(By.xpath("//tr[@class='cart-subtotal']//td")).getText().substring(1);
	
		
		String total = driver.findElement(By.xpath(" //tr[@class='order-total']//td")).getText().substring(1);
		
		double sub=Double.parseDouble(subtotal);
		double tot= Double.parseDouble(total);
		if(sub<tot)
		{
			System.out.println(" cool");
		}
		else
		{
			System.out.println("try agan");
		}
		
		driver.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward']")).click();
		
		
		
		
		






	}

}
