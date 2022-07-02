package assertClass;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertFail {
  @Test
  public void myMethod() 
  {
	  
	String s="Null";
	String m="Hii";
	
	Assert.assertNotNull(s,"value is not Null Tc is failed");
	Reporter.log("value is null TC is passed",true);
	
	Assert.assertNull(m,"value is not Null Tc is failed");
	Reporter.log("value is null TC is passed",true);  
	
	Assert.fail();
	Assert.assertNotNull(m,"value is Null Tc is failed");
	Reporter.log("value is not null TC is passed",true);
  }
}
