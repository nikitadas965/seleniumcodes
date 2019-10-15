package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Nested Frames")).click();
		System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.switchTo().frame(0);
		driver.switchTo().frame(1);
//	driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-middle']")));
	System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
	
		///////////////////////////////////////////////////////////////////////////////////////////////
	/*driver.findElement(By.linkText("Nested Frames")).click();



driver.switchTo().frame("frame-top");



driver.switchTo().frame("frame-middle");



System.out.println(driver.findElement(By.id("content")).getText());

*/
	}

}
