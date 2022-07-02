package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe1 {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Selinium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			
			
			driver.manage().window().maximize();
			
			driver.get("https://vctcpune.com/selenium/practice.html");
			Thread.sleep(1000);
		
			driver.switchTo().frame("iframe-name");
			Thread.sleep(100);
			
			driver.findElement(By.xpath("(//a[text()='About us'])[1]")).click();
			Thread.sleep(100);
		
		
			driver.switchTo().defaultContent();
			driver.findElement(By.xpath("//input[@value='Radio1']")).click();
	}

}
