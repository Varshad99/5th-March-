package testClass;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOut {
	
		@Test(timeOut = 1500)
		 public void D() throws InterruptedException 
		 {
		Thread.sleep(1200); 
		Reporter.log("D is running", true);
		 
		 }
		@Test
		public void C() 
		{
		 Reporter.log("C is running", true);
		 
		}
		@Test
		 public void A() 
		 {
		 Reporter.log("A is running", true);
		 
		 }
		@Test
		 public void B() 
		 {
		 Reporter.log("B is running", true);
		 
		 }

}
