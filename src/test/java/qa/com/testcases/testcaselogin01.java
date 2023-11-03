package qa.com.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.com.pageobjects222.login_function222;
import qa.com.testbase222.TestBase22234;

public class testcaselogin01  extends TestBase22234{

	login_function222 lav;
	public testcaselogin01() {
		super();
		
	}
	
	@BeforeMethod
	public void inta() {
		
		set();
		
		 lav=new  login_function222(driver);
		 
	}
	
	@Test
	public void log() {
		lav.valide();
	}
}
