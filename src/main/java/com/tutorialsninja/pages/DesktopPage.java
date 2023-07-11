package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class DesktopPage extends Utility {

    By actualTextDesktop = By.xpath("//h2[contains(text(),'Desktops')]");
    By position = By.xpath("//select[@id='input-sort']");
    By productListBefore = By.xpath("//h4/a");
    By productListAfter = By.xpath("//h4/a");
    By clickOnProductHp = By.xpath("//a[contains(text(),'HP LP3065')]");

    public void verifyTextDesktop() throws InterruptedException {
        Thread.sleep(1000);
        //1.3 Verify the text ‘Desktops’
        assertVerifyText(actualTextDesktop, "Desktops", "Desktop text not found");
    }

    public void changeProductPosition(String textPosition) throws InterruptedException {
        Thread.sleep(1000);
        // 1.3 Select Sort By position "Name: Z to A" ---- for desktop page
        selectByVisibleTextFromDropDown(position, textPosition);
    }

    public void verifyProductInDescendingOrder() throws InterruptedException {
        Thread.sleep(1000);
        //1.4 Verify the Product will arrange in Descending order.
        listVerifyInReverseOrder(productListBefore, position, "Name (Z - A)", productListAfter);
    }

    public void clickOnProductHp() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(clickOnProductHp);
    }

}
