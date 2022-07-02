package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstcode {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		//driver.close(); //to used for close the current browser
		
		//driver.quit(); //to used for close the all tabs present in browser
		
		driver.manage().window().maximize();
		
		//driver.manage().window().minimize();
		
		
		driver.navigate().to("https://www.youtube.com");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();
	}

}
