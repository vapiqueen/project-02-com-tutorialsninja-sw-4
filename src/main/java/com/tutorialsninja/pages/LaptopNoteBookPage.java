package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopNoteBookPage extends Utility {

    By actualTextLaptopNotebook = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");
    By sortBy= By.xpath("//select[@id='input-sort']");
    By productListBefore = By.xpath("//p[@class ='price']");
    By productListAfter = By.xpath("//p[@class ='price']");
    By selectProductMac= By.xpath("//a[text()='MacBook']");


    public void verifyTextLaptopNoteBook()
    {
        //2.3 Verify the text ‘Laptops & Notebooks’
        assertVerifyText(actualTextLaptopNotebook,"Laptops & Notebooks","Not navigated to laptop page");
    }
    public void sortByPrice()
    {
        selectByVisibleTextFromDropDown(sortBy,"Price (High > Low)");
    }
    public void verifyProductHighTOLow()
    {
        //1.4 Verify the Product price will arrange in High to Low order.
        // Get all the products price and stored into array list
        List<WebElement> products = driver.findElements(productListBefore);
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",","")));
        }
        System.out.println(originalProductsPrice);
        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        System.out.println(originalProductsPrice);

        //1.3 Select Sort By "Price (High > Low)"
        sortByPrice();

        // After filter Price (High > Low) Get all the product price and stored into arraylist
        products = driver.findElements(productListAfter);
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",","")));
        }
        System.out.println(afterSortByPrice);
        //1.4 Verify the Product price will arrange in High to Low order.
        Assert.assertEquals(originalProductsPrice, afterSortByPrice,"Product not sorted by price High to Low");
    }
    public void selectProductMacBook()
    {
        //2.4 Select Product “MacBook”
        clickOnElement(selectProductMac);
    }

}
