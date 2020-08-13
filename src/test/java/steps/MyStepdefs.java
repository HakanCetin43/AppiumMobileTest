package steps;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static setup.MobileHelper.*;
import static setup.MobileSetup.*;

public class MyStepdefs {

    @Given("user is the {string} screen")
    public void userIsTheScreen(String screenName) {
        boolean displayed = driver.findElement(new MobileBy.ByAccessibilityId(screenName)).isDisplayed();
        Assert.assertEquals(displayed, true);
    }

    @When("user clicks {string}")
    public void userClicks(String arg0) {
        driver.findElement(new MobileBy.ByAccessibilityId(arg0)).click();
    }

    @Then("user able to go {string} screen")
    public void userAbleToGoScreen(String arg0) {
        boolean displayed = driver.findElement(new MobileBy.ByAccessibilityId(arg0)).isDisplayed();
        Assert.assertEquals(displayed, true);
    }


    @Given("user views {string}")
    public void userViews(String arg0) {
        boolean displayed = driver.findElement(new MobileBy.ByAccessibilityId(arg0)).isDisplayed();
        Assert.assertEquals(displayed, true);
    }

    @And("user scroll to {string}")
    public void userScrollTo(String text) {
        scrollHelper(text);
    }


    @And("user types {string} in {string}")
    public void userTypesIn(String text, String textArea) {
        userTypesInHelper(text, textArea);
    }

    @And("user types {string} in {string} area")
    public void userTypesInSearchArea(String arg0) {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.id("android:id/search_src_text")).sendKeys(arg0);
    }


    @Then("filtered elements in the {string} should be {int}")
    public void filteredElementInTheResultShouldBe(int arg0) {
        List<MobileElement> elements = driver.findElement(By.id("io.appium.android.apis:id/list_view"))
                .findElements(By.className("android widget.TextView"));
        for (MobileElement el : elements) {
            System.out.println("el = " + el.getText());
        }
        System.out.println("elements.get(0).getText() = " + elements.get(0).getText());

//        int size = driver.findElement(By.id("io.appium.android.apis:id/list_view"))
//                .findElements(By.className("android widget.TextView")).size();
//        Assert.assertEquals(size, arg0);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


}



