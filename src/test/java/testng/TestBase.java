package testng;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.CheckoutPage;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestBase {

    private static WebDriver driver;

    public LoginPage loginPage;


    @BeforeSuite
    public void setUpChrome(){
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();

        String url = "https://www.saucedemo.com/";

        driver.get(url);


        loginPage = new LoginPage();

    }

    @AfterSuite
    public void finish(){
        DriverSingleton.delay(3);
        DriverSingleton.closeObjectInstance();
    }

}
