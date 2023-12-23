package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.lang.model.element.Name;

public class ProductsPage {
    private WebDriver driver;

    public ProductsPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy (name = "add-to-cart-sauce-labs-backpack")
    private WebElement productBackpack;

    @FindBy (name = "add-to-cart-sauce-labs-fleece-jacket")
    private WebElement productJacket;

    @FindBy (name = "add-to-cart-sauce-labs-bike-light")
    private WebElement productBikeLight;

    @FindBy (name = "add-to-cart-test.allthethings()-t-shirt-(red)")
    private WebElement productTShirtRed;

    @FindBy (name = "add-to-cart-sauce-labs-bolt-t-shirt")
    private WebElement productBoltTShirt;

    @FindBy (name = "add-to-cart-sauce-labs-onesie")
    private WebElement productOnesie;

    @FindBy (xpath = "//div[@id='shopping_cart_container']/a")
    private WebElement shoppingCartLink;

    @FindBy (xpath = "//div[.='Sauce Labs Backpack']")
    private WebElement backpackTitleTxt;

    @FindBy (xpath = "//div[.='Sauce Labs Bike Light']")
    private WebElement bikeLightTitleTxt;

    @FindBy (xpath = "//div[.='Sauce Labs Bolt T-Shirt']")
    private WebElement boltTShirtTitleTxt;

    @FindBy (xpath = "//div[.='Sauce Labs Fleece Jacket']")
    private WebElement jacketTitleTxt;

    @FindBy (xpath = "    //div[.='Sauce Labs Onesie']")
    private WebElement onesieTitleTxt;

    @FindBy (xpath = "//div[.='Test.allTheThings() T-Shirt (Red)']")
    private WebElement redTShirtTitleTxt;

    @FindBy (name = "remove-test.allthethings()-t-shirt-(red)")
    private WebElement removeProductRedTShirt;

    @FindBy (name = "remove-sauce-labs-bolt-t-shirt")
    private WebElement removeProductBoltTShirt;


    public void clickAddBackpack(){
        productBackpack.click();
    }

    public void clickAddJacket(){
        productJacket.click();
    }

    public void clickAddBikeLight(){
        productBikeLight.click();
    }

    public void clickAddRedTShirt(){
        productTShirtRed.click();
    }

    public void clickAddBoltTShit(){
        productBoltTShirt.click();
    }

    public void clickAddOnesie(){
        productOnesie.click();
    }

    public void clickShoppingCartLink(){
        shoppingCartLink.click();
    }

    public String getBackpackTitleTxt(){
        return backpackTitleTxt.getText();
    }

    public String getBikeLightTitleTxt(){
        return bikeLightTitleTxt.getText();
    }

    public String getBoltTShirtTitleTxt(){
        return boltTShirtTitleTxt.getText();
    }

    public String getJacketTitleTxt(){
        return jacketTitleTxt.getText();
    }

    public String getOnesiaTitleTxt(){
        return onesieTitleTxt.getText();
    }

    public String getRedTShirtTitleTxt(){
        return redTShirtTitleTxt.getText();
    }

    public void clickRemoveProductRedTShirt(){
        removeProductRedTShirt.click();
    }

    public void clickRemoveProductBoltTShirt(){
        removeProductBoltTShirt.click();
    }


}
