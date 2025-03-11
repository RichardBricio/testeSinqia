package common.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager {
	private static WebDriver driver = null;

	public WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		return getInstance();
	}

	public static synchronized WebDriver getInstance() {
		if (driver == null) {
			driver = new ChromeDriver();
		}
		return driver;
	}

}