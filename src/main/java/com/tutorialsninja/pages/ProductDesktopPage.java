package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductDesktopPage extends Utility {

    By actualTextHP = By.xpath("//h1[contains(text(),'HP LP3065')]");
    By enterQty = By.xpath("//input[@id='input-quantity']");
    By clickOnAddToCart = By.xpath("//button[@id='button-cart']");
    By actualMessageSuccess = By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible");
    By clickOnShoppingCart = By.xpath("//a[contains(text(),'shopping cart')]");

    public void verifyTextHp() throws InterruptedException {
        Thread.sleep(1000);
        //2.5 Verify the Text "HP LP3065"
        assertVerifyText(actualTextHP, "HP LP3065", "Hp text not found");
    }

    public void selectDeliveryDate() throws InterruptedException {
        Thread.sleep(1000);
        //2.6 Select Delivery Date "2022-11-30"
        String year = "2023";
        String month = "November";
        String date = "30";
        clickOnElement(By.xpath("//div[@class = 'input-group date']//button"));
        while (true) {
            String monthAndYear = driver.findElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")).getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']"));
            }
        }
        List<WebElement> allDates = driver.findElements(By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']"));
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }
    }

    public void enterQtyOne() throws InterruptedException {
        //2.7.Enter Qty '1' using Select class.
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='input-quantity']")).clear();
        sendTextToElement(enterQty, "1");
    }

    public void clickOnAddToCartButton() throws InterruptedException {
        Thread.sleep(1000);
        //2.8 Click on “Add to Cart” button
        clickOnElement(clickOnAddToCart);
    }

    public void verifyTextSuccess() throws InterruptedException {
        Thread.sleep(1000);
        //driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText().replace("x"," ");
        assertVerifyText(actualMessageSuccess, "Success: You have added HP LP3065 to your shopping cart!\n" +
                "×", "Success message not found");
    }

    public void clickOnShoppingCartLink() throws InterruptedException {
        Thread.sleep(1000);
        //2.10 Click on the link “shopping cart” display into the success message
        clickOnElement(clickOnShoppingCart);
    }

}
