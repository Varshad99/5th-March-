package misc;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOftables {

	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Selinium\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
			
		   driver.manage().window().maximize();
		  
		   driver.get("https://webdriveruniversity.com/Data-Table/index.html");
		  // Thread.sleep(500);
		
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		   
		   List<WebElement> table = driver.findElements(By.tagName("Table")); 
		
		   System.out.println(table.size());
		   
		   System.out.println("========================");
		
		   Iterator<WebElement> it = table.iterator();
		   while(it.hasNext())
		   {
			   System.out.println(it.next().getText());
		   }
		
		   System.out.println("========================");
			for(WebElement g:table)
			{
				System.out.println(g.getText());
			}
		
		}

}
