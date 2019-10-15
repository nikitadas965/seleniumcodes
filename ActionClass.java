package ActionClassandIFrames;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	/*Action class enables the user to perform mouse hover actions and keyboard actions*/
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32 (1)//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-prime']"))).build().perform();
		//highlight
		action.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

		System.out.println("success");


		driver.get("http://todomvc.com/examples/typescript-react/#/");
		driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys("hey",Keys.ENTER);
		driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys("bey",Keys.ENTER);	
		driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys("yey",Keys.ENTER);
		driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys("wey",Keys.ENTER);
		driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys("bye",Keys.ENTER);

		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='todo-list']"));
		int size=list.size();
		for(int i=0;i<size;i++)
		{
			String text =  list.get(i).getText();
			Thread.sleep(4000);
			if(text.equals("bye"))
			{
				Actions a = new Actions(driver);
				a.moveToElement(driver.findElement(By.xpath("//button[@class='destroy']"))).click().build().perform();

			}

			Scanner sc = new Scanner(System.in);
			int index=sc.nextInt();
			Iterator<WebElement> itr = list.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}

			System.out.println(list.get(index));
		}



		System.out.println("end");


	}
}
