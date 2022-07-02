package scolling;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Selinium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
		System.out.println(driver.manage().window().getSize());
		
		//To set size--> use Dimension class and create object of Dimension class
		
		Dimension d= new Dimension(100, 50);
		
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());

	}

}
