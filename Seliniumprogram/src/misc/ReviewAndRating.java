package misc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReviewAndRating {

	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver","K:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement element = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		element.click();
		element.sendKeys("One Plus nord 2");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	    WebElement rating = driver.findElement(By.xpath("((//div[@class='gUuXy-'])[5]//span)[3]"));
		rating.click();
		System.out.println(rating.getText());
		
		//WebElement review = driver.findElement(By.xpath(""));
		//review.click();
	    //System.out.println(review.getText());
			
	}

}
