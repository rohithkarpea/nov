package com.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.testbase;
import com.pages.login_functionlity;
import com.pages.logout_functionalityRK;


public class RKlogouttest {

	public class RKloguttest extends testbase {
		logout_functionalityRK logut;
		login_functionlity logn;
	public RKloguttest() {
			super();
		}
	@BeforeMethod
	public void inta() {
		
		set();
		
		 logn =new  login_functionlity(driver);
		 logut=new logout_functionalityRK(driver);
	}

	@Test
	public void log() throws Throwable {
		logn.validelogin();
		Thread.sleep(2000);
		logut.valide();
	}
	
	}
}
