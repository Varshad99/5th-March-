package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstSelcode {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\velocity");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://web.whatsapp.com/");
	}

}
