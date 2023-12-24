package testng;

import com.juaracoding.pages.CheckoutPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CheckoutTest extends TestBase{
    private CheckoutPage checkoutPage;

    @BeforeTest
    private void setUp(){
        checkoutPage = new CheckoutPage();
    }

    @Test (priority = 1)
    public void testInformationField(){
        checkoutPage.clickCheckoutButton();
        Assert.assertEquals(checkoutPage.getYourInformationTitleTxt(), "Checkout: Your Information");
    }
    @Test(priority = 2)
    public void testFirstNameBlank(){
        checkoutPage.performUserCheckoutInformation("", "Bagaskara", "57474");
        Assert.assertEquals(checkoutPage.getFirstNameRequiredTxt(), "Error: First Name is required");
    }

    @Test(priority = 3)
    public void testLastNameBlank(){
        checkoutPage.performUserCheckoutInformation("Ikrar", "", "57474");
        Assert.assertEquals(checkoutPage.getLastNameRequiredTxt(), "Error: Last Name is required");
    }

    @Test(priority = 4)
    public void testPostalCodeBlank(){
        checkoutPage.performUserCheckoutInformation("Ikrar", "Bagaskara", "");
        Assert.assertEquals(checkoutPage.getPostalCodeRequiredTxt(), "Error: Postal Code is required");
    }

    @Test(priority = 5)
    public void testValidInformation(){
        checkoutPage.performUserCheckoutInformation("Ikrar", "Bagaskara", "57474");
        Assert.assertEquals(checkoutPage.getOverviewTitleTxt(), "Checkout: Overview");
    }

    @Test(priority = 6)
    public void testFinishingCheckout(){
        checkoutPage.clickFinishButton();
        Assert.assertEquals(checkoutPage.getCompleteTitleTxt(), "Checkout: Complete!");
    }

    @Test(priority = 7)
    public void testBackToProducts(){
        checkoutPage.clickBackToProductsButton();
        Assert.assertEquals(loginPage.getProductHomePageTxt(), "Products");
    }

    @Test(priority = 8)
    public void testLogoutUser(){
        checkoutPage.performUserLogout();
        Assert.assertEquals(loginPage.getLoginButtonValue(), "Login");
    }


}
