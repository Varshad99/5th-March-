package listBox.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Selinium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			
			
			driver.manage().window().maximize();
			
			driver.get("https://demoqa.com/select-menu");
			Thread.sleep(1000);
			
	       
	        WebElement dropDownBox = driver.findElement(By.name("cars"));
	        Thread.sleep(1000);
	         
	        //create object of class
	        Select s = new  Select(dropDownBox);
	        
	        //check is multiple dropdown 
	        boolean result = s.isMultiple();
	        System.out.println(result);
	        
	
	        s.selectByIndex(0);
	        Thread.sleep(100);
	        s.selectByIndex(1);
	        Thread.sleep(100);
	        s.selectByIndex(2);
	        Thread.sleep(100);
	        s.selectByIndex(3);
	        Thread.sleep(100);
	        
	        
	        //how to de select
	        
	        s.deselectByVisibleText("Volvo");
	        Thread.sleep(100);
	        s.deselectByIndex(0);
	       
	        System.out.println(s.getFirstSelectedOption().getText());
	        
	        for(int i=0;i<s.getAllSelectedOptions().size()-1;i++)
	        {
	        	System.out.println(s.getAllSelectedOptions().get(i).getText());
	        }
	}

}
