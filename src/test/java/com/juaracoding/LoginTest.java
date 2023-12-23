package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class LoginTest {
    private static WebDriver driver;

    private static ExtentTest extentTest;

    public static LoginPage loginPage = new LoginPage();

    public LoginTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    // 1, Scenario: User Login With Blank Username
    @Given("User enter url web saucedemo")
    public void user_enter_url_web_saucedemo(){
        String url = "https://www.saucedemo.com/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);
    }

    @When("User enter blank username")
    public void user_enter_blank_username(){
        loginPage.setUsername("");
        extentTest.log(LogStatus.PASS, "User enter blank username");
    }

    @And("User enter password")
    public void user_enter_password(){
        loginPage.setPassword("secret_sauce");
        extentTest.log(LogStatus.PASS, "User enter password");
    }

    @And("User click login button")
    public void user_click_login_button(){
        loginPage.btnLogin.click();
        extentTest.log(LogStatus.PASS, "User click login button");
    }

    @Then("User invalid login")
    public void user_invalid_login(){
        extentTest.log(LogStatus.PASS, "User invalid login");
    }

    // 2, Scenario: User Login With Blank Password
    @And("User enter blank password")
    public void user_enter_blank_password(){
        loginPage.setPassword("");
        extentTest.log(LogStatus.PASS, "User enter blank password");
    }

    // 3, Scenario: User Login With Wrong Username
    @When("User enter wrong username")
    public void user_enter_wrong_username(){
        loginPage.setUsername("sstandard_user");
        extentTest.log(LogStatus.PASS, "User enter wrong username");
    }

    // 4, Scenario: User valid login
    @When("User enter username")
    public void user_enter_username(){
        loginPage.setUsername("standard_user");
        extentTest.log(LogStatus.PASS, "User enter username");
    }

    @Then("User login successful redirect to products homepage")
    public void user_login_successful_redirect_to_products_homepage(){
        Assert.assertEquals(loginPage.getProductHomePageTxt(), "Products");
        extentTest.log(LogStatus.PASS, "User login successful redirect to products homepage");
    }


}
