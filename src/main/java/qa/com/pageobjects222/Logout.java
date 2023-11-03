package qa.com.pageobjects222;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.com.testbase222.TestBase22234;

public class Logout extends TestBase22234{
	
	@FindBy(xpath="//a[@class='nav-link']")
	WebElement profile;
	
	
	@FindBy(xpath="//a[@class='dropdown-item'][2]")
	WebElement out;
	
	public Logout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Signout() throws Throwable {
		System.out.println("LOGOUT SUCCESSFULLY");
		
		profile.click();
		Thread.sleep(3000);
		out.click();
	}
	
	

}
