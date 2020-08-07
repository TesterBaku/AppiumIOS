import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class Practice {
	
	static IOSDriver <MobileElement> driver;

	public static IOSDriver<MobileElement> capabilities() throws MalformedURLException {
		

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.6");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
		cap.setCapability(MobileCapabilityType.UDID, "F2A9AD23-94D9-4927-B154-8F633D69B5FF");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		 
//    	cap.setCapability(CapabilityType.BROWSER_NAME, "safari");
		
		cap.setCapability(MobileCapabilityType.APP, "/Users/admin/Library/Developer/Xcode/DerivedData/UICatalog-ecjqqzjpzquhpmcqcjvzfbghnovw/Build/Products/Debug-iphonesimulator/UICatalog.app");
		 
		driver= new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		return driver;

	}

}
