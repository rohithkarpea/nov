package qa.com.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.com.pageobjects222.login_function222;
import qa.com.pageobjects222.srikanthlogut_functionlity;
import qa.com.testbase222.TestBase22234;

public class srikanthloguttest extends TestBase22234 {
	
	
	srikanthlogut_functionlity logut;
	login_function222 lav;
public srikanthloguttest() {
		super();
	}
@BeforeMethod
public void inta() {
	
	set();
	
	 lav =new  login_function222(driver);
	 logut=new srikanthlogut_functionlity(driver);
}

@Test
public void log() throws Throwable {
	lav.validelogin();
	logut.valide();
}	
}
	

