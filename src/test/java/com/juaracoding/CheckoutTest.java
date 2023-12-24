package com.juaracoding;


import com.juaracoding.pages.CheckoutPage;
import com.relevantcodes.extentreports.ExtentTest;

import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.juaracoding.LoginTest.loginPage;

public class CheckoutTest {
    private static WebDriver driver;

    private static ExtentTest extentTest;

    private static CheckoutPage checkoutPage = new CheckoutPage();

    public CheckoutTest() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    // 1, Scenario: User input blank first name
    @Given("User move to page information")
    public void user_move_to_page_information() {
        checkoutPage.clickCheckoutButton();
        Assert.assertEquals(checkoutPage.getYourInformationTitleTxt(), "Checkout: Your Information");
        extentTest.log(LogStatus.PASS, "User move to page information");
    }

    @When("User enter blank first name")
    public void user_enter_blank_first_name() {
        checkoutPage.setFirstNameField("");
        extentTest.log(LogStatus.PASS, "User enter blank first name");

    }

    @And("User enter last name")
    public void user_enter_last_name() {
        checkoutPage.setLastNameField("Bagaskara");
        extentTest.log(LogStatus.PASS, "User enter last name");

    }

    @And("User enter postal code")
    public void user_enter_postal_code() {
        checkoutPage.setPostalCodeField("57474");
        extentTest.log(LogStatus.PASS, "User enter postal code");

    }

    @And("User continue checkout")
    public void user_continue_checkout() {
        checkoutPage.clickContinueCheckout();
        extentTest.log(LogStatus.PASS, "User continue checkout");

    }

    @Then("User required first name error")
    public void user_required_first_name_error() {
        Assert.assertEquals(checkoutPage.getFirstNameRequiredTxt(), "Error: First Name is required");
        extentTest.log(LogStatus.PASS, "User required first name error");

    }

    // 2, Scenario: User input blank last name
    @When("User enter first name")
    public void user_enter_first_name() {
        checkoutPage.setFirstNameField("Ikrar");
        extentTest.log(LogStatus.PASS, "User enter first name");
    }

    @And("User enter blank last name")
    public void user_enter_blank_last_name() {
        checkoutPage.setLastNameField("");
        extentTest.log(LogStatus.PASS, "User required first name error");
    }

    @Then("User require last name error")
    public void user_required_last_name_error() {
        Assert.assertEquals(checkoutPage.getLastNameRequiredTxt(), "Error: Last Name is required");
        extentTest.log(LogStatus.PASS, "User required last name error");

    }

    // 3, Scenario: User input blank postal code
    @And("User enter blank postal code")
    public void user_enter_blank_postal_coe() {
        checkoutPage.setPostalCodeField("");
        extentTest.log(LogStatus.PASS, "User enter blank postal code");
    }

    @Then("User require postal code error")
    public void user_required_postal_code_error() {
        Assert.assertEquals(checkoutPage.getPostalCodeRequiredTxt(), "Error: Postal Code is required");
        extentTest.log(LogStatus.PASS, "User required postal code error");

    }

    // 4, Scenario: User input valid information
    @Then("User valid information")
    public void user_valid_information() {
        extentTest.log(LogStatus.PASS, "User valid information");
    }

    // 5, Scenario : User completes checkout after successful Scenario #4
    @Given("User give valid information")
    public void user_give_valid_information(){
        Assert.assertEquals(checkoutPage.getOverviewTitleTxt(), "Checkout: Overview");
        extentTest.log(LogStatus.PASS, "User give valid information");
    }

    @When("User finishing checkout")
    public void user_finishing_checkout(){
        checkoutPage.clickFinishButton();
        Assert.assertEquals(checkoutPage.getCompleteTitleTxt(), "Checkout: Complete!");
        extentTest.log(LogStatus.PASS, "User finishing checkout");
    }

    @Then("User back to products homepage")
    public void user_back_to_products_homepage(){
        checkoutPage.clickBackToProductsButton();
        Assert.assertEquals(loginPage.getProductHomePageTxt(), "Products");
        extentTest.log(LogStatus.PASS, "User back to products homepage");
    }

    // 6, Scenario: User logout from website
    @Given("User in the products homepage")
    public void user_in_the_products_homepage(){
        Assert.assertEquals(loginPage.getProductHomePageTxt(), "Products");
        extentTest.log(LogStatus.PASS, "User in the products homepage");
    }

    @When("User click side bar button")
    public void user_click_side_bar_button(){
        checkoutPage.clickSideBarButton();
        extentTest.log(LogStatus.PASS, "User click side bar button");
    }

    @And("User click logout button")
    public void user_click_logout_button(){
        checkoutPage.clickLogoutButton();
        extentTest.log(LogStatus.PASS, "User click logout button");
    }

    @Then("User logged out from website")
    public void user_logged_out_from_website(){
        Assert.assertEquals(loginPage.getLoginButtonValue(), "Login");
        extentTest.log(LogStatus.PASS, "User logged out from website");
    }
}
