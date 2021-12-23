package AvatoonAvatarMaker.utils;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Driver {

    private Driver() {

    }

    private static MobileDriver driver;

    public static MobileDriver get() {

        if (driver == null) {
            String os = (System.getProperty("osName") != null) ? System.getProperty("osName") : ConfReader.get("osName");

            if ("ios".equals(os.toLowerCase())) {
                if (!System.getProperty("os.name").toLowerCase().contains("mac"))
                    throw new WebDriverException("Your OS doesn't support this test");
                DesiredCapabilities capsIOS = new DesiredCapabilities();
                capsIOS.setCapability("platformName", "iOS");
                capsIOS.setCapability("automationName", "");
                capsIOS.setCapability("bundleId", "");
                capsIOS.setCapability("fullReset", false);
                capsIOS.setCapability("noReset", true);
                capsIOS.setCapability("autoAcceptAlerts", "true");
                capsIOS.setCapability("deviceName", "");
                driver = new IOSDriver<MobileElement>(capsIOS);
            } else {

                DesiredCapabilities capsAndroid = new DesiredCapabilities();
                capsAndroid.setCapability("platformName", "Android");
                capsAndroid.setCapability("app", "D:\\Cicek Sepeti Bootcamp\\AppiumPOM\\src\\test\\java\\AvatoonAvatarMaker\\apps\\Avatoon_Avatar_Maker_Creator_v1.5.8.apk");
                capsAndroid.setCapability("deviceName", "emulator-5554");
                capsAndroid.setCapability("fullReset", false);
                capsAndroid.setCapability("noReset", true);
                capsAndroid.setCapability("autoGrantPermissions", "true");
                driver = new AndroidDriver<MobileElement>(capsAndroid);
            }
        }

        return driver;
    }

    public static void closeDriver() {
        driver.quit();
    }


}
