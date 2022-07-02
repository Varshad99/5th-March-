package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args)
	{
		    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Selinium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com");
			//Thread.sleep(100);
			
			WebElement text = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]"));
			
			System.out.println(text.getText());
			String actualText =text.getText();
			String expectedText ="Facebook helps you connect and share with the people in your life.";
			
			
			if(actualText.equals(expectedText))
			{
				System.out.println("Text is matching and textcase is passed");
			}
			
			else
			{
				System.out.println("Text is not matching and textcases is failed");
			}
			
		
	}

}
