package br.william.CursoAppium.core;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverFactory {
	
	public static AndroidDriver<MobileElement> driver;
	
	public static AndroidDriver<MobileElement> getDriver() {
		if(driver == null) {
			createDriver();
		} return driver;
		
	}
	
	private static void createDriver() {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("appium:deviceName", "emulator");
		desiredCapabilities.setCapability("appium:automationName", "uiautomator2");

		desiredCapabilities.setCapability(MobileCapabilityType.APP, "/Users/williampez/Documents/eclipse-workspace/CursoAppium/src/main/resources/CTAppium_2_0.apk");
		
		//C:\Users\USER\eclipse-workspace\CursoAppium\src\main\resources
		desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
		desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
		desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
		desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);
		
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} //Inicializa comunicação com o Servidor
		//espera implicita
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		

	} 
	
	public static void killDriver( ) {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
