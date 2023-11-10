package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.testbase;

public class login_functionlity extends testbase {
	@FindBy(xpath="//input[@type='text']")
	WebElement usar;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement psd;
	
	@FindBy(xpath="//button[.='Login']")
	WebElement lgn;
	
	public login_functionlity(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void validelogin() {
		usar.sendKeys(props.getProperty("username"));
		psd.sendKeys(props.getProperty("password"));
		lgn.click();
}
}