package com.uiTestPractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utils.BrowserUtils;

import static utils.DriverHelper.driver;

public class IframePage extends BrowserUtils {
    public IframePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//iframe[@name='iframe_a']")
    private WebElement frame;

    @FindBy(xpath = "//label[.='Enter your name:']//following-sibling::input[@id='name']")
    private WebElement nameBox;

    @FindBy(xpath = "//a[@target='iframe_a']")
    private WebElement link;

    @FindBy(xpath = "//div[contains(strong/following-sibling::text(),'refused to connect')]")
    private WebElement message;

    public IframePage switchFrame() {
        driver.switchTo().frame(frame);
        return this;
    }

    public IframePage enterName(String name) {
        nameBox.sendKeys(name);
        return this;
    }

    public IframePage switchToParentFrame() {
        driver.switchTo().parentFrame();
        return this;
    }

    public IframePage clickLink() {
        link.click();
        waitForSeconds(3);
        return this;
    }

    public IframePage assertionFinal() {
        Actions actions = new Actions(driver);
        waitForSeconds(2);
        actions.moveToElement(message).perform();
        String actualText = getText(message);
        String expectedText = "www.uitestpractice.com refused to connect.";
        Assert.assertEquals(actualText, expectedText, "Expected text doesn't match actual text");
        return this;
    }
}
