package com.uiTestPractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[contains(text(), 'Create New')]")
    WebElement createButton;

    @FindBy(id = "Search_Data")
    WebElement searchBar;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement findButton;

    public void  clickCreateButton(WebDriver driver) {
        createButton.click();
       driver.navigate().back();
        createButton.click();
    }

    public void searchNames(String searchBar1){
        searchBar.sendKeys(searchBar1);
        findButton.click();
    }


}
