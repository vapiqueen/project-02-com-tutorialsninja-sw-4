package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {

    By actualTextCheckOut = By.xpath("//a[text()='Checkout']");
    By actualTextNewCustomer = By.xpath("//h2[contains(text(),'New Customer')]");
    By clickOnGuest = By.xpath("//input[@value='guest']");
    By clickOnContinue = By.xpath("//input[@id='button-account']");
    By firstName = By.xpath("//input[@id='input-payment-firstname']");
    By lastName = By.xpath("//input[@id='input-payment-lastname']");
    By email = By.xpath("//input[@id='input-payment-email']");
    By phoneNumber = By.xpath("//input[@id='input-payment-telephone']");
    By address = By.xpath("//input[@id='input-payment-address-1']");
    By city = By.xpath("//input[@id='input-payment-city']");
    By postCode = By.xpath("//input[@id='input-payment-postcode']");
    By country = By.xpath("//select[@id='input-payment-country']");
    By zone = By.xpath("//select[@id='input-payment-zone']");
    By clickOnContinueTwo = By.xpath("//input[@id='button-guest']");
    By addComment = By.xpath("//textarea[@class='form-control']");
    By clickTermCondition = By.xpath("//input[@name='agree']");
    By clickOnContinueThree = By.xpath("//input[@id='button-payment-method']");
    By actualErrorText = By.xpath("//div[text()='Warning: Payment method required!']");

    public void verifyTextCheckOut() throws InterruptedException {
        Thread.sleep(1000);
        //2.16
        assertVerifyText(actualTextCheckOut, "Checkout", "Checkout text not found");
    }

    public void verifyTextNewCustomer() throws InterruptedException {
        Thread.sleep(1000);
        //2.17
        assertVerifyText(actualTextNewCustomer, "New Customer", "New Customer text not found");
    }

    public void clickOnGuestCheckOut() throws InterruptedException {
        Thread.sleep(1000);
        //2.18
        clickOnElement(clickOnGuest);
    }

    public void clickOnContinue() throws InterruptedException {
        Thread.sleep(1000);
        //2.19
        clickOnElement(clickOnContinue);
    }

    public void fillAllField() throws InterruptedException {
        Thread.sleep(1000);
        //2.20
        sendTextToElement(firstName, "Sarvat");

        sendTextToElement(lastName, "Shaikh");

        sendTextToElement(email, "iambossy@googly.com");

        sendTextToElement(phoneNumber, "9825868472");

        sendTextToElement(address, "283 HighRoad");

        sendTextToElement(city, "London");

        sendTextToElement(postCode, "EN8 4HH");

        selectByVisibleTextFromDropDown(country, "United Kingdom");

        selectByVisibleTextFromDropDown(zone, "Greater London");
    }

    public void clickOnContinueTwo() throws InterruptedException {
        Thread.sleep(1000);
        //2.21
        clickOnElement(clickOnContinueTwo);
    }

    public void addComment() throws InterruptedException {
        Thread.sleep(1000);
        //2.22
        sendTextToElement(addComment, "Please make sure the packaging is secure from all ends as last time it was raining and my parcel was completely wet. Leave the parcel on the right side of my porch. Thanks in Advance.");
    }

    public void clickOnCheckBoxTerm() throws InterruptedException {
        Thread.sleep(1000);
        //2.23
        clickOnElement(clickTermCondition);
    }

    public void clickOnContinueThree() throws InterruptedException {
        Thread.sleep(1000);
        //2.24
        clickOnElement(clickOnContinueThree);
    }

    public void verifyErrorText() {
        //2.25 Verify the message “Warning: Payment method required!”
        assertVerifyText(actualErrorText, "Warning: Payment method required!\n" +
                "×", "Warning message not found");
    }


}
