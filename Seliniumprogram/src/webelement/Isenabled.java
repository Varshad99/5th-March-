package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenabled {

	public static void main(String[] args) throws InterruptedException
	{
		
		   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Selinium\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
			
		   driver.manage().window().maximize();
		  
		   driver.get("https://www.discoveryplus.in/login");
		   Thread.sleep(6000);
		   
		  // driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		   //Thread.sleep(4000);
		   
		   WebElement OTPbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		   boolean result = OTPbutton.isEnabled();
		   System.out.println(result);
		   
		   WebElement textBox = driver.findElement(By.id("mobileNumber"));
		   textBox.sendKeys("7777777777");
		   Thread.sleep(100);
		  // driver.findElement(By.xpath("//button[@type='submit']")).click();
		   
		   boolean result1 = OTPbutton.isEnabled();
		   System.out.println(result1);
		   
		  
		   
		   
		   
	}
}
