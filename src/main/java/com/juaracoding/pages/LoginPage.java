package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "user-name")
    private WebElement username;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(name = "login-button")
    public WebElement btnLogin;

    @FindBy (xpath = "//h3[contains(.,'Epic sadface: Username and password do not match any user in this service')]")
    private WebElement invalidLoginTxt;

    @FindBy (xpath = "//h3[contains(.,'Epic sadface: Username is required')]")
    private WebElement blankUsernameLoginTxt;

    @FindBy (xpath = "//h3[contains(.,'Epic sadface: Password is required')]")
    private WebElement blankPasswordLoginTxt;

    @FindBy (xpath = "//span[contains(.,'Products')]")
    public WebElement productHomePage;

    public void setUsername(String username){
        this.username.sendKeys(username);
    }

    public void setPassword(String password){
        this.password.sendKeys(password);
    }
    public void performUserBlankLogin(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        btnLogin.click();
    }
    public void performUserInvalidLogin(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        btnLogin.click();
    }

    public void performUserLogin(String username, String password){
        this.username.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        this.password.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        btnLogin.click();
    }

    public String getInvalidLoginTxt(){
        return invalidLoginTxt.getText();
    }

    public String getBlankUsernameLoginTxt(){
        return blankUsernameLoginTxt.getText();
    }
    public String getBlankPasswordLoginTxt(){
        return blankPasswordLoginTxt.getText();
    }

    public String getProductHomePageTxt(){
        return productHomePage.getText();
    }

    public String getLoginButtonValue(){
        return btnLogin.getAttribute("value");
    }
}
