package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Selinium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
		driver.manage().window().maximize();

		WebElement Reviews = driver.findElement(By.xpath("(//a[text()='Student Review'])[1]"));
		
		WebDriverWait w =new WebDriverWait(driver, Duration.ofSeconds(30));

		w.until(ExpectedConditions.visibilityOf(Reviews));
	}

}
