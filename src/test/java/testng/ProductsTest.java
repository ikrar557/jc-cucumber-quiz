package testng;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ProductsTest extends TestBase{
    private ProductsPage productsPage;
    @BeforeTest
    private void setUp(){
        productsPage = new ProductsPage();
    }
    @Test (priority = 1)
    public void testAddProducts(){
        productsPage.clickAddBackpack();
        productsPage.clickAddBikeLight();
        productsPage.clickAddJacket();
        productsPage.clickAddOnesie();
        productsPage.clickAddBoltTShit();
        productsPage.clickAddRedTShirt();
        productsPage.clickShoppingCartLink();

        Assert.assertEquals(productsPage.getBackpackTitleTxt(), "Sauce Labs Backpack");
        Assert.assertEquals(productsPage.getBikeLightTitleTxt(), "Sauce Labs Bike Light");
        Assert.assertEquals(productsPage.getBoltTShirtTitleTxt(), "Sauce Labs Bolt T-Shirt");
        Assert.assertEquals(productsPage.getJacketTitleTxt(), "Sauce Labs Fleece Jacket");
        Assert.assertEquals(productsPage.getOnesiaTitleTxt(), "Sauce Labs Onesie");
        Assert.assertEquals(productsPage.getRedTShirtTitleTxt(), "Test.allTheThings() T-Shirt (Red)");
    }

    @Test (priority = 2)
    public void testRemoveProductTShirt(){
        productsPage.clickRemoveProductRedTShirt();
        productsPage.clickRemoveProductBoltTShirt();

        // TODO: Add assert to check if removed product is work
    }

}
