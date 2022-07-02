package framework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","K:\\chromedriver_win32 (1)\\chromedriver.exe");
				
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://kite.zerodha.com/");
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
				
				
				POM1 login= new POM1(driver);
				login.sendUserName();
				login.sendPassword();
				login.clickOnLoginButton();
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
				
				
				POM2 pin= new POM2(driver);
				pin.sendPin();
				pin.clickOnContinueButton();
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
				
				
				POM3 home= new POM3(driver);
				home.validateUserID();
				home.clickOnLogoutButton();
				
				driver.close();
	}

}
