/**
 * 
 */
package dockerSuite;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

/**
 * @author Pranob Kalita 15-Sep-2019
 */
public class FirefoxTest {

	@Test
	public void testGoogleApplication() throws MalformedURLException {

		DesiredCapabilities desiredcap = DesiredCapabilities.firefox();
		URL url = new URL("http://localhost:4444/wd/hub");

		RemoteWebDriver driver = new RemoteWebDriver(url, desiredcap);

		System.out.println("Executing :" +getClass().getSimpleName().toString());		
		driver.get("https://www.google.com");
		System.out.println("Launched URL is :" +driver.getCurrentUrl());
		System.out.println("PageTitle is    :" +driver.getTitle());
		driver.quit();

	}

}
