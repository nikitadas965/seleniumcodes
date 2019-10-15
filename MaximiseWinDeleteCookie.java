package InterviewImp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximiseWinDeleteCookie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32 (1)//chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); // delete all cookies
		driver.manage().deleteCookieNamed("sessionCookie"); // to delete  a particular cookie
		// session cookie is deleted and secure login is logged out and then home page navigation
		
		// then click on any link, it will take you to login page
		driver.get("https://www.google.com/");
	}

}
