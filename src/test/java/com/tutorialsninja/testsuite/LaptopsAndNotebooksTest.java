package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.*;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class LaptopsAndNotebooksTest extends BaseTest {

    HomePage homePage = new HomePage();
    LaptopNoteBookPage laptopNoteBookPage = new LaptopNoteBookPage();
    ProductLaptopPage productLaptopPage = new ProductLaptopPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckOutPage checkOutPage = new CheckOutPage();


    @Test
    public void verifyProductPriceDisplayHighToLowSuccessfully() throws InterruptedException {
        //1.1 Mouse hover on Laptops & Notebooks Tab.and click
        homePage.mouseHoverToLapTop();
        Thread.sleep(1000);

        //1.2 Click on “Show All Laptops & Notebooks”
        homePage.callAllMenuBySelect("Show AllLaptops & Notebooks");
        Thread.sleep(1000);

        //1.3 Select Sort By "Price (High > Low)"
        laptopNoteBookPage.sortByPrice();
        Thread.sleep(1000);

        //1.4 Verify the Product price will arrange in High to Low order.
        laptopNoteBookPage.verifyProductHighTOLow();
        Thread.sleep(1000);
    }

    //2. Test name verifyThatUserPlaceOrderSuccessfully()
    @Test
    public void verifyThatUserPlaceOrderSuccessfully() throws InterruptedException {
        // changing the currency from $ to £
        homePage.currency();
        Thread.sleep(500);

        //2.1
        homePage.mouseHoverToLapTop();

        //2.2
        homePage.callAllMenuBySelect("Show AllLaptops & Notebooks");

        //2.3
        laptopNoteBookPage.sortByPrice();

        //2.4
        laptopNoteBookPage.selectProductMacBook();

        //2.5
        productLaptopPage.verifyTextMacBook();

        //2.6
        productLaptopPage.clickOnAddToCartLink();

        //2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
        productLaptopPage.verifyTextSuccess();

        //2.8
        productLaptopPage.clickOnShoppingCartLink();

        // 2.9
        shoppingCartPage.verifyTextShoppingCart();

        //2.10
        shoppingCartPage.verifyProductMacBook();

        //2.11
        shoppingCartPage.changeQty();

        //2.12
        shoppingCartPage.clickOnUpdateButton();

        //2.13
        shoppingCartPage.verifyTextSuccess();

        //2.14
        shoppingCartPage.verifyTotalOfLaptop();

        //2.15
        shoppingCartPage.checkoutButton();

        //2.16
        checkOutPage.verifyTextCheckOut();

        //2.17
        checkOutPage.verifyTextNewCustomer();

        //2.18
        checkOutPage.clickOnGuestCheckOut();

        //2.19
        checkOutPage.clickOnContinue();

        //2.20
        checkOutPage.fillAllField();

        //2.21
        checkOutPage.clickOnContinueTwo();

        //2.22
        checkOutPage.addComment();

        //2.23
        checkOutPage.clickOnCheckBoxTerm();

        //2.24
        checkOutPage.clickOnContinueThree();

        //2.25
        checkOutPage.verifyErrorText();
    }


}
