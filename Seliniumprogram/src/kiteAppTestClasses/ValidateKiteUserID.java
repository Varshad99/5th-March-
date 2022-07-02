package kiteAppTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kitAppPOMClasses.POM1;
import kitAppPOMClasses.POM2;
import kitAppPOMClasses.POM3;
import kiteAppUtilityClass.Utility;
import kteAppBaseClass.BaseClass;

public class ValidateKiteUserID extends BaseClass
{
 
	POM1 login;
	POM2 pin;
	POM3 home;
	
	
	@BeforeClass
	
	public void LunchBrowser()
	{
		openBrowser();
		login=new POM1();
		pin= new POM2();
		home =new POM3();
		
	}
		
		
	
	@BeforeMethod
	public void loginToKite() throws EncryptedDocumentException, IOException
	{
		login.sendUserName(Utility.readDataFromExcel(0, 0));
		login.sendPassword(Utility.readDataFromExcel(0, 1));
		login.clickOnLoginButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		pin.sendPin(Utility.readDataFromExcel(0,2));
		pin.clickOnContinueButton();
	}
	
	@Test
   public void validateUserName() throws IOException 
	{
		String actualUserName = home.getActualUserID();
		String expectedUserName=Utility.readDataFromExcel(0, 0);
		
		Assert.assertEquals(actualUserName, expectedUserName,"TC is failed actual and expected username are not matching");
		Reporter.log("User name is matching TC is Passed");
		
		Utility.takeScreenShot(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	}
	
	@AfterMethod
	public void logoutfromKite() throws InterruptedException
	{
		home.clickOnLogoutButton();
	}
	
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
}
