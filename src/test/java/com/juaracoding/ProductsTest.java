package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.ProductsPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProductsTest {

    private static WebDriver driver;

    private static ExtentTest extentTest;

    private static ProductsPage productsPage = new ProductsPage();

    private static LoginPage loginPage = new LoginPage();

    public ProductsTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User go to products homepage")
    public void user_go_to_products_homepage(){
        Assert.assertEquals(loginPage.getProductHomePageTxt(), "Products");
        extentTest.log(LogStatus.PASS, "User go to products homepage");
    }

    @When("User add product jacket")
    public void user_add_product_jacket(){
        productsPage.clickAddJacket();
        extentTest.log(LogStatus.PASS, "User add product jacket");

    }

    @And("User add product backpack")
    public void user_add_product_backpack(){
        productsPage.clickAddBackpack();
        extentTest.log(LogStatus.PASS, "User add product backpack");

    }

    @And("User add product bike light")
    public void user_add_product_bike_light(){
        productsPage.clickAddBikeLight();
        extentTest.log(LogStatus.PASS, "User add product bike light");

    }

    @And("User add product red t shirt")
    public void user_add_product_red_t_shirt(){
        productsPage.clickAddRedTShirt();
        extentTest.log(LogStatus.PASS, "User add product red t shirt");

    }

    @And("User add product bolt t shirt")
    public void user_add_product_bolt_t_shirt(){
        productsPage.clickAddBoltTShit();
        extentTest.log(LogStatus.PASS, "User add product bolt t shirt");

    }

    @And("User add product onesie")
    public void user_add_product_onesie(){
        productsPage.clickAddOnesie();
        extentTest.log(LogStatus.PASS, "User add product onesie");

    }

    @And("User click shopping cart")
    public void user_click_shopping_cart(){
        productsPage.clickShoppingCartLink();
        extentTest.log(LogStatus.PASS, "User click shopping cart");
    }

    @Then("User success to add all products")
    public void user_success_to_add_all_products(){
        Assert.assertEquals(productsPage.getBackpackTitleTxt(), "Sauce Labs Backpack");
        Assert.assertEquals(productsPage.getJacketTitleTxt(), "Sauce Labs Fleece Jacket");
        Assert.assertEquals(productsPage.getBikeLightTitleTxt(), "Sauce Labs Bike Light");
        Assert.assertEquals(productsPage.getRedTShirtTitleTxt(), "Test.allTheThings() T-Shirt (Red)");
        Assert.assertEquals(productsPage.getBoltTShirtTitleTxt(), "Sauce Labs Bolt T-Shirt");
        Assert.assertEquals(productsPage.getOnesiaTitleTxt(), "Sauce Labs Onesie");
        extentTest.log(LogStatus.PASS, "User success to add all products");
    }

}
