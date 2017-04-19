import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.CapabilityType;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class setup {
    AndroidDriver driver;

    public void PrepareAutomation() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
//        #Fill value with your device ID (check using adb)
        capabilities.setCapability("deviceName", "DeviceID");
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
//        #Fill value with your android version
        capabilities.setCapability(CapabilityType.VERSION, "Android Version");
        capabilities.setCapability("platformName", "Android");
//        #Fill value with your path where .apk saved
        capabilities.setCapability("app", "Your path ~/apps/flipkart.apk");
//        #Fill value with to your app package
        capabilities.setCapability("appPackage", "com.flipkart.android");
//        #Fill value with your launchable activity
        capabilities.setCapability("appActivity", "com.flipkart.android.SplashActivity");
//        #Don't change the spec
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
}
