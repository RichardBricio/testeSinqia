package common.drivers;

import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import common.hooks.Hooks;

public class DriverManager {

static String driverPath;
	
	public static WebDriver getManager(DriverType type) throws MalformedURLException {
		switch (type) {
		case CHROME: ChromeDriverManager chrDrvMng = new ChromeDriverManager();
			Hooks.setRunningDriver(type);
			return chrDrvMng.getDriver();
		case IE: IEDriverManager ieDrvMng = new IEDriverManager();
			Hooks.setRunningDriver(type);
			return ieDrvMng.getDriver();
		case FIREFOX: FirefoxDriverManager fireDrvMng = new FirefoxDriverManager();
			Hooks.setRunningDriver(type);
			return fireDrvMng.getDriver();
		// case DOCKER_CHROME: 
		// 	return DockerChromeManager.DockerChromeDriver();
		default:
			return null;
		}
	}
	
}