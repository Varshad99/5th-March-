package misc;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfButton {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Selinium\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
			
		   driver.get("https://webdriveruniversity.com/Data-Table/index.html");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		   List<WebElement> button = driver.findElements(By.tagName("button"));
		
		   System.out.println(button.size());
		   System.out.println("====================");
		   
		   Iterator<WebElement> it = button.iterator();
		   
		   while(it.hasNext())
		   {
			   System.out.println(it.next().getText());
		   }
		   
		   System.out.println("====================");
		   for(WebElement j:button)
		   {
			   System.out.println(j.getText());
			   
		   }
	}

}
