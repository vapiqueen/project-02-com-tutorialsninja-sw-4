package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LoginPage;
import com.tutorialsninja.pages.RegisterPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class MyAccount extends BaseTest {

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() throws InterruptedException {
        //1.1
        homePage.clickOnAccountLink();

        //1.2
        homePage.callMethodAndPassParameter("Register");

        //1.3
        registerPage.verifyTextRegister();
    }

    // 2. Test name verifyUserShouldNavigateToLoginPageSuccessfully()
    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() throws InterruptedException {
        //2.1
        homePage.clickOnAccountLink();

        //2.2
        homePage.callMethodAndPassParameter("Login");

        //2.3
        loginPage.verifyTextReturningCustomer();
    }

    //3. Test name verifyThatUserRegisterAccountSuccessfully()
    @Test
    public void verifyThatUserRegisterAccountSuccessfully() throws InterruptedException {
        //3.1
        homePage.clickOnAccountLink();

        //3.2
        homePage.callMethodAndPassParameter("Register");

        //3.3
        registerPage.firstName();

        //3.4
        registerPage.lastName();

        //3.5
        registerPage.email();

        //3.6
        registerPage.telephone();

        //3.7
        registerPage.setPassword();

        //3.8
        registerPage.setConfirmPassword();

        //3.9
        registerPage.clickOnSubscribe();

        //3.10
        registerPage.clickOnPrivacyBox();

        //3.11
        registerPage.clickOnContinue();

        //3.12
        registerPage.verifyAccountText();

        //3.13
        registerPage.clickOnContinueTwo();

        // 3.14
        homePage.clickOnAccountLink();

        // 3.15
        homePage.callMethodAndPassParameter("Logout");

        // 3.16
        homePage.verifyTextLogOut();

        //3.17
        homePage.clickContinue();
    }

    // 4. Test name verifyThatUserShouldLoginAndLogoutSuccessfully()
    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() throws InterruptedException {
        //4.1
        homePage.clickOnAccountLink();

        //4.2
        homePage.callMethodAndPassParameter("Login");

        //4.3
        loginPage.enterEmail();

        //4.5
        loginPage.enterPassword();

        //4.6
        loginPage.clickLoginButton();

        //4.7
        loginPage.verifyMyAccountText();

        //4.8
        homePage.clickOnAccountLink();

        //4.9
        homePage.callMethodAndPassParameter("Logout");

        //4.10
        homePage.verifyTextLogOut();

        //4.11
        homePage.clickContinue();
    }

}
