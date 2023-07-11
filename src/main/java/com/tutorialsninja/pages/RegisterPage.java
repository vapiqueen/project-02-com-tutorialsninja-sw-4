package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    By actualTextRegister = By.xpath("//h1[contains(text(),'Register Account')]");
    By firstName = By.xpath("//input[@id='input-firstname']");
    By lastName = By.xpath("//input[@id='input-lastname']");
    By email = By.xpath("//input[@id='input-email']");
    By telephone = By.xpath("//input[@id='input-telephone']");
    By password = By.xpath("//input[@id='input-password']");
    By confirmPassword = By.xpath("//input[@id='input-confirm']");
    By clickRadioSubscription = By.xpath("//input[@type='radio'][@name='newsletter'][@value='1']");
    By clickOnPrivacyBox = By.xpath("//input[@type='checkbox'][@name='agree'][@value='1']");
    By clickOnContinue = By.xpath("//input[@value='Continue']");
    By actualAccountCreatedText = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
    By clickContinueTwo = By.xpath("//a[contains(text(),'Continue')]");

    public void verifyTextRegister() throws InterruptedException {
        Thread.sleep(1000);
        //1.3 Verify the text “Register Account”.
        assertVerifyText(actualTextRegister, "Register Account", "Register text not verify");
    }

    public void firstName() throws InterruptedException {
        Thread.sleep(1000);
        //3.3 Enter First Name
        sendTextToElement(firstName, "Sarvat");
    }

    public void lastName() throws InterruptedException {
        Thread.sleep(1000);
        //3.4 Enter Last Name
        sendTextToElement(lastName, "Shaikh");
    }

    public void email() throws InterruptedException {
        Thread.sleep(1000);
        //3.5 Enter Email
        sendTextToElement(email, "iambossy@googly.com");
    }

    public void telephone() throws InterruptedException {
        Thread.sleep(1000);
        //3.6 Enter Telephone
        sendTextToElement(telephone, "9825868472");
    }

    public void setPassword() throws InterruptedException {
        Thread.sleep(1000);
        //3.7 Enter Password
        sendTextToElement(password, "iamboss");
    }

    public void setConfirmPassword() throws InterruptedException {
        Thread.sleep(1000);
        //3.8 Enter Password Confirm
        sendTextToElement(confirmPassword, "iamboss");
    }

    public void clickOnSubscribe() throws InterruptedException {
        Thread.sleep(1000);
        //3.9 Select Subscribe Yes radio button
        clickOnElement(clickRadioSubscription);
    }

    public void clickOnPrivacyBox() throws InterruptedException {
        Thread.sleep(1000);
        //3.10 Click on Privacy Policy check box
        clickOnElement(clickOnPrivacyBox);
    }

    public void clickOnContinue() throws InterruptedException {
        Thread.sleep(1000);
        //3.11 Click on Continue button
        clickOnElement(clickOnContinue);
    }

    public void verifyAccountText() throws InterruptedException {
        Thread.sleep(1000);
        //3.12 Verify the message “Your Account Has Been Created!”
        assertVerifyText(actualAccountCreatedText, "Your Account Has Been Created!", "Account text not found");
    }

    public void clickOnContinueTwo() throws InterruptedException {
        Thread.sleep(1000);
        //3.13 Click on Continue button
        clickOnElement(clickContinueTwo);
    }
}
