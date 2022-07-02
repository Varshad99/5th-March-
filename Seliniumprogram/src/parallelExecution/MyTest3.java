package parallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest3 {
	@Test
	  public void Method1()
	  {
		  
			System.setProperty("webdriver.chrome.driver", "K:\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://kite.zerodha.com/");
		    Reporter.log("method1 is running", true);
	  }
}
