package utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class AppiumDriverEx {

    public static AppiumDriver getAppiumDriver() {
        // Driver instance
        AppiumDriver appiumDriver = null;
        try {
            // Set DesireCapabilities to send to appium server
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityTypeEx.PLATFORM_NAME, "Android");
            desiredCapabilities.setCapability(MobileCapabilityTypeEx.AUTOMATION_NAME, "uiautomator2");
            desiredCapabilities.setCapability(MobileCapabilityTypeEx.UDID, "emulator-5554");
            desiredCapabilities.setCapability(MobileCapabilityTypeEx.APP_PACKAGE, "com.wdiodemoapp");
            desiredCapabilities.setCapability(MobileCapabilityTypeEx.APP_ACTIVITY, "com.wdiodemoapp.MainActivity");
            desiredCapabilities.setCapability(MobileCapabilityTypeEx.NEW_COMMAND_TIMEOUT, 120);
            //setup the appium server URL to connect APP
            URL appiumServer = new URL("http://localhost:4723/wd/hub");

            appiumDriver = new AppiumDriver(appiumServer, desiredCapabilities);
            // appiumDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5L));
            // WebElement loginLabel= appiumDriver.findElement(AppiumBy.accessibilityId("Login"));
            // loginLabel.click();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return appiumDriver;
    };
}
