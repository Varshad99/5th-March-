package testClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
  
	@Test
  public void Method()
  {
	  
		System.setProperty("webdriver.chrome.driver", "K:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
	    System.out.println("method is runnig");
  }
	@Test
	  public void Method1()
	  {
		  
			System.setProperty("webdriver.chrome.driver", "K:\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/login/");
		    Reporter.log("method1 is running");
	  }
	@Test
	  public void Method2()
	  {
		  
			System.setProperty("webdriver.chrome.driver", "K:\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://kite.zerodha.com/");
		    Reporter.log("method2 is running", true);
	  }
}
