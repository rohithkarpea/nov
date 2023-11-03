package qa.com.pageobjects222;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.com.testbase222.TestBase22234;

public class login_function222 extends TestBase22234 {

	@FindBy(xpath="//input[@type='text']")
	WebElement usar;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement psd;
	
	@FindBy(xpath="//button[.='Login']")
	WebElement lgn;
	
	public login_function222(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void valide() {
		usar.sendKeys(props.getProperty("username"));
		psd.sendKeys(props.getProperty("password"));
		lgn.click();
	}
	
}
