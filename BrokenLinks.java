package InterviewImp;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32 (1)//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.co.in/");
        List<WebElement> list = driver.findElements(By.tagName("a"));
       int count= list.size();
        for(int i=0;i<count;i++)
        {
        	
        	String linkurl=list.get(i).getAttribute("href");
        	verifyLinks(linkurl);
        }

	}

	public static void verifyLinks(String linkurl) {
		// TODO Auto-generated method stub
		
		try {
			URL url = new URL(linkurl);
			HttpURLConnection con = (HttpURLConnection)url.openConnection(); // connection getting established
			con.setConnectTimeout(3000);
			con.connect(); // connection done
			
			if(con.getResponseCode()==200)
			{
				System.out.println(con.getResponseMessage());
			}
			if(con.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
			{
				System.out.println(con.getResponseMessage());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
/*We can handle hidden elements by using javaScript executor
(JavascriptExecutor(driver)).executeScript("document.getElementsByClassName(ElementLocator).click();");
*/
		
		
		
		
	}

}
