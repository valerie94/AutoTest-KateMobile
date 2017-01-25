package scenarios;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class AndroidSetup {
    protected AndroidDriver driver;

    protected void prepareAndroidForAppium() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium-version", "1.4");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "4.3");
        capabilities.setCapability("deviceName", "192.168.160.101:5555");
        capabilities.setCapability("appPackage", "com.perm.kate_new_6");
        capabilities.setCapability("appActivity", "com.perm.kate.MainActivity");
        capabilities.setCapability("uuid", "192.168.160.101:5555");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
}
