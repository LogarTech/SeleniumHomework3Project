package com.uiTestPractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditPage {
    public EditPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "FirstName")
    WebElement firstName;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement saveButton;



    public void editFirstName(String firstName){
        this.firstName.clear();
        this.firstName.sendKeys(firstName);
        saveButton.click();
    }
}
