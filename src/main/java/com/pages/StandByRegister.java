package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.testbase;

	public class StandByRegister extends testbase {
	
		@FindBy(xpath="//i[@class='fa fa-houzz']")
		WebElement inventory;
		@FindBy(xpath="//a[text()='Stand By Register']")
		WebElement stbg;
		@FindBy(xpath="//input[@type='date']")
		WebElement From;
		@FindBy(xpath="//input[@placeholder='To Date']")
		WebElement FromTo;
		@FindBy(xpath="//button[@class='btn btn-success btn-sm serchgaptop']")
		WebElement button;
		@FindBy(xpath="//i[@class='fa fa-reply mr-2']")
		WebElement back;
		
		public StandByRegister(WebDriver driver)	{
			PageFactory.initElements(driver, this);
	}
	
	public void StandReg() throws Throwable {
		inventory.click();
		stbg.click();
		Thread.sleep(2000);
		From.sendKeys("01-01-2023");
		Thread.sleep(2000);
		FromTo.sendKeys("11-06-2023");
		Thread.sleep(2000);
		button.click();
		Thread.sleep(2000);
		back.click();
	}
}
	

