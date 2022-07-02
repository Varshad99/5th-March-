package misc;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableReading {

	public static void main(String[] args) {
              System.setProperty("webdriver.chrome.driver", "K:\\chromedriver_win32 (1)\\chromedriver.exe");
		
	          WebDriver driver = new ChromeDriver();
		
		      driver.get("https://vctcpune.com/selenium/practice.html");
		      driver.manage().window().maximize();	
		     
		      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	
		      List<WebElement> NoOfRow = driver.findElements(By.xpath("//tr"));
		      List<WebElement> NoOfColumn = driver.findElements(By.xpath("//th"));
		      
		      int totalNoOfRow = NoOfRow.size();
		      int totalNoOfColumn = NoOfColumn.size();
		      
		      System.out.println(totalNoOfRow);
		      System.out.println(totalNoOfColumn);
		      //we want print row and column using nested loop
		      for(int i=1;i<=totalNoOfRow;i++)
		      {
		    	  for(int j=1;j<=totalNoOfColumn;j++)
		    	  {
		    		  if(i==1)
		    		  {
		    			 String text = driver.findElement(By.xpath("//table//tr["+i+"]//th["+j+"]")).getText();
		    			 System.out.print(text+" ");
		    		  }
		    		  else
		    		  {
		    			 String text1 = driver.findElement(By.xpath("//table//tr["+i+"]//td["+j+"]")).getText();
		    			 System.out.print(text1+" "); 
		    		  }
		    	  }
		     System.out.println();
		      }
		}

}
