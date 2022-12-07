package com.uiTestPractice.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.BrowserUtils;

import java.util.Set;

import static utils.DriverHelper.driver;

public class YoutubePage {
    public YoutubePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='yt-spec-touch-feedback-shape__fill']")
    WebElement rejectButton;
    @FindBy(xpath = "//h1[@class='style-scope ytd-watch-metadata']//yt-formatted-string[contains(text(), 'C# Beginner to advanced - Lesson 29 - Delegates')]")
    WebElement title;



    public void switchToYoutube(){
        String mainPageId = driver.getWindowHandle();
        Set<String> allPages = driver.getWindowHandles();

        for(String id : allPages){
            if(!id.equals(mainPageId)){
                driver.switchTo().window(id).manage().window().maximize();
            }
    }
    }
//    public void rejectMethod(){
//        Alert alert = driver.switchTo().alert();
//        alert.dismiss();
//    }

    public void validateTitle(){
        Assert.assertTrue(title.getText().contains("C# Beginner to advanced"));
    }

    public void getLinkText(){
        Assert.assertTrue(driver.getCurrentUrl().contains("youtube"));
        System.out.println(driver.getCurrentUrl());
    }






}
