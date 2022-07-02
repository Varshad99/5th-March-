package popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Selinium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		driver.findElement(By.name("New Window")).click();
		Thread.sleep(1000);
		
		String idOfMainPage =driver.getWindowHandle();
		System.out.println("main page id "+idOfMainPage);
		
		Set<String> allId = driver.getWindowHandles();
		//set need to convert into arrayList
		
		ArrayList<String> ar=new ArrayList<>(allId);
		
		for(int i=0; i<=ar.size()-1;i++)
		{
			System.out.println(ar.get(i));
		}
		
		String MainPageId =ar.get(0);
		String ChildPageId =ar.get(1);
		
		// switch to child page
		
		driver.switchTo().window(ChildPageId);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("the7-search")).sendKeys("Selenium");;
		driver.close();
		Thread.sleep(1000);
		
		//switch focus from child page to main page
		
		driver.switchTo().window(MainPageId);
		driver.switchTo().window(ar.get(0));
		driver.findElement(By.name("New Tab")).click();
	}

}
