package com.uiTestPractice.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static utils.BrowserUtils.waitForSeconds;
import static utils.DriverHelper.driver;

public class ClickTwoTimesPage {
    public ClickTwoTimesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(text(),'Double Click ME !')]")
    WebElement clickButton;

    public void clickTwice() {
        Actions actions = new Actions(driver);
        waitForSeconds(1);
        actions.doubleClick(clickButton).perform();
    }

    public void alert(String expectedMessage) {
        Alert alert = driver.switchTo().alert();
        waitForSeconds(1);
        Assert.assertEquals(alert.getText(), expectedMessage);
        alert.accept();
    }
}
