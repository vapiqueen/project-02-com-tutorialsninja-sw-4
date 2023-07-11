package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    By actualShoppingCartText = By.xpath("//a[contains(text(),'Shopping Cart')]");
    By actualProductName = By.xpath("//div[@class='table-responsive']//a[text()='HP LP3065']");
    By actualDeliveryDate = By.xpath("//small[contains(text(),'Delivery Date:2023-11-30')]");
    //    By actualDeliveryDate = By.id("input-option225");
    By actualModel = By.xpath("//td[contains(text(),'Product 21')]");
    By actualTotalText = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");
    By actualTextMacbook = By.linkText("MacBook");
    By changeQtyToTwo = By.xpath("//div[@class='input-group btn-block']//input[@class='form-control']");
    By clickOnUpdate = By.xpath("//i[@class='fa fa-refresh']");
    By actualTextCartModify = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By actualTotalLaptop = By.xpath("//div[@class='col-sm-4 col-sm-offset-8']//td[text()='£737.45']");
    By clickOnCheckOutButton = By.xpath("//a[contains(text(),'Checkout')]");


    public void verifyTextShoppingCart() throws InterruptedException {
        Thread.sleep(1000);

        assertVerifyText(actualShoppingCartText, "Shopping Cart", "Shopping cart text not found");
    }

    public void verifyTextProductName() throws InterruptedException {
        Thread.sleep(1000);
        //2.12 Verify the Product name "HP LP3065"
        assertVerifyText(actualProductName, "HP LP3065", "Product name text not found");
    }

    public void verifyTextDeliveryDate() throws InterruptedException {
        Thread.sleep(1000);
        //2.13 Verify the Delivery Date "2022-11-30"
        assertVerifyText(actualDeliveryDate, "Delivery Date:2023-11-30", "Delivery date text not found");
    }

    public void verifyTextModel() throws InterruptedException {
        Thread.sleep(1000);
        //2.14 Verify the Model "Product21"
        assertVerifyText(actualModel, "Product 21", "Model text not found");
    }

    public void verifyTextTotal() throws InterruptedException {
        Thread.sleep(1000);
        //2.15 Verify the Todat "£74.73"
        assertVerifyText(actualTotalText, "£74.73", "Total text not found");
    }

    public void verifyProductMacBook() throws InterruptedException {
        Thread.sleep(1000);
        //2.10 Verify the Product name "MacBook"
        assertVerifyText(actualTextMacbook, "MacBook", "MacBook text not found");
    }

    public void changeQty() throws InterruptedException {
        Thread.sleep(1000);
        //2.11 Change Quantity "2"
        driver.findElement(By.xpath("//div[@class='input-group btn-block']//input[@class='form-control']")).clear();
        sendTextToElement(changeQtyToTwo, "2");
    }

    public void clickOnUpdateButton() throws InterruptedException {
        Thread.sleep(1000);
        //2.12 Click on “Update” Tab
        clickOnElement(clickOnUpdate);
    }

    public void verifyTextSuccess() throws InterruptedException {
        Thread.sleep(1000);
        //2.13 Verify the message “Success: You have modified your shopping cart!”
        assertVerifyText(actualTextCartModify, "Success: You have modified your shopping cart!\n" +
                "×", "success text not found");
    }

    public void verifyTotalOfLaptop() throws InterruptedException {
        Thread.sleep(1000);
        //2.14 Verify the Total £737.45
        assertVerifyText(actualTotalLaptop, "£737.45", "Total text not found");
    }

    public void checkoutButton() throws InterruptedException {
        Thread.sleep(1000);
        //2.15 Click on the "Checkout" button
        clickOnElement(clickOnCheckOutButton);
    }


}
