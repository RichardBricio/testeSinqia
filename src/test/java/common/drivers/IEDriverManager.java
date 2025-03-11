package common.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IEDriverManager {
	
	private static WebDriver driver = null;
	
    public WebDriver getDriver() {
       	// System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "/src/main/resources/webdrivers/IEDriverServer.exe");
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
