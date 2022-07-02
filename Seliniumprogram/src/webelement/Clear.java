package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {

	public static void main(String[] args) throws InterruptedException
	{
		
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Selinium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(100);
		
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Varsha");
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@name='email']")).clear();
		
		
		
		//we can also write another way means we can store in reference variable and return web element
		
		WebElement UserName = driver.findElement(By.xpath("//input[@name='email']"));
		UserName.sendKeys("Varsha");
		UserName.clear();
		
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.sendKeys("varsha3599");
	
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.close();
		
	}

}
