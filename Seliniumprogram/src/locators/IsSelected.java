package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Selinium\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
			
		   driver.manage().window().maximize();
		  
		   driver.get("https://vctcpune.com/selenium/practice.html");
		   Thread.sleep(5000);
		   
		   WebElement checkBox = driver.findElement(By.id("checkBoxOption1"));
		   boolean result = checkBox.isEnabled();
		   System.out.println(result);
		   
		  if( checkBox.isSelected())
		  {
			  System.out.println("textbox iss already selected");
	           
		  }
         
		  else
		  {
			  System.out.println("selecting checkbox now");
			  checkBox.click();
			  if(checkBox.isSelected())
			  {
				  System.out.println("check box is selected now");
			  }
			  
			  else {
				  System.out.println("failed to select chek box");
			  }
			  
			  
			  
		  }
           
          
	}

}
