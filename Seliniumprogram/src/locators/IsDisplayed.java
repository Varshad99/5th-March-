package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Selinium\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
			
		   driver.manage().window().maximize();
		  
		   driver.get("https://vctcpune.com/selenium/practice.html");
		   Thread.sleep(500);
		   
		   WebElement display = driver.findElement(By.id("displayed-text"));
		   boolean result = display.isDisplayed();
		   System.out.println(result);
		   display.sendKeys("passcode");
		   
		   driver.findElement(By.name("enter-name"));
		   
		   driver.findElement(By.id("hide-textbox")).click();		 
		   boolean result1 = display.isDisplayed();
		   System.out.println(result1);
		   
		
	}

}
