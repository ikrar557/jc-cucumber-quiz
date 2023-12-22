package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.CheckoutPage;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.ProductsPage;
import org.openqa.selenium.WebDriver;

public class MainTest {

    private static WebDriver driver;

    public static void main(String[] args) {
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();

        String url = "https://www.saucedemo.com/";

        driver.get(url);

        LoginPage loginPage = new LoginPage();

        loginPage.performUserBlankLogin("", "");
        DriverSingleton.delay(1);
        System.out.println(loginPage.getBlankPasswordLoginTxt());

        loginPage.performUserInvalidLogin("sstandard_userr", "secret_sauce");
        DriverSingleton.delay(1);
        System.out.println(loginPage.getInvalidLoginTxt());

        loginPage.performUserLogin("standard_user", "secret_sauce");
        DriverSingleton.delay(3);
        System.out.println(loginPage.getProductHomePageTxt());

        ProductsPage productsPage = new ProductsPage();

        productsPage.clickAddBackpack();
        productsPage.clickAddBikeLight();
        productsPage.clickShoppingCartLink();
        DriverSingleton.delay(1);

        CheckoutPage checkoutPage = new CheckoutPage();

        checkoutPage.clickCheckoutButton();
        checkoutPage.setFirstName("Ikrar");
        checkoutPage.setLastNameField("Bagaskara");
        checkoutPage.setPostalCodeField("57474");
        checkoutPage.clickContinueCheckout();
        checkoutPage.clickFinishButton();
        checkoutPage.clickBackToProductsButton();

        DriverSingleton.closeObjectInstance();

    }

}
