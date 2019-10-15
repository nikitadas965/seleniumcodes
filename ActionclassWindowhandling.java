package Assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionclassWindowhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32//chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("http://the-internet.herokuapp.com/");
	Actions action=new Actions(driver);
	driver.findElement(By.xpath("//a[@href='/windows']")).click();
driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
	Set<String> ids=driver.getWindowHandles();
	Iterator<String> i = ids.iterator();
	String parentid= i.next();
	String childid=i.next();
	driver.switchTo().window(childid);
	System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
	
	driver.switchTo().window(parentid);
	System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
	
	
	}
	//////////////////////////////////////////////
	///*** another approach ****///
	
	/*  Initialize webdriver
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

//        Navigate to demo page
        driver.get("http://the-internet.herokuapp.com/");

//        Open Multiple Windows example
        driver.findElement(By.linkText("Multiple Windows")).click();

//        Open new window
        driver.findElement(By.linkText("Click Here")).click();

//        Find open windows
        Set<String> openWindows = driver.getWindowHandles();
        Iterator<String> iterator = openWindows.iterator();

        String parentId = iterator.next();
        String childId = iterator.next();

//        Switch to child window and get text
        driver.switchTo().window(childId);
        System.out.println(driver.findElement(By.cssSelector("h3")).getText());

//        Switch back to parent window and get text
        driver.switchTo().window(parentId);
        System.out.println(driver.findElement(By.cssSelector("h3")).getText());

    }*/

}
