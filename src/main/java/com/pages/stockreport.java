package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.testbase;

public class stockreport extends testbase {
	@FindBy(xpath="//li[@class='treeview'][2]")
	WebElement inventory;
	
	@FindBy(xpath="//a[.='Stock Report']")
	WebElement stockreport;
	
	@FindBy(xpath="/html/body/div[3]/div/section[2]/div/div/div/div[1]/form/div/div[2]/div/span/span[1]/span/span[2]/b")
	WebElement da1;
	
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li[4]")
	WebElement laptop;
	
	@FindBy(xpath="/html/body/div[3]/div/section[2]/div/div/div/div[1]/form/div/div[4]/span/span[1]/span/span[2]/b")
	WebElement da2;
	
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li[3]")
	WebElement warehouse;
	
	@FindBy(xpath="//button[@class='btn btn-success serchgaptop'][1]")
	WebElement search;
	
	public stockreport(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void stockrp() throws Throwable{
		inventory.click();
		stockreport.click();
		Thread.sleep(2000);
		da1.click();
		laptop.click();
		Thread.sleep(2000);
		da2.click();
		warehouse.click();
		search.click();
		
	}
}
