import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32//chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.get("http://facebook.com");
/*driver.findElement(By.id("email")).sendKeys("FirstTest");
driver.findElement(By.name("pass")).sendKeys("123456");
//driver.findElement(By.linkText("Forgotten account?")).click();
*/

//driver.findElement(By.cssSelector("#email")).sendKeys("email");
driver.findElement(By.className("inputtext")).sendKeys("email");
driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("1234");
driver.findElement(By.xpath("//*[@id=\'login_form\']/table/tbody/tr[3]/td[2]/div/a")).click();

	}

}
