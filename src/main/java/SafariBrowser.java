import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SafariBrowser {

	static IOSDriver <MobileElement> driver;
	
	public static void main(String[] args) throws MalformedURLException {
		

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.BROWSER_NAME, "safari");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.6");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
		
		driver= new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("http://gmail.com");
		
		driver.findElementByXPath("//input[@type = 'email']").sendKeys("Samed");
		driver.findElementByXPath("//span[contains(text(), 'Next')]").click();

	}

}
