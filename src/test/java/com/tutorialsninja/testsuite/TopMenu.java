package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.ComponentPage;
import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopNoteBookPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class TopMenu extends BaseTest {

    HomePage homePage = new HomePage();
    DesktopPage desktopClass = new DesktopPage();
    LaptopNoteBookPage laptopNotebookPage = new LaptopNoteBookPage();
    ComponentPage componentPage = new ComponentPage();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() throws InterruptedException {
        //1.1
        homePage.hoverMouseToDesktopClick();

        //1.2
        homePage.callAllMenuBySelect("Show AllDesktops");

        //1.3
        desktopClass.verifyTextDesktop();
    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNoteBooksPageSuccessfully() throws InterruptedException {

        //2.1
        homePage.mouseHoverToLapTop();

        //2.2
        homePage.callAllMenuBySelect("Show AllLaptops & Notebooks");

        //2.3
        laptopNotebookPage.verifyTextLaptopNoteBook();
    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() throws InterruptedException {

        //3.1
        homePage.mouseHoverToComponents();

        //3.2
        homePage.callAllMenuBySelect("Show AllComponents");

        //3.3
        componentPage.verifyTextComponents();
    }

}
