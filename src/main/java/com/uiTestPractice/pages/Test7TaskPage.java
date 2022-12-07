package com.uiTestPractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test7TaskPage {
    public Test7TaskPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[contains(text(), 'Click here to watch videos on C#')]")
    WebElement clickLink;


    public void toYoutube(){
        clickLink.click();
    }

}
