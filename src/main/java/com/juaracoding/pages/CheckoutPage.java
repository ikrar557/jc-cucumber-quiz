package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    private WebDriver driver;

    public CheckoutPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy (name = "firstName")
    private WebElement firstNameField;

    @FindBy (name = "lastName")
    private WebElement lastNameField;

    @FindBy (name = "postalCode")
    private WebElement postalCodeField;

    @FindBy (xpath = "//h3[contains(.,'First Name is required')]")
    private WebElement firstNameRequiredTxt;

    @FindBy (xpath = "//h3[contains(.,'Last Name is required')]")
    private WebElement lastNameRequiredTxt;

    @FindBy (xpath = "//h3[contains(.,'Postal Code is required')]")
    private WebElement postalCodeRequiredTxt;

    @FindBy (name = "checkout")
    private WebElement checkoutButton;

    @FindBy (xpath = "//span[contains(., 'Checkout: Your Information')]")
    private WebElement yourInformationTitleTxt;

    @FindBy (xpath = "//span[contains(., 'Checkout: Overview')]")
    private WebElement overviewTitleTxt;

    @FindBy (xpath = "//span[contains(., 'Checkout: Complete!')]")
    private WebElement completeTitleTxt;

    @FindBy (name = "continue")
    private WebElement continueCheckoutButton;

    @FindBy (name = "finish")
    private WebElement finishButton;

    @FindBy (name = "back-to-products")
    private WebElement backToProductsButton;

    public void setFirstName(String firstName){
        this.firstNameField.sendKeys(firstName);
    }

    public void setLastNameField(String lastName){
        this.lastNameField.sendKeys(lastName);
    }

    public void setPostalCodeField(String postalCode){
        this.postalCodeField.sendKeys(postalCode);
    }

    public String getFirstNameRequiredTxt(){
        return firstNameRequiredTxt.getText();
    }

    public String getLastNameRequiredTxt(){
        return lastNameRequiredTxt.getText();
    }

    public String getPostalCodeRequiredTxt(){
        return postalCodeRequiredTxt.getText();
    }

    public void clickCheckoutButton(){
        checkoutButton.click();
    }

    public String getYourInformationTitleTxt(){
        return  yourInformationTitleTxt.getText();
    }

    public String getOverviewTitleTxt(){
        return  overviewTitleTxt.getText();
    }

    public String getCompleteTitleTxt(){
        return  completeTitleTxt.getText();
    }
    public void clickContinueCheckout(){
        continueCheckoutButton.click();
    }

    public void clickFinishButton(){
        finishButton.click();
    }

    public void clickBackToProductsButton(){
        backToProductsButton.click();
    }

    public void performUserCheckoutInformation(String firstName, String lastName, String postalCode){
        this.firstNameField.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        this.lastNameField.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        this.postalCodeField.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        this.firstNameField.sendKeys(firstName);
        this.lastNameField.sendKeys(lastName);
        this.postalCodeField.sendKeys(postalCode);
        continueCheckoutButton.click();
    }

}
