package setup;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import static setup.MobileSetup.driver;

public class MobileHelper {

    public static void scrollHelper(String text) {
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollTextIntoView(\""+text+"\")"));
    }
    public static void userTypesInHelper(String text, String textArea) {
        driver.findElement(By.id(textArea)).sendKeys(text);
    }

}
