package misc;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinks {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Selinium\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
			
		   driver.manage().window().maximize();
		  
		   driver.get("https://vctcpune.com/selenium/practice.html");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		   List<WebElement> links = driver.findElements(By.tagName("a"));
		
		   System.out.println(links.size());
		   System.out.println("====================");
		   
		   Iterator<WebElement> it = links.iterator();
		   
		   while(it.hasNext())
		   {
			   System.out.println(it.next().getText());
		   }
		   
		   System.out.println("====================");
		   for(WebElement j:links)
		   {
			   System.out.println(j.getText());
			   
		   }
	}

}
