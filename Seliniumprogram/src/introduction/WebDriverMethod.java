package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverMethod {

	public static void main(String[] args)
	{
		//getTitle method
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Selinium\\chromedriver_win32\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.youtube.com");
		String title = driver.getTitle();
		
		System.out.println(title);
		System.out.println(driver.getTitle());
		
		
		//getcurrentURL method
		
		String url= driver.getCurrentUrl();
		
		System.out.println(url);
		
		
		System.out.println(driver.getCurrentUrl());
		
		
		
		
		
	}

}
