package qa.com.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.com.pageobjects222.Logout;
import qa.com.pageobjects222.login_function222;
import qa.com.testbase222.TestBase22234;

public class Testcase2 extends TestBase22234{
	
	login_function222 lav;
	Logout l1;
	
	
	public Testcase2() {
		super();
		
	}
	
	@BeforeMethod
	public void inta() {
		
		set();
		
		 lav=new  login_function222(driver);

		 l1=new Logout(driver);
		 
	}
	
	@Test
	public void log() throws Throwable {
		lav.valide();
		l1.Signout();
	}

}
