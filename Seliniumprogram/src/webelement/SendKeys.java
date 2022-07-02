package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {

	public static void main(String[] args) throws InterruptedException
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Selinium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(100);
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Varsha");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Varsha@3599");
		
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Thread.sleep(1000);
		
		
        driver.close();
		
	}

}
