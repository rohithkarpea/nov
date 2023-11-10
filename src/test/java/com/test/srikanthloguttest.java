package com.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.testbase;
import com.pages.login_functionlity;
import com.pages.srikanthlogut_functionality;


public class srikanthloguttest extends testbase {
	srikanthlogut_functionality logut;
	login_functionlity logn;
public srikanthloguttest() {
		super();
	}
@BeforeMethod
public void inta() {
	
	set();
	
	 logn =new  login_functionlity(driver);
	 logut=new srikanthlogut_functionality(driver);
}

@Test
public void log() throws Throwable {
	logn.validelogin();
	Thread.sleep(2000);
	logut.valide();
}
}