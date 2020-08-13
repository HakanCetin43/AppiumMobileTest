package setup;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileSetup {
   public static AppiumDriver<MobileElement> driver;
   public static WebDriverWait wait;
    @Before
    public static void initialize(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "9.0");
        caps.setCapability("deviceName", "Pixel 28");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "io.appium.android.apis");
        caps.setCapability("appActivity", "ApiDemos");

        String spec;
        try {
            URL url = new URL("http://localhost:4723/wd/hub");
            driver= new AndroidDriver(url,caps);
            wait=new WebDriverWait(driver,10);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
//    @After
    public static void quit(){
        driver.quit();
    }

}
