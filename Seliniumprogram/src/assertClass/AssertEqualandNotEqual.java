package assertClass;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualandNotEqual {
  @Test
  public void f() 
  {
	  
	  String a="Varsha";
	  String b="Varsha";
	  String c="Dhole";
	  
	  Assert.assertEquals(a, b,"string are not matching TC is failed");
	  Reporter.log("string are matched TC is passed",true);
	  
	  Assert.assertNotEquals(a, c,"string are matching TC is failed");
	  Reporter.log("string are not matching TC is passed",true);
	  
  }
}
