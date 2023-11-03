package qa.com.testbase222;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase22234 {

   public static	Properties props;

   public static WebDriver driver;
    FileInputStream file;
	public TestBase22234() {
		
		props=new Properties();
		
		try {
			file=new FileInputStream("./src/main/java/qa/com/propertiesconfig222/empfile");
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		try {
			props.load(file);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void set() {
		String browser=props.getProperty("browser");
		
		if (browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
			
		}
		else if (browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(props.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
}
