package InterviewImp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Screenshot {
/**how to take screenshot and 
 * @throws IOException */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //screenshot taken and copied in src object
		FileUtils.copyFile(src,new File("C://Users//nikitdas.CORP//Desktop//selenium//screenshot.png")); // copies to local
	}

}
