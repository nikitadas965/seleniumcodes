package InterviewImp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablegrid {
/**Calculate the scores from the score card and return the sum and also check whether the displayed total is correct or not*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://Users//nikitdas.CORP//Desktop//selenium//chromedriver_win32 (1)//chromedriver.exe");

	
		
			// TODO Auto-generated method stub
			int sum=0;
			System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");

			//limiting the scope
			WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']")); 
			
		// taking the number of rows
			int rowcount= table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size();
			// taking the number of data present in that column
			int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size(); // marking the score column

			// looping to traverse all the data in that col
			for(int i=0;i<count-2;i++)
			{
				//storing in value
			String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
				// parsing string to int
			int valueinteger=  Integer.parseInt(value);
			
			// adding the numbers, making the sum
			sum=sum+valueinteger;//103
			}
			//System.out.println(sum);

			//extra is outside the scope
			String Extras=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText(); // sibling to sibling node
			
			
			int extrasValue=Integer.parseInt(Extras);
			int TotalSumValue=sum+extrasValue;
			System.out.println(TotalSumValue);


			String ActualTotal=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
			int ActualTotalVAlue=Integer.parseInt(ActualTotal);
			if(ActualTotalVAlue==TotalSumValue)
			{
			System.out.println("Count Matches");
			}
			else
			{
			System.out.println("count fails");
			}
			}
	
}


/////////////////////////////////////////////////////////////


/**driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22481/dc-vs-rcb-46th-match-indian-premier-league-2019");

int sum=0;

//1. LIMIT THE SCOPE

WebElement tableDriver = driver.findElement(By.xpath("//div[@class='cb-col cb-col-67 cb-scrd-lft-col html-refresh ng-isolate-scope']"));

//2. FIND THE ROW COUNTS

int rowCount= tableDriver.findElements(By.cssSelector("#cb-col cb-col-100 cb-scrd-itms")).size();

//3.GO TO THE DESIRED COL/ELEMENT BY PARENT SIBLING XPATH CONCEPT

int count = tableDriver.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();





//4. START LOOPING FOR GETTING TEH VALUES

for(int i=0;i<count-2;i++) // -2 cz we want too only calculate the scores and avoid the extras

{

// store the scores

String scores = tableDriver.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3")).get(i).getText();

// take all the scores and put it into a variable

int value = Integer.parseInt(scores); // convert the numbers into int from string

sum=sum+value; // add the scores

}

System.out.println(sum);

//EXTRAS and TOTAL

String extras= driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();

//ADDING THE EXTRA INTO

int extraVal = Integer.parseInt(extras);

int totalCount = extraVal+sum;

System.out.println(totalCount);



//CHECK WHETHER THE TOTAL AND ACTUAL ARE SAME OR NOT

String actual = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();

int actualVal = Integer.parseInt(actual);

if(actualVal == sum)

{

System.out.println("done");

}

else

{

System.out.println("error");

}

*/
