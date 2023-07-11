package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By actualReturningCxText= By.xpath("//h2[contains(text(),'Returning Customer')]");
    By email= By.xpath("//input[@id='input-email']");
    By password= By.xpath("//input[@id='input-password']");
    By clickLoginButton= By.xpath("//input[@value='Login']");
    By actualTextMyAccount = By.xpath("//h2[contains(text(),'My Account')]");
    public void verifyTextReturningCustomer()
    {
        //2.3 Verify the text “Returning Customer”.
        assertVerifyText(actualReturningCxText,"Returning Customer","Return customer text not found");
    }
    public void enterEmail()
    {
        //4.3 Enter Email address
        sendTextToElement(email,"iambossy@googly.com");
    }
    public void enterPassword()
    {
        //4.3 Enter Password
        sendTextToElement(password,"iamboss");
    }
    public void clickLoginButton()
    {
        //4.6 Click on Login button
        clickOnElement(clickLoginButton);
    }
    public void verifyMyAccountText()
    {
        //4.7 Verify text “My Account”
        assertVerifyText(actualTextMyAccount,"My Account","My account text not found");
    }



}
