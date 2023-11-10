package com.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.testbase;
import com.pages.login_functionlity;
import com.pages.srikanthlogut_functionality;
import com.pages.stockreport;

public class stockreporttest extends testbase {
	login_functionlity logn;
	stockreport catg;
	srikanthlogut_functionality logut;
	public stockreporttest() {
		super();
	}
	@BeforeMethod
	public void catge() {
		
		set();
		
		 logn =new  login_functionlity(driver);
		 catg=new stockreport(driver);
		 logut=new srikanthlogut_functionality(driver);
	}
	@Test
	public void log() throws Throwable {
		logn.validelogin();
		Thread.sleep(2000);
		catg.stockrp();
		Thread.sleep(2000);
		logut.valide();
	
	
	}
}
