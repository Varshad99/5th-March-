package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class RandomScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Selinium\\chromedriver_win32\\chromedriver.exe");
			
		    WebDriver driver =new ChromeDriver();
			
			
			driver.get("https://demoqa.com/select-menu");
			driver.manage().window().maximize();
			Thread.sleep(100);
			
		    File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		    String random =RandomString.make(5);
		
		    File destination = new File("K:\\Screenshot\\myscreenshot"+random+".png");
		
		    FileHandler.copy(source, destination);
		
	}

}
