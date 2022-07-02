package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathMethod {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("wedriver.chrome.driver", "C:\\Program Files\\Java\\Selinium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//h1[text(),'Welcome To Practice Page']")).click(); //xpath text method
		driver.findElement(By.xpath("//h1[contains(text(),'Welcome')]"));
		
		driver.findElement(By.xpath("//input[contains(@type, 'submit')]")).click();
				
				
	}

}
