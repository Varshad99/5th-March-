package xmlStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest4 {
	@Test(groups= "regression")
	 public void myMethod6()
	 {
	 Reporter.log("my Method6 is Running",true);
	 }
	@Test (groups= "regression")
	 public void myMethod7()
	 {
	 Reporter.log("my Method7 is Running",true);
	 }
	@Test(groups= "sanity")
	 public void myMethod8()
	 {
	 Reporter.log("my Method8 is Running",true);
	 }
	@Test(groups= "sanity")
	 public void myMethod9()
	 {
	 Reporter.log("my Method9 is Running",true);
	 }
	@Test(groups= "sanity")
	 public void myMethod10()
	 {
	 Reporter.log("my Method10 is Running",true);
	 }
}
