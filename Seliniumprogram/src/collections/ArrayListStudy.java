package collections;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayListStudy {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Selinium\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
			
		   driver.manage().window().maximize();
		  
		   driver.get("https://vctcpune.com/selenium/practice.html");
		   Thread.sleep(500);

		   String s1 ="//input[@name='checkBoxOption1']";
		   String s2 ="//input[@name='checkBoxOption2']";
		   String s3 ="//input[@name='checkBoxOption3']";
		   
		   ArrayList<String> al = new ArrayList<String>();
		   
		   al.add(s1);
		   al.add(s2);
		   al.add(s3);
		   
	}

}
