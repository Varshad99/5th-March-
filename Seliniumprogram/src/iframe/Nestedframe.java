package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nestedframe {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Selinium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			
			driver.get("https://demoqa.com/nestedframes");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
			//focus main page to parent frame(frame1)
			driver.switchTo().frame("frame1");
			Thread.sleep(1000);
		    WebElement parent = driver.findElement(By.xpath("//body[text()='Parent frame']"));
		    System.out.println(parent.getText());
		    Thread.sleep(1000);
		
		    //focus from parent frame to child frame(frame2)
		    WebElement frame2 = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		    driver.switchTo().frame(frame2);
		    Thread.sleep(1000);
		    WebElement child = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
		    System.out.println(child.getText());
		    
		    //navigate child frame to main page
		    driver.switchTo().defaultContent();
		    WebElement nested = driver.findElement(By.xpath("//div[text()='Nested Frames']"));
		    System.out.println(nested);
		    
		    
	}

}
