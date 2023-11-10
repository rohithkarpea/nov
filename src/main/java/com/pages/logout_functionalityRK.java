package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.testbase;

public class logout_functionalityRK extends testbase {
	
		@FindBy(xpath="//a[@class='nav-link']")
		WebElement img;
		
		@FindBy(xpath="//a[@class='dropdown-item'][2]")
		WebElement log;
		
		public logout_functionalityRK(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void valide() throws Throwable{
			img.click();
			Thread.sleep(2000);
			log.click();
		
	}

}
