package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class ProductLaptopPage extends Utility {

    By actualMacBookText = By.xpath("//h1[contains(text(),'MacBook')]");
    By clickAddToCart = By.xpath("//button[@id='button-cart']");
    By actualTextSuccessMessage = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By clickOnShoppingCartLink = By.xpath("//a[contains(text(),'shopping cart')]");

    public void verifyTextMacBook() throws InterruptedException {
        Thread.sleep(1000);
        //2.5 Verify the text “MacBook”
        assertVerifyText(actualMacBookText, "MacBook", "MacBook text not found");
    }

    public void clickOnAddToCartLink() throws InterruptedException {
        Thread.sleep(1000);
        //2.6 Click on ‘Add To Cart’ button
        clickOnElement(clickAddToCart);
    }

    public void verifyTextSuccess() throws InterruptedException {
        Thread.sleep(1000);
        //2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
        assertVerifyText(actualTextSuccessMessage, "Success: You have added MacBook to your shopping cart!\n×", "Product added text not found");
    }

    public void clickOnShoppingCartLink() throws InterruptedException {
        Thread.sleep(1000);
        //2.8 Click on link “shopping cart” display into the success message
        clickOnElement(clickOnShoppingCartLink);
    }

}
