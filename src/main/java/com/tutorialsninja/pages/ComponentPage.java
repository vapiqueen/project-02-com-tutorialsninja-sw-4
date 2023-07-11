package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class ComponentPage extends Utility {
    By actualTextComponent = By.xpath("//h2[contains(text(),'Components')]");

    public void verifyTextComponents() {


        //3.3 Verify the text 'Components'
        assertVerifyText(actualTextComponent, "Components", "Not navigated to components page");
    }

}
