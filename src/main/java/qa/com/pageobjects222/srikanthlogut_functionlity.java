package qa.com.pageobjects222;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.com.testbase222.TestBase22234;

public class srikanthlogut_functionlity extends TestBase22234 {
	
	@FindBy(xpath="//a[@class='nav-link']")
	WebElement img;
	
	@FindBy(xpath="//a[@class='dropdown-item'][2]")
	WebElement log;
	
	public srikanthlogut_functionlity(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void valide() throws Throwable{
		img.click();
		Thread.sleep(2000);
		log.click();
	
	}
}
