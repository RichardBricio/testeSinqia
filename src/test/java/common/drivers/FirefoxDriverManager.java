package common.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager {
	
	private static WebDriver driver = null;
	
    public WebDriver getDriver() {
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
