package com.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.testbase;
import com.pages.login_functionlity;


public class testcaselogin extends testbase {
	
	login_functionlity logn;
	public testcaselogin() {
		super();	
	}
	@BeforeMethod
	public void inta() {
		set();
		
		 logn=new login_functionlity(driver);
	}
	
	@Test
	public void log() {
		logn.validelogin();

}
}