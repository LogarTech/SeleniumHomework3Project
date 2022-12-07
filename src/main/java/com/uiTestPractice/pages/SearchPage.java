package com.uiTestPractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import utils.BrowserUtils;

import java.util.ArrayList;
import java.util.List;

public class SearchPage extends CreatePage {
    public SearchPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//tr[@style='border:1px solid black;text-align:center']//td")
    List <WebElement> search;

    @FindBy(xpath = "//button[contains(text(), 'EDIT')]")
    WebElement editButton;

    @FindBy(xpath = "//button[contains(text(), 'DELETE')]")
    WebElement deleteButton;

    @FindBy(xpath = "(/html/body/div[2]/div[1]/text())[8]")
    String text;

    public void validateName(){
        for (int i = 0; i < info.size()-1; i++) {
            Assert.assertEquals(search.get(i).getText().trim(), info.get(i));
        }
    }

    public void clickEdit(){
        editButton.click();
    }

    public void clickDelete(){
        deleteButton.click();
    }

    public void validateNoStudent(String expectedMessage){
        SoftAssert softAssert = new SoftAssert();
     softAssert.assertEquals(text,expectedMessage);
    }


}
