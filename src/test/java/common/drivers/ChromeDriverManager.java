package common.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDriverManager {
	private static WebDriver driver = null;

	public WebDriver getDriver() {
		// System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir") + "/src/main/resources/webdrivers/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		return getInstance();
	}

	public static synchronized WebDriver getInstance() {
		if(driver == null) {
			driver = new ChromeDriver();
		}
		return driver;
	}
}