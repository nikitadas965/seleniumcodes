package ActionClassandIFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		// identify the frame
		/**Two methods to access the frame, by index and by web element*/
		//BY INDEX
		System.out.println(driver.findElements(By.tagName("iframe")).size()); // gives total frames in the page
		//driver.switchTo().frame(0); // BY INDEX
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']"))); // BY WEB ELEMENT
		// DRAG AND DROP IN THE FRAME
		
		Actions action= new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
				WebElement target= driver.findElement(By.id("droppable"));
		action.dragAndDrop(source, target).build().perform();
		
		//without using drag&drop
		action.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();
		//  we need to switch back to my original window after all the actions of frames is completed
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Accept")).click();
		

	}

}
