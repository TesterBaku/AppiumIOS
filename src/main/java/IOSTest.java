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
    	
    	driver.findElementByAccessibilityId("Steppers").click();
    	
    	driver.findElementByXPath("(//XCUIElementTypeButton[@name=\"Increment\"])[1]").click();
    	driver.findElementByXPath("(//XCUIElementTypeButton[@name=\"Increment\"])[1]").click();
    	
    	String defaultNumber = driver.findElementsByClassName("XCUIElementTypeStaticText").get(1).getAttribute("value");
    	
    	System.out.println(defaultNumber);
    	
    	driver.navigate().back();
    	
    	driver.findElementByAccessibilityId("Picker View").click();
    	
    	//using different selectors
    	
    	driver.findElementByAccessibilityId("Green color component value").sendKeys("250");
    	
    	driver.findElementsByClassName("XCUIElementTypePickerWheel").get(0).sendKeys("50");
    	
    	driver.findElementByXPath("//XCUIElementTypePickerWheel[@name=\"Blue color component value\"]").sendKeys("130");
    	
    	
		


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
		
		
		
}
