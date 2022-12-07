package com.uiTestPractice.tests;

import com.uiTestPractice.pages.*;
import org.testng.annotations.Test;

public class TestUiPractice extends TestBaseUi {

    @Test
    public void validateStudentInfo() throws InterruptedException {

        MainPage mainPage = new MainPage(driver);
        mainPage.clickCreateButton(driver);

        CreatePage createPage = new CreatePage(driver);
        createPage.createStudent("Valera", "Bardiur", "11/02/19");

        mainPage.searchNames("Valera");
        SearchPage searchPage = new SearchPage(driver);
        searchPage.validateName();

    }
    @Test
    public void validateEditName(){
        MainPage mainPage = new MainPage(driver);
        mainPage.searchNames("Valera");
        SearchPage searchPage = new SearchPage(driver);
        searchPage.clickEdit();
        EditPage editPage = new EditPage(driver);
        editPage.editFirstName("Serioga");

        mainPage.searchNames("Serioga");
        searchPage.validateName();
    }

    @Test
    public void validateDelete() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.searchNames("Bardiur");
        SearchPage searchPage = new SearchPage(driver);
        searchPage.clickDelete();
        DeletePage deletePage = new DeletePage(driver);
        deletePage.deleteName();
        Thread.sleep(3000);
        mainPage.searchNames("Bardiur");
        searchPage.validateNoStudent("\n" +
                "There are zero students with this search text\n" +
                "    Page 0 of 0\n" +
                "    ");

    }




}
