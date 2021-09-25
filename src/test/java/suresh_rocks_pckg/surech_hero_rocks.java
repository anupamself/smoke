package suresh_rocks_pckg;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class surech_hero_rocks {
	
	@Test
	public void syso() throws MalformedURLException {
		WebDriverManager.chromedriver().setup();
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setBrowserName("chrome");
		
		WebDriver driverObj=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),dc);
		System.out.println("hello suresh rocks");
		driverObj.quit();

	}

}
