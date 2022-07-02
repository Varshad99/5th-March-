package listBox.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxDropdown {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Selinium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com");
			Thread.sleep(1000);
			
	        driver.findElement(By.xpath("//a[contains(@id,'u_0_2_')]")).click();
	        Thread.sleep(5000);
	        
	        WebElement day = driver.findElement(By.name("birthday_day"));
	        Thread.sleep(5000);
	         
	        Select s = new  Select(day);
	
	        s.selectByVisibleText("10");
	        Thread.sleep(1000);
	        s.selectByIndex(15);
	        Thread.sleep(1000);
	        s.selectByValue("20");
	        Thread.sleep(1000);
	
	        WebElement month = driver.findElement(By.id("month"));
	       
	        Select s1 = new Select(month);
	
	        s1.selectByVisibleText("Jan");
	        Thread.sleep(1000);
	        s1.selectByIndex(4);
	        Thread.sleep(1000); 
	        s1.selectByValue("10");
	        Thread.sleep(1000);
	
	
	        WebElement year = driver.findElement(By.name("birthday_year"));
	        
	        Select s2 =new Select(year);
	        
	        s2.selectByVisibleText("1999");
	        Thread.sleep(1000);
	}

}
