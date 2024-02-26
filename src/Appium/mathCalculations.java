package Appium;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class mathCalculations extends Actions{
	Actions action = new Actions();
	
	@BeforeTest
	public void setup() {
		
	caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Sojood");
	
	caps.setCapability(MobileCapabilityType.APP,System.getProperty("user.dir")+File.separator+"Application"+File.separator+"calculator.apk" );
	}
	@Test
	public void calculations () throws MalformedURLException {

		var appiumServerUrl = URI.create("http://127.0.0.1:4723/wd/hub").toURL();
		driver = new AndroidDriver(appiumServerUrl , caps);
		action.addTwoNumbers("5", "2");
		action.clearData();
		action.subTwoNumbers("9", "4");
		action.clearData();
		action.mulTwoNumbers("6", "7");
		action.clearData();
		action.squareRoot("4");
		action.clearData();
		action.powerOfTwoNumbers("4", "2");
		action.clearData();
		action.factorialOfNumber("3");
		action.clearData();
		
		}
	@AfterTest
	public void afterTest() {
	
	
	}
}
