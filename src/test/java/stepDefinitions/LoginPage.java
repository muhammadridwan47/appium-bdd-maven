package stepDefinitions;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import utils.AppiumDriverEx;

import java.time.Duration;

public class LoginPage {

    AppiumDriver appiumDriver;

    // LifeCycle Testing
    @Before //before Scenario
    public void setup() {
        appiumDriver = AppiumDriverEx.getAppiumDriver();
    }

    @After //After Scenario
    public void teardown(){
        appiumDriver.quit();
    }

    @Given("the user is on login page")
    public void the_user_is_on_login_page() {
       appiumDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5L));
       WebElement loginBtnNav = appiumDriver.findElement(AppiumBy.accessibilityId("Login"));
       loginBtnNav.click();
    }
    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        WebElement usernameText = appiumDriver.findElement(AppiumBy.accessibilityId("input-email"));
        usernameText.sendKeys("ridwan@gmail.com");
        WebElement passwordText = appiumDriver.findElement(AppiumBy.accessibilityId("input-password"));
        passwordText.sendKeys("ridwan1234");
    }
    @When("hits submit")
    public void hits_submit() {
        // 5. Click on Login button
        WebElement loginBtn = appiumDriver.findElement(AppiumBy.accessibilityId("button-LOGIN"));
        loginBtn.click();
    }
    @Then("the user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Horee successfully");
    }
}
