package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {

    By currency = By.xpath("//span[contains(text(),'Currency')]");
    By currencyPound = By.xpath("//button[contains(text(),'£Pound Sterling')]");
    By allListOfTopMenu = By.xpath("//button[contains(text(),'£Pound Sterling')]");
    By mouseHoverToDesktopClick = By.xpath("//a[text()='Desktops']");
    By getMouseHoverToLaptop = By.xpath("//a[text()='Laptops & Notebooks']");
    By mouseHoverToComponents = By.xpath("//a[text()='Components']");
    By getListForAccountDropdown = By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li");
    By clickOnMyAccountLink = By.xpath("//span[contains(text(),'My Account')]");
    By actualLogoutText = By.xpath("//h1[contains(text(),'Account Logout')]");
    By clickOnContinue = By.xpath("//a[contains(text(),'Continue')]");

    By verifyTextAllLaptops = By.xpath("//a[contains(text(),'Show AllLaptops & Notebooks')]");

    public void currency() {
        clickOnElement(currency);
        clickOnElement(currencyPound);
    }

    public void verifyAllLaptopTest (){
        assertVerifyText(verifyTextAllLaptops, "Show AllLaptops & Notebooks","Show AllLaptops & Notebooks");
    }

    public void selectMenu(String menu) {

        List<WebElement> topMenuList = getListOfElements(allListOfTopMenu);
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = getListOfElements(allListOfTopMenu);
        }
        clickOnElement(By.linkText(menu));
    }

    public void hoverMouseToDesktopClick() throws InterruptedException {
        Thread.sleep(1000);
        //1.1 Mouse hover on “Desktops” Tab and click
        mouseHoverToElement(mouseHoverToDesktopClick);
    }

    public void callAllMenuBySelect(String desktopText) throws InterruptedException {
        Thread.sleep(1000);
        //1.2 call selectMenu method and pass the menu = “Show All Desktops”
        selectMenu(desktopText);
    }

    public void mouseHoverToLapTop() throws InterruptedException {
        Thread.sleep(1000);
        //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        mouseHoverToElement(getMouseHoverToLaptop);
    }

    public void mouseHoverToComponents() throws InterruptedException {
        Thread.sleep(1000);
        //3.1
        mouseHoverToElement(mouseHoverToComponents);
    }

    public void selectMyAccountOptions(String option) {
        List<WebElement> myAccountList = getListOfElements(getListForAccountDropdown);
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = getListOfElements(getListForAccountDropdown);
        }
    }

    public void clickOnAccountLink() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(clickOnMyAccountLink);
    }

    public void callMethodAndPassParameter(String accountText) throws InterruptedException {
        Thread.sleep(1000);
        //1.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        selectMyAccountOptions(accountText);
    }

    public void verifyTextLogOut() throws InterruptedException {
        Thread.sleep(1000);
        // 3.16
        assertVerifyText(actualLogoutText, "Account Logout", "Logout text not found");
    }

    public void clickContinue() throws InterruptedException {
        Thread.sleep(1000);
        //3.17 Click on Continue button
        clickOnElement(clickOnContinue);
    }

}
