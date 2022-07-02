package listBox.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	public static void main(String[] args) throws InterruptedException {
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Selinium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com");
			Thread.sleep(1000);
			
	        driver.findElement(By.xpath("//a[contains(@id,'u_0_2_')]")).click();
	        Thread.sleep(5000);
	        
	        //to identify list box to be handled and store it in reference variable
	        WebElement day = driver.findElement(By.name("birthday_day"));
	        Thread.sleep(5000);
	         
	        //create an object of the select class which will accept web element as argument
	        Select s = new  Select(day);
	
	        //by using one of the select class method we can select values form list box like
	        for(int i=0; i<=9;i++)
	        {
	        	Thread.sleep(1000);
	        	s.selectByIndex(i);
	        }
	        
//	        for (int i=9; i>=0; i--)
//	        {
//	        	Thread.sleep(1000);
//	        	s.selectByIndex(i);
//	        }
//	        
	        
	        boolean result = s.isMultiple();
	        System.out.println(result);
	        
	        for(int i=0; i<=30;i++)
	        {
	        	System.out.println(s.getOptions().get(i).getText());
	        }
	}

}
