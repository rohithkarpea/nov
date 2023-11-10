package com.base;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testbase {
	public static Properties props;
	   public static WebDriver driver;
	   
	    FileInputStream file;
		public testbase() {
			
			props=new Properties();
			
			try {
				file=new FileInputStream("./src/main/java/com/properties/props");
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