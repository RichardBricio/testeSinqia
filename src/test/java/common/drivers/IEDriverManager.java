package common.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriverManager {
	
	private static WebDriver driver = null;
	
    public WebDriver getDriver() {
		WebDriverManager.iedriver().setup();
        return getInstance();
    }

	public static synchronized WebDriver getInstance() {
    	if(driver == null) {
    		driver = new InternetExplorerDriver();
    		driver.manage().window().maximize();
    	}
    	return driver;
    }
	
}
