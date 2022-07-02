package scolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scolledwindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Selinium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
		Thread.sleep(2000);
		//create object of javascript executor using type casting
		JavascriptExecutor j= ((JavascriptExecutor)driver);
		// +ve x value--> right hand side, Y value +ve --> down 
		// +ve x value--> right hand side, Y value -ve --> up 
		// -ve x value--> left hand side, Y value +ve --> down 
		// -ve x value--> left hand side, Y value -ve --> up 
		j.executeScript("window.scrollBy(80,900)");//pass two dimension x,y
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(80,2000)");
		
//		Thread.sleep(2000);
//		j.executeScript("window.scrollBy(80,500)");
//		Thread.sleep(2000);
//		j.executeScript("window.scrollBy(80,-2000)");
//		


	}

}
