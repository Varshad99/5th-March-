package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeywordAction {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Selinium\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
			
		   driver.get("https://vctcpune.com/selenium/practice.html");
		   driver.manage().window().maximize();
		   
		   Thread.sleep(1000);
		 
		   WebElement textBox = driver.findElement(By.id("autocomplete"));
		   
		   Actions act = new Actions(driver);
		   
		  // act.sendKeys(textBox,"Pune");
		 //  act.keyDown("p").build().perform();
		   
		 act.keyDown(textBox,Keys.SHIFT).sendKeys("pune").build().perform();
		   

	}

}
