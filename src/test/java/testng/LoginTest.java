package testng;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest extends TestBase{

    @BeforeSuite
    public void testEnvironmentSetUp(){
        setUpChrome();
    }

    @Test(priority = 1)
    public void testUsernameBlankLogin(){
        loginPage.performUserLogin("", "secret_sauce");
        Assert.assertEquals(loginPage.getBlankUsernameLoginTxt(), "Epic sadface: Username is required");
    }

    @Test(priority = 2)
    public void testPasswordBlankLogin(){
        loginPage.performUserLogin("standard_user", "");
        Assert.assertEquals(loginPage.getBlankPasswordLoginTxt(), "Epic sadface: Password is required");
    }

    @Test(priority = 3)
    public void testInvalidLogin(){
        loginPage.performUserLogin("sstandard_userr", "secret_sauce");
        Assert.assertEquals(loginPage.getInvalidLoginTxt(), "Epic sadface: Username and password do not match any user in this service");

    }

    @Test(priority = 4)
    public void testValidLogin(){
        loginPage.performUserLogin("standard_user", "secret_sauce");
        Assert.assertEquals(loginPage.getProductHomePageTxt(), "Products");
    }

}
