package juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;
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

    private static LoginPage loginPage;

    @BeforeAll
    public static void setUp(){
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();



        loginPage = new LoginPage();
    }

    @AfterAll
    public static void finish(){
        DriverSingleton.delay(3);
        DriverSingleton.closeObjectInstance();
    }

    @Given("Admin enter url web HRM")
    public void admin_enter_url_web_hrm(){
        String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

        driver.get(url);
//        Assert.assertEquals(driver.getCurrentUrl(), url);
    }

    @When("Admin enter username")
    public void admin_enter_username(){
        loginPage.setUsername("Admin");
    }

    @And("Admin enter password")
    public void admin_enter_password(){
        loginPage.setPassword("admin123");
    }

    @And("Admin click login button")
    public void admin_click_login_button(){
        loginPage.btnLogin.click();
    }

//    @Then("Admin login successful redirect page dashboard")
//    public void admin_login_successful_redirect_page_dashboard(){
//        Assert.assertEquals(loginPage.getTxtDashboard(), "Dashboard");
//    }

//    @Given("Admin enter url web HRM or Admin logout")
//    public void admin_enter_url_web_HRM_or_Admin_logout(){
//        loginPage.performUserLogout();
//    }
//
//    @When("Admin enter wrong username")
//    public void admin_enter_wrong_username(){
//        loginPage.setUsername("Adminn");
//    }
//
//    @Then("Admin invalid login")
//    public void admin_invalid_login(){
//        Assert.assertTrue(loginPage.getTxtInvalidLogin().contains("Invalid"));
//    }


}
