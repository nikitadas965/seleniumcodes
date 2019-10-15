import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/* All concepts*/
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32 (1)//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.thoughtworks.com");
		driver.findElement(By.cssSelector("#search-bar-input")).sendKeys("Quality Analyst");
		driver.findElement(By.xpath("//i[@class='icon-search']")).click();
	driver.findElement(By.xpath("//div[@class='button-group scroll-effect']/div[4]")).click();
		driver.findElement(By.xpath("//div[@class='button-group-item active']/following-sibling::div[1]")).click();
		driver.findElement(By.xpath("//button[text()='Books']")).click();
		driver.findElement(By.xpath("//button[contains(@value,'new')]")).click();
		//css selector for regular exp button[value*='new']
		System.out.println(driver.findElement(By.xpath("//button[contains(@value,'new')]/parent::div")).getText());
		
		driver.findElement(By.xpath("//ul[@id='main-menu']/li[2]")).click();
		driver.findElement(By.cssSelector(".secondary-menu__item")).click();
		driver.findElement(By.xpath("//ul[@class='secondary-menu']/li[2]")).click(); // digital
		driver.findElement(By.xpath("//li[@class='secondary-menu__item']/following-sibling::li[2]")).click(); //gvt
		
		System.out.println(driver.findElement(By.xpath("//li[@class='secondary-menu__item']/parent::ul")).getText());
	
		System.out.println("success");
		
		
	}
	/**xpath,css selector, parent to child traversal, sibling to sibling traversal, get element by text, child to parent
	 * */
	
}
