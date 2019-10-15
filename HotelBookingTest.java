package TvAssignment;

import org.openqa.selenium.Platform;
// com.sun.javafx.PlatformUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HotelBookingTest {

	WebDriver driver = new ChromeDriver();
	
	


	@FindBy(linkText = "Hotels")
	private WebElement hotelLink;

	@FindBy(id = "Tags")
	private WebElement localityTextBox;

	@FindBy(id = "SearchHotelsButton")
	private WebElement searchButton;

	@FindBy(id = "travellersOnhome")
	private WebElement travellerSelection;

	@Test
	public void shouldBeAbleToSearchForHotels() {
		setDriverPath();

		driver.get("https://www.cleartrip.com/");
		hotelLink.click();

		localityTextBox.sendKeys("Indiranagar, Bangalore");

		new Select(travellerSelection).selectByVisibleText("1 room, 2 adults");
		searchButton.click();

		driver.quit();

	}

	 private void setDriverPath() {
	        if (Platform.MAC != null) {
	    		System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32 (1)//chromedriver.exe");
	        }
	        if (Platform.WINDOWS != null) {
	    		System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32 (1)//chromedriver.exe");
	        }
	        if (Platform.LINUX != null) {
	    		System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32 (1)//chromedriver.exe");
	        }
	    }
	 
}



