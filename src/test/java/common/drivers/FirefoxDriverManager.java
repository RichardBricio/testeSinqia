package common.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxDriverManager {
	
	private static WebDriver driver = null;
	
    public WebDriver getDriver() {
       	// System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir") + "/src/main/resources/webdrivers/geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
        return getInstance();
    }
    
	public static synchronized WebDriver getInstance() {
    	if(driver == null) {
    		driver = new FirefoxDriver();
    		driver.manage().window().maximize();
    	}
    	return driver;
    }
	
}
