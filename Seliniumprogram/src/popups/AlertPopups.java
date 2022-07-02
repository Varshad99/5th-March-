package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopups {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Selinium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			
			driver.get("https://demoqa.com/alerts");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//button[@id='alertButton']")).click();
			Thread.sleep(1000);
			//driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
			
			//to handle alert popup we need to switch selenium focus from main page to alerts popup by using syntax
			
			Alert alt = driver.switchTo().alert();
			
			//alert is an interface which contains abstract method like
			
			System.out.println(alt.getText());//use to get text present in a alert popup
			
			alt.accept();//use to click on ok button
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
			Thread.sleep(8000);
			
			Alert alt1 = driver.switchTo().alert();
			alt1.accept();
			
	}

}
