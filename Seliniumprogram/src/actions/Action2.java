package actions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Action2 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Selinium\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
			
		   driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		   driver.manage().window().maximize();
		   
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		  
		  //double click
		   
		   WebElement myElement = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		   
		   Actions act= new Actions(driver);
		   
		   act.doubleClick(myElement).perform();
		   Thread.sleep(1000);
		   Alert alt= driver.switchTo().alert();
		   alt.accept();
		   
		   
		   
		   
	}

}
