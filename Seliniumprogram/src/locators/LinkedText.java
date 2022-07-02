package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedText {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Selinium\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
			
		   driver.manage().window().maximize();
		  
		   driver.get("https://vctcpune.com/selenium/practice.html");
		   Thread.sleep(100);
		   
		   driver.findElement(By.linkText("REST API")).click();
		
	}

}
