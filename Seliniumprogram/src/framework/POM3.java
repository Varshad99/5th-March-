package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM3 {

	//1. data members
	@FindBy(xpath = "//span[@class='user-id']") private WebElement userID;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logOutButton;
	
	//2. constructor
	public POM3(WebDriver driver)
	{
	   PageFactory.initElements(driver, this);
	}
	
	
	//3. methods
	public void validateUserID()
	{
	    String actualUserID = userID.getText();
	    String expetctedUserID = "ELR328";
	    if(actualUserID.equals(expetctedUserID))
	    {
	        System.out.println("User ID matching TC is Passed");
	    }
	    else {
	        System.out.println("User ID not matching TC is Failed");
	    }
	}
	
	public void clickOnLogoutButton() throws InterruptedException
	{
	    userID.click();
	    Thread.sleep(200);
	    logOutButton.click();
	}


	public String getactualuserID() {
		// TODO Auto-generated method stub
		return null;
	}


	
	

	
}
