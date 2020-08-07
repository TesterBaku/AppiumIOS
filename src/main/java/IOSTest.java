import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class IOSTest extends Practice{

	public static void main(String[] arg) throws MalformedURLException {
		
		IOSDriver <MobileElement> driver = capabilities();
		driver.findElementByAccessibilityId("Alert Views").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Text Entry\"]").click();
		driver.findElementByClassName("XCUIElementTypeTextField").sendKeys("hello");
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"OK\"]").click();
		
		driver.navigate().back();
		
		//works fine
    	scrollDown();
		
		//need to improve
//		scrollDownToElement("Search Bars");

    	//doesn't work
//		scrollDownToElement();

	}
	
	public static void scrollDown() {
		Map<String, Object> args = new HashMap<String, Object>();
		args.put("direction", "down");
		driver.executeScript("mobile: scroll", args);
	}
		
		public static void scrollUp() {
			Map<String, Object> args = new HashMap<String, Object>();
			args.put("direction", "up");
			driver.executeScript("mobile: scroll", args);
	}
		
		public static void scrollDownToElement(String accessibilityID) {
			
			Map<String, Object> args = new HashMap<String, Object>();
			args.put("direction", "down");
			args.put("name", accessibilityID);
			driver.executeScript("mobile: scroll", args);
		}
		
		public static void scrollDownToElement() {
			// scroll back to the first item in the list
			MobileElement list = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Search Bars\"]"));
			Map<String, Object> args = new HashMap<String, Object>();
			args.put("direction", "down");
			args.put("name", null);
			args.put("element", list.getId());
			driver.executeScript("mobile: scroll", args);
		}


}
