package com.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.base.testbase;
import com.pages.StandByRegister;
import com.pages.login_functionlity;
import com.pages.logout_functionalityRK;

	public class StandByRegistertest extends testbase {
		login_functionlity logn;
		StandByRegister strg;
		logout_functionalityRK logut;
		
		public StandByRegistertest() {
			super();
		}
		@BeforeMethod
		public void strgF() {
			
			set();
			
			 logn =new  login_functionlity(driver);
			 strg =new StandByRegister(driver);
			 logut=new logout_functionalityRK(driver);
		}
		@Test
		public void log() throws Throwable {
			logn.validelogin();
			Thread.sleep(2000);
			strg.StandReg();
			Thread.sleep(2000);
			logut.valide();
		
		
		}
	
}
