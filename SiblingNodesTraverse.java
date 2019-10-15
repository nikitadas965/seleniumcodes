import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiblingNodesTraverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/interview.php");
		
		driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[1]")).click();
		driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[3]")).click(); // forward flow
		driver.findElement(By.xpath("//li[@id='tablist1-tab4']/preceding-sibling::li[1]")).click(); // backward flow
	}

}
