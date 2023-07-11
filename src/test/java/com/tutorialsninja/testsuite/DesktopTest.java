package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.ProductDesktopPage;
import com.tutorialsninja.pages.ShoppingCartPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class DesktopTest extends BaseTest {


    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();
    ProductDesktopPage productPage = new ProductDesktopPage();
    ShoppingCartPage shoppingCart = new ShoppingCartPage();


    @Test
    public void verifyProductArrangeInAlphabeticalOrder() throws InterruptedException {
        //1.1
        homePage.hoverMouseToDesktopClick();
        //1.2
        homePage.callAllMenuBySelect("Show AllDesktops");
        //1.3
        desktopPage.changeProductPosition("Name (Z - A)");
        //1.4
        desktopPage.verifyProductInDescendingOrder();

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        // Convert the currency to pound
        homePage.currency();

        //2.1
        homePage.hoverMouseToDesktopClick();

        //2.2
        homePage.callAllMenuBySelect("Show AllDesktops");

        //2.3
        desktopPage.changeProductPosition("Name (A - Z)");

        //2.4
        desktopPage.clickOnProductHp();

        //2.5
        productPage.verifyTextHp();

        //2.6
        productPage.selectDeliveryDate();

        //2.7
        productPage.enterQtyOne();

        //2.8
        productPage.clickOnAddToCartButton();

        //2.9
        productPage.verifyTextSuccess();

        //2.10
        productPage.clickOnShoppingCartLink();

        //2.11
        shoppingCart.verifyTextShoppingCart();

        //2.12
        shoppingCart.verifyTextProductName();

        //2.13
        shoppingCart.verifyTextDeliveryDate();

        //2.14
        shoppingCart.verifyTextModel();

        //2.15
        shoppingCart.verifyTextTotal();

    }

}
