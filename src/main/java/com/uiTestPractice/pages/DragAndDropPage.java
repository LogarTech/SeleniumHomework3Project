package com.uiTestPractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.BrowserUtils;

import static utils.DriverHelper.driver;

public class DragAndDropPage {

    public DragAndDropPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@id='draggable']")
    WebElement dragMe;

    @FindBy(xpath = "//div[@id='droppable']")
    WebElement dropHere;

    @FindBy(xpath = "//div[@id='droppable']//p[contains(text(), 'Dropped!')]")
    WebElement droppedMessage;

    public void dragDrop(String expectedMessage) {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragMe, dropHere).perform();
        Assert.assertEquals(BrowserUtils.getText(droppedMessage), expectedMessage);
    }
}
